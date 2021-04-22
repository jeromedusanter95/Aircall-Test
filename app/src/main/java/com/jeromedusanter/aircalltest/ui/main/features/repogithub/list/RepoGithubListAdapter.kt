package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.ItemRepoGithubBinding
import com.jeromedusanter.aircalltest.ui.base.BaseAdapter

class RepoGithubListAdapter(
    private val listener: Listener? = null
) : BaseAdapter<ItemRepoGithubBinding, RepoGithubItemUiModel, RepoGithubItemViewModel>(
    R.layout.item_repo_github
) {
    override fun createViewModel(): RepoGithubItemViewModel = RepoGithubItemViewModel(listener)

    interface Listener {
        fun onClickItem(itemId: Long)
    }
}