package com.jeromedusanter.aircalltest.domain.base

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

abstract class BaseUseCase<T, R>(private val errorHandler: IErrorHandler) {
    protected abstract suspend fun execute(
        params: Any?,
        listener: SideEffectListener<T>? = null
    ): Result<R>

    suspend fun tryExecute(
        params: Any?,
        listener: SideEffectListener<T>? = null
    ): Result<R> {
        return withContext(Dispatchers.IO) {
            try {
                execute(params, listener)
            } catch (t: Throwable) {
                t.printStackTrace()
                Result.Error(errorHandler.mapThrowableToUseCaseException(t))
            }
        }
    }
}

sealed class UseCaseException : Throwable() {
    object NoNetwork : UseCaseException()
    object HttpException : UseCaseException()
    object IOException : UseCaseException()
    object Unknown : UseCaseException()
}

sealed class Result<out R> {
    data class Success<R>(val data: R) : Result<R>()
    data class Error(val exception: UseCaseException) : Result<Nothing>()
}

class SideEffectListener<T>(
    private val scope: CoroutineScope,
    private val block: (T) -> Unit
) {
    fun onSideEffect(sideEffect: T) = scope.launch(Dispatchers.Main) { block.invoke(sideEffect) }
}