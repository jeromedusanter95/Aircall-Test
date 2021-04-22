package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import com.jeromedusanter.aircalltest.ui.base.IState
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel

sealed class RepoGithubState : IState {
    object EmptyRepoGithubList : RepoGithubState()
    object ErrorRepoGithubList : RepoGithubState()
    object SuccessRepoGithubList : RepoGithubState()
    object LoadingRepoGithubList : RepoGithubState()
    object NavToRepoGithubDetails : RepoGithubState()
}