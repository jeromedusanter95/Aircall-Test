package com.jeromedusanter.aircalltest.domain.base

interface IUseCase<I, O> {
    fun execute(param: I): O
}