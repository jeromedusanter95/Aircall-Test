package com.jeromedusanter.aircalltest.ui.base

import com.jeromedusanter.aircalltest.domain.base.IModel

interface IMapper<E : IModel, U : IUiModel> {
    fun mapModelToUiModel(model: E): U
    fun mapUiModelToModel(model: U): E
}