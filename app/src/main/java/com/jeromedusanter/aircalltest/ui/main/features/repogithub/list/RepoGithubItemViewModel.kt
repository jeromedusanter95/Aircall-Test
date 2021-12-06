package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.ui.base.BaseItemViewModel

class RepoGithubItemViewModel(private val listener: RepoGithubListAdapter.Listener?) :
    BaseItemViewModel<RepoGithubItemUiModel>() {

     val name = ObservableField("")
     val description = ObservableField("")
     val observableFavoriteIconId = ObservableField<Int>(R.drawable.ic_star)

    override fun onItemChanged(item: RepoGithubItemUiModel) {
        name.set(item.name)
        description.set(item.description)
        val iconId = when (item.isFavorited){
                true -> R.drawable.ic_star_selected
                false -> R.drawable.ic_star
            }
        observableFavoriteIconId.set(iconId)
    }

    override val onItemClick: (RepoGithubItemUiModel, Int) -> Unit
        get() = { item: RepoGithubItemUiModel, _: Int -> listener?.onClickItem(item.id) }

    fun onFavoriteClick(){
        item.isFavorited = !item.isFavorited
        listener?.onFavoriteClick(item.id)
    }
}