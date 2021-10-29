package com.jeromedusanter.aircalltest.domain.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0004\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jeromedusanter/aircalltest/domain/base/IUseCase;", "I", "O", "", "execute", "param", "(Ljava/lang/Object;)Ljava/lang/Object;", "app_debug"})
public abstract interface IUseCase<I extends java.lang.Object, O extends java.lang.Object> {
    
    public abstract O execute(@org.jetbrains.annotations.Nullable()
    I param);
}