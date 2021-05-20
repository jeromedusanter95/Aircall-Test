package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import com.jeromedusanter.aircalltest.ui.base.IAction

sealed class RepoGithubAction : IAction {
    object NavToRepoGithubDetails : RepoGithubAction()
    object InvalidateOptionsMenu : RepoGithubAction()
}