package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import androidx.databinding.ObservableField
import com.jeromedusanter.aircalltest.ui.base.BaseItemViewModel

class RepoGithubItemViewModel(private val listener: RepoGithubListAdapter.Listener?) :
    BaseItemViewModel<RepoGithubListUiModel>() {

     val name = ObservableField("")
     val description = ObservableField("")

    override fun onItemChanged(item: RepoGithubListUiModel) {
        name.set(item.name)
        description.set(item.description)
    }

    override val onItemClick: (RepoGithubListUiModel, Int) -> Unit
        get() = { item: RepoGithubListUiModel, _: Int -> listener?.onClickItem(item.id) }
}