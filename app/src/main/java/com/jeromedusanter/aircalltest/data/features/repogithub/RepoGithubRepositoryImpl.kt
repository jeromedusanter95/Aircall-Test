package com.jeromedusanter.aircalltest.data.features.repogithub

import com.jeromedusanter.aircalltest.data.features.repogithub.datastores.LocalRepoGithubDataStore
import com.jeromedusanter.aircalltest.data.features.repogithub.datastores.RemoteRepoGithubDataStore
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import com.jeromedusanter.aircalltest.domain.models.Issue
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import org.threeten.bp.LocalDateTime
import javax.inject.Inject

class RepoGithubRepositoryImpl @Inject constructor(
    private val remoteRepoGithubDataStore: RemoteRepoGithubDataStore,
    private val localRepoGithubDataStore: LocalRepoGithubDataStore
) : RepoGithubRepository {

    override suspend fun getRepoGithubList(filter: RepoGithubFilter): List<RepoGithub> {
        return remoteRepoGithubDataStore.getRepoGithubList(filter)
    }

    override suspend fun getIssuesByRepoGithub(
        owner: String,
        repo: String,
        since: LocalDateTime
    ): List<Issue> {
        return remoteRepoGithubDataStore.getIssuesByRepoGithub(owner, repo, since)
    }
}