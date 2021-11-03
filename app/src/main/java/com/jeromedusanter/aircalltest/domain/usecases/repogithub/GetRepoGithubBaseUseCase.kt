package com.jeromedusanter.aircalltest.domain.usecases.repogithub

import com.jeromedusanter.aircalltest.domain.base.BaseUseCase
import com.jeromedusanter.aircalltest.domain.base.IErrorHandler
import com.jeromedusanter.aircalltest.domain.base.Result
import com.jeromedusanter.aircalltest.domain.base.SideEffectListener
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import com.jeromedusanter.aircalltest.domain.models.IssuesHistoryByWeek
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import org.threeten.bp.LocalDateTime
import javax.inject.Inject

class GetRepoGithubBaseUseCase @Inject constructor(
    private val repository: RepoGithubRepository,
    errorHandler: IErrorHandler
) : BaseUseCase<GetRepoGithubBaseUseCase.SideEffect, List<RepoGithub>>(errorHandler) {

    override suspend fun execute(
        params: Any?,
        listener: SideEffectListener<SideEffect>?
    ): Result<List<RepoGithub>> {
        return (params as? RepoGithubFilter)?.let {
            val list = repository.getRepoGithubList(it)
            fillEachRepoWithIssuesOpenedBeforeOneYearAgo(list)
            Result.Success(list)
        } ?: throw Throwable("params can't be null")
    }

    private suspend fun fillEachRepoWithIssuesOpenedBeforeOneYearAgo(list: List<RepoGithub>) {
        list.forEach {
            val issuesHistory = mutableListOf<IssuesHistoryByWeek>()
            var weekStartDate = LocalDateTime.now().minusYears(1)
            var weekEndDate = weekStartDate.plusDays(7)
            for (i in 1 until 52) {
                issuesHistory.add(
                    IssuesHistoryByWeek(
                        0,
                        i,
                        weekStartDate,
                        weekEndDate
                    )
                )
                weekStartDate = weekStartDate.plusDays(7)
                weekEndDate = weekEndDate.plusDays(7)
            }

            val result = repository.getIssuesByRepoGithub(
                it.owner,
                it.name,
                LocalDateTime.now().minusYears(1)
            )
            val newList = issuesHistory.map { issuesHistoryByWeek ->
                result.forEach {
                    if (issuesHistoryByWeek.weekStartDate.isBefore(it.createdAt)
                        && issuesHistoryByWeek.weekEndDate.isAfter(it.createdAt)
                    ) {
                        issuesHistoryByWeek.amount++
                    }
                }
                issuesHistoryByWeek
            }.filter { it.amount > 0 }
            it.issuesHistory.addAll(newList)
        }
    }

    sealed class SideEffect {
        object SideEffect1 : SideEffect()
        object SideEffect2 : SideEffect()
        object SideEffect3 : SideEffect()
        object SideEffect4 : SideEffect()
    }
}


