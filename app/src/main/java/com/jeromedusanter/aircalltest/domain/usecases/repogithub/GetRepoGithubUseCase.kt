package com.jeromedusanter.aircalltest.domain.usecases.repogithub

import com.jeromedusanter.aircalltest.domain.base.IUseCase
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import io.reactivex.Single
import javax.inject.Inject

class GetRepoGithubUseCase @Inject constructor(
    private val repository: RepoGithubRepository
) : IUseCase<Boolean, Single<List<RepoGithub>>> {

    override fun execute(param: Boolean): Single<List<RepoGithub>> {
        return repository.getRepoGithub()
    }
}