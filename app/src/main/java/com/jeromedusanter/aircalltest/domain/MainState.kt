package com.jeromedusanter.aircalltest.domain

import com.jeromedusanter.aircalltest.domain.base.IState
import com.jeromedusanter.aircalltest.domain.models.RepoGithub

data class MainState(val repoGitHubList: List<RepoGithub) : IState() {
    companion object {
        fun initialState() = MainState(emptyList())
    }
}