package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter

import androidx.annotation.StringRes
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.ui.base.IUiModel

enum class RepoGithubSortUiModel(@StringRes val titleId: Int) : IUiModel{
    STARS(R.string.repo_github_sort_stars),
    FORKS(R.string.repo_github_sort_forks),
    HELP_WANTED_ISSUES(R.string.repo_github_sort_help_wanted_issues),
    UPDATED(R.string.repo_github_sort_updated);

    companion object {
        fun fromOrdinal(ordinal: Int) = values().find { it.ordinal == ordinal }
    }
}