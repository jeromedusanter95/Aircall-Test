package com.jeromedusanter.aircalltest.domain.usecases.repogithub

import com.jeromedusanter.aircalltest.domain.base.IUseCase
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import io.reactivex.Single
import javax.inject.Inject

class GetRepoGithubUseCase @Inject constructor(
    private val repository: RepoGithubRepository
) : IUseCase<RepoGithubFilter, Single<List<RepoGithub>>> {

    override fun execute(param: RepoGithubFilter?): Single<List<RepoGithub>> {
        return param?.let { repository.getRepoGithubList(it) }
            ?: Single.error(Throwable("Param should never be null here"))
    }
}