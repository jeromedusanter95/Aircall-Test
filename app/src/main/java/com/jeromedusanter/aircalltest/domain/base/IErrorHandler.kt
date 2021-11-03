package com.jeromedusanter.aircalltest.domain.base

interface IErrorHandler {
    fun mapThrowableToUseCaseException(throwable: Throwable): UseCaseException
}