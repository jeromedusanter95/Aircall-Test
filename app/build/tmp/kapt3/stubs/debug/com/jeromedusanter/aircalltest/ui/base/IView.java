package com.jeromedusanter.aircalltest.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/base/IView;", "A", "Lcom/jeromedusanter/aircalltest/ui/base/IAction;", "", "onAction", "", "action", "(Lcom/jeromedusanter/aircalltest/ui/base/IAction;)V", "app_debug"})
public abstract interface IView<A extends com.jeromedusanter.aircalltest.ui.base.IAction> {
    
    public abstract void onAction(@org.jetbrains.annotations.NotNull()
    A action);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static <A extends com.jeromedusanter.aircalltest.ui.base.IAction>void onAction(@org.jetbrains.annotations.NotNull()
        com.jeromedusanter.aircalltest.ui.base.IView<A> $this, @org.jetbrains.annotations.NotNull()
        A action) {
        }
    }
}