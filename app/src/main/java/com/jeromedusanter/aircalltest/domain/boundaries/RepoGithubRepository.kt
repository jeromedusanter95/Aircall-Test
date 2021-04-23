package com.jeromedusanter.aircalltest.domain.boundaries

import com.jeromedusanter.aircalltest.domain.models.Issue
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import io.reactivex.Single
import org.threeten.bp.LocalDateTime

interface RepoGithubRepository {
    fun getRepoGithubList(filter: RepoGithubFilter): Single<List<RepoGithub>>
    fun getIssuesByRepoGithub(
        owner: String,
        repo: String,
        since: LocalDateTime
    ): Single<List<Issue>>
}