package com.jeromedusanter.aircalltest.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0015\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/base/IMapper;", "E", "Lcom/jeromedusanter/aircalltest/domain/base/IModel;", "U", "Lcom/jeromedusanter/aircalltest/ui/base/IUiModel;", "", "mapModelToUiModel", "model", "(Lcom/jeromedusanter/aircalltest/domain/base/IModel;)Lcom/jeromedusanter/aircalltest/ui/base/IUiModel;", "mapUiModelToModel", "(Lcom/jeromedusanter/aircalltest/ui/base/IUiModel;)Lcom/jeromedusanter/aircalltest/domain/base/IModel;", "app_debug"})
public abstract interface IMapper<E extends com.jeromedusanter.aircalltest.domain.base.IModel, U extends com.jeromedusanter.aircalltest.ui.base.IUiModel> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract U mapModelToUiModel(@org.jetbrains.annotations.NotNull()
    E model);
    
    @org.jetbrains.annotations.NotNull()
    public abstract E mapUiModelToModel(@org.jetbrains.annotations.NotNull()
    U model);
}