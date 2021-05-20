package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import com.jeromedusanter.aircalltest.ui.base.IAction

sealed class RepoGithubAction : IAction {
    object NavToRepoGithubDetails : RepoGithubAction()
    object InvalidateOptionsMenu : RepoGithubAction()
    object DismissFilterDialog : RepoGithubAction()
    object HideKeyBoard : RepoGithubAction()
    data class ShowErrorQueryError(val showError: Boolean) : RepoGithubAction()
    data class ShowErrorPerPageError(val showError: Boolean) : RepoGithubAction()
}