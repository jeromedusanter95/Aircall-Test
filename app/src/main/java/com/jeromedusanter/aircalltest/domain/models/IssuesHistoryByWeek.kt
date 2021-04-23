package com.jeromedusanter.aircalltest.domain.models

import com.jeromedusanter.aircalltest.domain.base.IModel
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime

data class IssuesHistoryByWeek(
    var amount: Int,
    val week: Int,
    val weekStartDate: LocalDateTime,
    val weekEndDate: LocalDateTime
) : IModel