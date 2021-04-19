package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import com.jeromedusanter.aircalltest.ui.base.BaseState
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel

sealed class RepoGithubState : BaseState {
    object EmptyRepoGithubList : RepoGithubState()
    object ErrorRepoGithubList : RepoGithubState()
    data class SuccessRepoGithubList(val repoGithubListList: List<RepoGithubListUiModel>) : RepoGithubState()
    object LoadingRepoGithubList : RepoGithubState()
    object NavToRepoGithubDetails : RepoGithubState()
}