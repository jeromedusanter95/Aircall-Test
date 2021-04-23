package com.jeromedusanter.aircalltest.ui.main.features.repogithub.details

import com.jeromedusanter.aircalltest.ui.base.IUiModel

data class IssueUiModel(
    val week: Int,
    val weekStartDate: String,
    val weekEndDate: String,
    val amount: Int
) : IUiModel