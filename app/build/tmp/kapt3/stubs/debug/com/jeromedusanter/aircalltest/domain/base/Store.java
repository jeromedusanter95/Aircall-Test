package com.jeromedusanter.aircalltest.domain.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0001\u0010\f2\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/jeromedusanter/aircalltest/domain/base/Store;", "A", "Lcom/jeromedusanter/aircalltest/domain/base/IAction;", "", "state", "Lcom/jeromedusanter/aircalltest/domain/MainState;", "(Lcom/jeromedusanter/aircalltest/domain/MainState;)V", "getState", "()Lcom/jeromedusanter/aircalltest/domain/MainState;", "setState", "dispatch", "Lio/reactivex/Observable;", "S", "action", "(Lcom/jeromedusanter/aircalltest/domain/base/IAction;)Lio/reactivex/Observable;", "reduce", "oldState", "(Lcom/jeromedusanter/aircalltest/domain/MainState;Lcom/jeromedusanter/aircalltest/domain/base/IAction;)Lio/reactivex/Observable;", "app_debug"})
public abstract class Store<A extends com.jeromedusanter.aircalltest.domain.base.IAction> {
    @org.jetbrains.annotations.NotNull()
    private com.jeromedusanter.aircalltest.domain.MainState state;
    
    @org.jetbrains.annotations.NotNull()
    public final <S extends java.lang.Object>io.reactivex.Observable<S> dispatch(@org.jetbrains.annotations.NotNull()
    A action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<?> reduce(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.MainState oldState, @org.jetbrains.annotations.NotNull()
    A action);
    
    @org.jetbrains.annotations.NotNull()
    public final com.jeromedusanter.aircalltest.domain.MainState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.MainState p0) {
    }
    
    public Store(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.MainState state) {
        super();
    }
}