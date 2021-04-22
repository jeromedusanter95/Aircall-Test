package com.jeromedusanter.aircalltest.data.remote

import com.jeromedusanter.aircalltest.data.features.repogithub.RepoGithubDataSource
import com.jeromedusanter.aircalltest.data.features.repogithub.RepoGithubMapper
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import io.reactivex.Single
import javax.inject.Inject

class RepoGithubRemoteDataSource @Inject constructor(
    private val apiService: ApiService,
    private val mapper: RepoGithubMapper
) : RepoGithubDataSource {

    override fun getRepoGithubList(): Single<List<RepoGithub>> {
        val QUERY_SORT = "stars"
        val QUERY_ORDER = "desc"
        val QUERY_API = "android"
        return apiService.fetchRepositories(QUERY_SORT, QUERY_ORDER, 1, 10, QUERY_API)
            .map { it.repoGithubApiList.map { mapper.mapDataApiModelToModel(it) } }
    }
}