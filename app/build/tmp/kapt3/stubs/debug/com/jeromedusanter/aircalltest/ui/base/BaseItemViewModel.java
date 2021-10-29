package com.jeromedusanter.aircalltest.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\u0015\u001a\u00020\u00112\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u001c\u0010\b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/base/BaseItemViewModel;", "O", "Lcom/jeromedusanter/aircalltest/ui/base/IUiModel;", "Landroidx/databinding/BaseObservable;", "()V", "isSelected", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "item", "getItem", "()Lcom/jeromedusanter/aircalltest/ui/base/IUiModel;", "setItem", "(Lcom/jeromedusanter/aircalltest/ui/base/IUiModel;)V", "Lcom/jeromedusanter/aircalltest/ui/base/IUiModel;", "onItemClick", "Lkotlin/Function2;", "", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function2;", "onItemChanged", "setNewItem", "", "(Lcom/jeromedusanter/aircalltest/ui/base/IUiModel;Z)V", "app_debug"})
public abstract class BaseItemViewModel<O extends com.jeromedusanter.aircalltest.ui.base.IUiModel> extends androidx.databinding.BaseObservable {
    protected O item;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isSelected = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final O getItem() {
        return null;
    }
    
    protected final void setItem(@org.jetbrains.annotations.NotNull()
    O p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract kotlin.jvm.functions.Function2<O, java.lang.Integer, kotlin.Unit> getOnItemClick();
    
    public final void setNewItem(@org.jetbrains.annotations.NotNull()
    O item, boolean isSelected) {
    }
    
    public abstract void onItemChanged(@org.jetbrains.annotations.NotNull()
    O item);
    
    public BaseItemViewModel() {
        super();
    }
}