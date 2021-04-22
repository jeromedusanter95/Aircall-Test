package com.jeromedusanter.aircalltest.ui.main.features.repogithub.details

import com.jeromedusanter.aircalltest.ui.base.IUiModel

data class RepoGithubDetailsUiModel(
    val name: String,
    val description: String,
    val watchersCount: String,
    val stargazersCount: String,
    val forksCount: String
) : IUiModel