package com.jeromedusanter.aircalltest.ui.main.features.repogithub.details

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import com.jeromedusanter.aircalltest.ui.base.BaseItemViewModel

class IssueItemViewModel : BaseItemViewModel<IssueUiModel>() {

    val week = ObservableInt()
    val weekStartDate = ObservableField("")
    val weekEndDate = ObservableField("")
    val amount = ObservableInt()

    override fun onItemChanged(item: IssueUiModel) {
        week.set(item.week)
        weekStartDate.set(item.weekStartDate)
        weekEndDate.set(item.weekEndDate)
        amount.set(item.amount)
    }

    override val onItemClick: ((IssueUiModel, Int) -> Unit)? = null
}