package com.jeromedusanter.aircalltest.domain

import com.jeromedusanter.aircalltest.domain.base.IAction
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter

sealed class MainAction : IAction {
    data class GetRepoGithubListAction(val params: RepoGithubFilter?) : MainAction()
}
