package com.jeromedusanter.aircalltest.domain.base

import com.jeromedusanter.aircalltest.domain.MainState
import io.reactivex.Observable

abstract class Store<A : IAction>(var state: MainState) {

    fun <S> dispatch(action: A): Observable<S> {
        return reduce(state, action) as Observable<S>
    }

    abstract fun reduce(oldState: MainState, action: A): Observable<*>
}
