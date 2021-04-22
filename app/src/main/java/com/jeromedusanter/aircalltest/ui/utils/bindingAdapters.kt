package com.jeromedusanter.aircalltest.ui.utils


import androidx.databinding.BindingAdapter
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.jeromedusanter.aircalltest.ui.base.BaseAdapter
import com.jeromedusanter.aircalltest.ui.base.BaseItemViewModel
import com.jeromedusanter.aircalltest.ui.base.UiModel

@BindingAdapter("app:list")
internal fun setList(view: RecyclerView, list: List<UiModel>?) {
    val adapter = view.adapter as? BaseAdapter<ViewDataBinding, UiModel, BaseItemViewModel<UiModel>>
    adapter?.addItems(list ?: emptyList(), clear = true)
}