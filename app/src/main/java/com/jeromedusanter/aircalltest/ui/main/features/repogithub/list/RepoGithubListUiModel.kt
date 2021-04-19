package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import com.jeromedusanter.aircalltest.ui.base.UiModel

data class RepoGithubListUiModel(
    val id: Long,
    val name: String,
    val description: String,
    val private: Boolean,
    val createdAt: String
) : UiModel