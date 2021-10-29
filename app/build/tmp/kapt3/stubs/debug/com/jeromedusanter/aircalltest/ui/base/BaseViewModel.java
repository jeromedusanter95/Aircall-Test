package com.jeromedusanter.aircalltest.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00028\u0000H\u0004\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00018\u00008\u00000\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/base/BaseViewModel;", "A", "Lcom/jeromedusanter/aircalltest/ui/base/IAction;", "Landroidx/lifecycle/ViewModel;", "()V", "_action", "Landroidx/lifecycle/MutableLiveData;", "action", "Landroidx/lifecycle/LiveData;", "getAction", "()Landroidx/lifecycle/LiveData;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "publisher", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "dispatch", "", "(Lcom/jeromedusanter/aircalltest/ui/base/IAction;)V", "onCleared", "app_debug"})
public abstract class BaseViewModel<A extends com.jeromedusanter.aircalltest.ui.base.IAction> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final androidx.lifecycle.MutableLiveData<A> _action = null;
    private final io.reactivex.subjects.PublishSubject<A> publisher = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<A> getAction() {
        return null;
    }
    
    protected final void dispatch(@org.jetbrains.annotations.NotNull()
    A action) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}