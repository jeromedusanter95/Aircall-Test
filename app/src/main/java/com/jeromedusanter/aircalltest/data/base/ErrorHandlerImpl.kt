package com.jeromedusanter.aircalltest.data.base

import com.jeromedusanter.aircalltest.domain.base.IErrorHandler
import com.jeromedusanter.aircalltest.domain.base.UseCaseException
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ErrorHandlerImpl @Inject constructor() : IErrorHandler {

    override fun mapThrowableToUseCaseException(throwable: Throwable): UseCaseException {
        return when (throwable) {
            is IOException -> UseCaseException.IOException
            is HttpException -> {
                when (throwable.code()) {
                    //TODO Fill that
                    else -> UseCaseException.Unknown
                }
            }
            else -> UseCaseException.Unknown
        }
    }
}