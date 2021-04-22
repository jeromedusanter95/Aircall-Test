package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import androidx.databinding.ObservableField
import com.jeromedusanter.aircalltest.ui.base.BaseItemViewModel

class RepoGithubItemViewModel(private val listener: RepoGithubListAdapter.Listener?) :
    BaseItemViewModel<RepoGithubItemUiModel>() {

     val name = ObservableField("")
     val description = ObservableField("")

    override fun onItemChanged(item: RepoGithubItemUiModel) {
        name.set(item.name)
        description.set(item.description)
    }

    override val onItemClick: (RepoGithubItemUiModel, Int) -> Unit
        get() = { item: RepoGithubItemUiModel, _: Int -> listener?.onClickItem(item.id) }
}