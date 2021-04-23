package com.jeromedusanter.aircalltest.ui.main.features.repogithub.details

import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.ItemIssueBinding
import com.jeromedusanter.aircalltest.ui.base.BaseAdapter

class IssueAdapter : BaseAdapter<ItemIssueBinding, IssueUiModel, IssueItemViewModel>(R.layout.item_issue) {

    override fun createViewModel(): IssueItemViewModel = IssueItemViewModel()
}