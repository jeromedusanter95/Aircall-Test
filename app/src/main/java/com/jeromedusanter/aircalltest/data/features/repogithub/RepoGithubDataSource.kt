package com.jeromedusanter.aircalltest.data.features.repogithub

import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import io.reactivex.Single

interface RepoGithubDataSource {
    fun getRepoGithubList(): Single<List<RepoGithub>>
}