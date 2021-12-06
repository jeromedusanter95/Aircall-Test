package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import com.jeromedusanter.aircalltest.ui.base.IUiModel

data class RepoGithubItemUiModel(
    val id: Long,
    val name: String,
    val description: String,
    val private: Boolean,
    val createdAt: String,
    var isFavorited : Boolean
) : IUiModel
