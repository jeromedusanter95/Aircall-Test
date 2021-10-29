package com.jeromedusanter.aircalltest.data.remote.repogithub

import com.jeromedusanter.aircalltest.data.remote.ApiService
import com.jeromedusanter.aircalltest.data.remote.repogithub.mappers.IssueDataMapper
import com.jeromedusanter.aircalltest.data.remote.repogithub.mappers.RepoGithubDataMapper
import com.jeromedusanter.aircalltest.data.remote.repogithub.mappers.RepoGithubSortDataMapper
import com.jeromedusanter.aircalltest.data.utils.toDatabaseFormatString
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import com.jeromedusanter.aircalltest.domain.models.Issue
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import com.jeromedusanter.aircalltest.domain.models.RepoGithubSort
import io.reactivex.Single
import org.threeten.bp.LocalDateTime
import javax.inject.Inject

class RepoGithubRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val repoGithubMapper: RepoGithubDataMapper,
    private val sortMapper: RepoGithubSortDataMapper,
    private val issueMapper: IssueDataMapper
) : RepoGithubRepository {

    override fun getRepoGithubList(filter: RepoGithubFilter): Single<List<RepoGithub>> {
        return apiService.fetchRepositories(
            sort = sortMapper.mapModelToDataApiModel(filter.sort).serverValue,
            perPage = filter.perPage,
            query = filter.query
        )
            .map { it.items.map { repoGithubMapper.mapDataApiModelToModel(it) } }
    }

    override fun getIssuesByRepoGithub(
        owner: String,
        repo: String,
        since: LocalDateTime
    ): Single<List<Issue>> {
        return apiService.fetchIssuesByRepo(
            owner = owner,
            repo = repo,
            since = since.toDatabaseFormatString(),
            page = 1,
            perPage = 100
        )
            .map { it.map { issueMapper.mapDataApiModelToModel(it) } }
    }
}