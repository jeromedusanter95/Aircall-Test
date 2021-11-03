package com.jeromedusanter.aircalltest.data.features.repogithub.datastores

import com.jeromedusanter.aircalltest.data.remote.ApiService
import com.jeromedusanter.aircalltest.data.features.repogithub.mappers.IssueDataMapper
import com.jeromedusanter.aircalltest.data.features.repogithub.mappers.RepoGithubDataMapper
import com.jeromedusanter.aircalltest.data.features.repogithub.mappers.RepoGithubSortDataMapper
import com.jeromedusanter.aircalltest.data.utils.toDatabaseFormatString
import com.jeromedusanter.aircalltest.domain.models.Issue
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import org.threeten.bp.LocalDateTime
import javax.inject.Inject

class RemoteRepoGithubDataStore @Inject constructor(
    private val apiService: ApiService,
    private val repoGithubMapper: RepoGithubDataMapper,
    private val sortMapper: RepoGithubSortDataMapper,
    private val issueMapper: IssueDataMapper
) {

    suspend fun getRepoGithubList(filter: RepoGithubFilter): List<RepoGithub> {
        return apiService.fetchRepositories(
            sort = sortMapper.mapModelToDataApiModel(filter.sort).serverValue,
            perPage = filter.perPage,
            query = filter.query
        )
            .items.map { repoGithubMapper.mapDataApiModelToModel(it) }
    }

    suspend fun getIssuesByRepoGithub(
        owner: String,
        repo: String,
        since: LocalDateTime
    ): List<Issue> {
        return apiService.fetchIssuesByRepo(
            owner = owner,
            repo = repo,
            since = since.toDatabaseFormatString(),
            page = 1,
            perPage = 100
        )
            .map { issueMapper.mapDataApiModelToModel(it) }
    }
}