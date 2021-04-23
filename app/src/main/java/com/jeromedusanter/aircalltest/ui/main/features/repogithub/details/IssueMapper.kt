package com.jeromedusanter.aircalltest.ui.main.features.repogithub.details

import com.jeromedusanter.aircalltest.domain.models.IssuesHistoryByWeek
import com.jeromedusanter.aircalltest.ui.base.IMapper
import com.jeromedusanter.aircalltest.ui.utils.toFormattedStringWithPattern
import javax.inject.Inject

class IssueMapper @Inject constructor() : IMapper<IssuesHistoryByWeek, IssueUiModel> {

    override fun mapModelToUiModel(model: IssuesHistoryByWeek): IssueUiModel {
        return IssueUiModel(
            week = model.week,
            weekStartDate = model.weekStartDate.toFormattedStringWithPattern("dd/MM/yyyy"),
            weekEndDate = model.weekEndDate.toFormattedStringWithPattern("dd/MM/yyyy"),
            amount = model.amount
        )
    }

    override fun mapUiModelToModel(model: IssueUiModel): IssuesHistoryByWeek =
        throw Exception("No use case yet for this method, it should never been called")
}