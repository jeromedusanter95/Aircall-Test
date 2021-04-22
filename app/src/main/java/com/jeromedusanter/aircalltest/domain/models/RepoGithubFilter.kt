package com.jeromedusanter.aircalltest.domain.models

import com.jeromedusanter.aircalltest.domain.base.IModel

data class RepoGithubFilter(
    val sort: RepoGithubSort?,
    val order: String?,
    val perPage: Long?,
    val query: String?
) : IModel