package com.jeromedusanter.aircalltest.data.remote.repogithub

import com.jeromedusanter.aircalltest.data.remote.ApiService
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import io.reactivex.Single
import javax.inject.Inject

class RepoGithubRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val repoGithubMapper: RepoGithubDataMapper,
    private val sortMapper: SortRepoGithubMapper
) : RepoGithubRepository {

    override fun getRepoGithubList(filter: RepoGithubFilter?): Single<List<RepoGithub>> {
        return apiService.fetchRepositories(
            sort = filter?.sort?.let { sortMapper.mapModelToDataApiModel(it).serverValue },
            order = filter?.order,
            perPage = filter?.perPage,
            query = filter?.query ?: "ANDROID"
        )
            .map { it.items.map { repoGithubMapper.mapDataApiModelToModel(it) } }
    }
}