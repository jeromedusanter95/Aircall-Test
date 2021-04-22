package com.jeromedusanter.aircalltest.ui.base

import com.jeromedusanter.aircalltest.domain.base.IModel

interface Mapper<E : IModel, U : UiModel> {
    fun toUiModel(model: E): U
    fun toModel(uiModel: U): E
}