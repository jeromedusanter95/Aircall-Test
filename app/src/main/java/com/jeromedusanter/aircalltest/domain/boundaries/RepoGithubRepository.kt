package com.jeromedusanter.aircalltest.domain.boundaries

import com.jeromedusanter.aircalltest.domain.models.Issue
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import org.threeten.bp.LocalDateTime

interface RepoGithubRepository {
    suspend fun getRepoGithubList(filter: RepoGithubFilter): List<RepoGithub>
    suspend fun getIssuesByRepoGithub(owner: String, repo: String, since: LocalDateTime): List<Issue>
}