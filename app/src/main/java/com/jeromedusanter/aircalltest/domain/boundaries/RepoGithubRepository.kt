package com.jeromedusanter.aircalltest.domain.boundaries

import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import io.reactivex.Single

interface RepoGithubRepository {
    fun getRepoGithub(): Single<List<RepoGithub>>
}