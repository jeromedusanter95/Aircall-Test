package com.jeromedusanter.aircalltest.data.base

import com.jeromedusanter.aircalltest.domain.base.IModel

internal interface IMapper<M : IModel, AM : IDataApiModel, LM : IDataLocalModel> {
    fun mapModelToDataApiModel(model: M): AM
    fun mapModelToDataLocalModel(model: M): LM
    fun mapDataApiModelToModel(model: AM): M
    fun mapDataLocalModelToModel(model: LM): M
}