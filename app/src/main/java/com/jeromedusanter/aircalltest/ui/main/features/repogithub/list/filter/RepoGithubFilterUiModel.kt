package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter

import com.jeromedusanter.aircalltest.ui.base.IUiModel

data class RepoGithubFilterUiModel(
    val sort: RepoGithubSortUiModel?,
    val order: String?,
    val perPage: Long?,
    val query: String?
) : IUiModel