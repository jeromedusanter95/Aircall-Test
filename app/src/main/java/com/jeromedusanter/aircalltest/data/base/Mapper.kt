package com.jeromedusanter.aircalltest.data.base

import com.jeromedusanter.aircalltest.domain.base.Model

internal interface Mapper<E : Model, A : ApiModel> {
    fun toApiModel(model: E): A
    fun toModel(apiModel: A): E
}