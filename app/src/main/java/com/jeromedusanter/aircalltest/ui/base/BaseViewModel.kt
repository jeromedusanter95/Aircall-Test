package com.jeromedusanter.aircalltest.ui.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel<BS : IState> : ViewModel() {

    val disposable = CompositeDisposable()

    val state: SingleLiveEvent<BS>
        get() = _state
    private val _state: SingleLiveEvent<BS> = SingleLiveEvent()

    fun dispatch(state: BS) {
        _state.postValue(state)
    }

    override fun onCleared() {
        disposable.clear()
        super.onCleared()
    }
}