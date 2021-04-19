package com.jeromedusanter.aircalltest.data.features.repogithub

import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Named

class RepoGithubRepositoryImpl @Inject constructor(
    @Named("RepoGithubRemoteDataSource") private val repoGithubLocalDataSource: RepoGithubDataSource
) : RepoGithubRepository {

    override fun getRepoGithub(): Single<List<RepoGithub>> {
        return repoGithubLocalDataSource.getRepoGithubList()
    }
}