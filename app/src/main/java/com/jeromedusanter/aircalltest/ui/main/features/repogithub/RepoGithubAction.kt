package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import com.jeromedusanter.aircalltest.ui.base.IUiAction

sealed class RepoGithubAction : IUiAction {
    object NavToRepoGithubDetails : RepoGithubAction()
    object InvalidateOptionsMenu : RepoGithubAction()
    data class displayFavoriteStatus(val IsFavorited:Boolean) : RepoGithubAction()
    data class ShowErrorQueryError(val showError: Boolean) : RepoGithubAction()
    data class ShowErrorPerPageError(val showError: Boolean) : RepoGithubAction()
}