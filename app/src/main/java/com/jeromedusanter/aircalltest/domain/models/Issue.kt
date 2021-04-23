package com.jeromedusanter.aircalltest.domain.models

import com.jeromedusanter.aircalltest.domain.base.IModel
import org.threeten.bp.LocalDateTime

data class Issue(
    val id: Int,
    val createdAt: LocalDateTime
) : IModel