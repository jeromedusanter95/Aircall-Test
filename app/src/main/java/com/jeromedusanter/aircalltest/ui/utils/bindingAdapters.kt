package com.jeromedusanter.aircalltest.ui.utils


import android.view.View
import androidx.databinding.BindingAdapter
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.jeromedusanter.aircalltest.ui.base.BaseAdapter
import com.jeromedusanter.aircalltest.ui.base.BaseItemViewModel
import com.jeromedusanter.aircalltest.ui.base.IUiModel
import cz.kinst.jakub.view.StatefulLayout

@BindingAdapter("app:list")
internal fun setList(view: RecyclerView, list: List<IUiModel>?) {
    val adapter =
        view.adapter as? BaseAdapter<ViewDataBinding, IUiModel, BaseItemViewModel<IUiModel>>
    adapter?.addItems(list ?: emptyList(), clear = true)
}

@BindingAdapter("app:uiState")
internal fun setUiState(view: StatefulLayout, state: String) {
    view.state = state
}

@BindingAdapter("app:visibleOrGone")
fun setVisibility(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}