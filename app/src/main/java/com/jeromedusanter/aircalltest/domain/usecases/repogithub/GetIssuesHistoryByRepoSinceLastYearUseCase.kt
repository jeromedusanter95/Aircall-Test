package com.jeromedusanter.aircalltest.domain.usecases.repogithub

import com.jeromedusanter.aircalltest.domain.base.IUseCase
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import com.jeromedusanter.aircalltest.domain.models.IssuesHistoryByWeek
import io.reactivex.Single
import org.threeten.bp.LocalDateTime
import javax.inject.Inject

class GetIssuesHistoryByRepoSinceLastYearUseCase @Inject constructor(
    private val repository: RepoGithubRepository
) : IUseCase<Pair<String, String>, Single<List<IssuesHistoryByWeek>>> {

    override fun execute(param: Pair<String, String>?): Single<List<IssuesHistoryByWeek>> {
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

        return param?.let {
            repository.getIssuesByRepoGithub(
                param.first,
                param.second,
                LocalDateTime.now().minusYears(1)
            )
                .map { issueList ->
                    issuesHistory.map { issuesHistoryByWeek ->
                        issueList.forEach {
                            if (issuesHistoryByWeek.weekStartDate.isBefore(it.createdAt)
                                && issuesHistoryByWeek.weekEndDate.isAfter(it.createdAt)
                            ) {
                                issuesHistoryByWeek.amount++
                            }
                        }
                        issuesHistoryByWeek
                    }
                }
                .map { it.filter { it.amount > 0 } }
        }
            ?: Single.error(Throwable("Param should never be null here"))
    }
}


