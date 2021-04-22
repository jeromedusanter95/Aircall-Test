package com.jeromedusanter.aircalltest.domain.models

import com.jeromedusanter.aircalltest.domain.base.IModel

data class RepoGithubFilter(
    val sort: RepoGithubSort,
    val perPage: Long,
    val query: String
) : IModel {

    companion object {
        fun newDefaultInstance(): RepoGithubFilter = RepoGithubFilter(RepoGithubSort.STARS, 5, "q")
    }
}