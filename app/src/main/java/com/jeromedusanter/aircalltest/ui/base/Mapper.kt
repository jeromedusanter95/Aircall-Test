package com.jeromedusanter.aircalltest.ui.base

import com.jeromedusanter.aircalltest.domain.base.Model

interface Mapper<E : Model, U : UiModel> {
    fun toUiModel(model: E): U
    fun toModel(uiModel: U): E
}