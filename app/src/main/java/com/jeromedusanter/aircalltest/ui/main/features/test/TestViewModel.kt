package com.jeromedusanter.aircalltest.ui.main.features.test

import com.jeromedusanter.aircalltest.domain.MainStore
import com.jeromedusanter.aircalltest.ui.base.BaseViewModel
import com.jeromedusanter.aircalltest.ui.base.IAction
import javax.inject.Inject

class TestViewModel @Inject constructor(
    private val mainStore: MainStore
) : BaseViewModel<IAction>() {

    fun getRepoList() {
        mainStore.state.repoGitHubList
    }
}