package com.jeromedusanter.aircalltest.data.remote.repogithub.mappers

import com.jeromedusanter.aircalltest.data.base.IMapper
import com.jeromedusanter.aircalltest.data.remote.repogithub.models.SortRepoGithubApi
import com.jeromedusanter.aircalltest.domain.models.RepoGithubSort
import javax.inject.Inject

class RepoGithubSortDataMapper @Inject constructor(): IMapper<RepoGithubSort, SortRepoGithubApi, Nothing> {

    override fun mapModelToDataApiModel(model: RepoGithubSort): SortRepoGithubApi {
        return when (model) {
            RepoGithubSort.FORKS -> SortRepoGithubApi.FORKS
            RepoGithubSort.STARS -> SortRepoGithubApi.STARS
            RepoGithubSort.HELP_WANTED_ISSUES -> SortRepoGithubApi.HELP_WANTED_ISSUES
            RepoGithubSort.UPDATED -> SortRepoGithubApi.UPDATED
        }
    }

    override fun mapModelToDataLocalModel(model: RepoGithubSort): Nothing =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapDataApiModelToModel(model: SortRepoGithubApi): RepoGithubSort =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapDataLocalModelToModel(model: Nothing): RepoGithubSort =
        throw Exception("No use case yet for this method, it should never been called")
}