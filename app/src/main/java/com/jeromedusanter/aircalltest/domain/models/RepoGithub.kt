package com.jeromedusanter.aircalltest.domain.models

import com.jeromedusanter.aircalltest.domain.base.IModel
import org.threeten.bp.LocalDate

data class RepoGithub(
    val id: Long,
    val name: String,
    val url: String,
    val owner : String,
    val description: String,
    val private: Boolean,
    val createdAt: LocalDate,
    val watchersCount: Int,
    val stargazersCount: Int,
    val forksCount: Int,
    val issuesHistory: MutableList<IssuesHistoryByWeek>,
    var isFavorited:Boolean = false
) : IModel