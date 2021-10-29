package com.jeromedusanter.aircalltest.data.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0002H&\u00a2\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/jeromedusanter/aircalltest/data/base/IMapper;", "M", "Lcom/jeromedusanter/aircalltest/domain/base/IModel;", "AM", "Lcom/jeromedusanter/aircalltest/data/base/IDataApiModel;", "LM", "Lcom/jeromedusanter/aircalltest/data/base/IDataLocalModel;", "", "mapDataApiModelToModel", "model", "(Lcom/jeromedusanter/aircalltest/data/base/IDataApiModel;)Lcom/jeromedusanter/aircalltest/domain/base/IModel;", "mapDataLocalModelToModel", "(Lcom/jeromedusanter/aircalltest/data/base/IDataLocalModel;)Lcom/jeromedusanter/aircalltest/domain/base/IModel;", "mapModelToDataApiModel", "(Lcom/jeromedusanter/aircalltest/domain/base/IModel;)Lcom/jeromedusanter/aircalltest/data/base/IDataApiModel;", "mapModelToDataLocalModel", "(Lcom/jeromedusanter/aircalltest/domain/base/IModel;)Lcom/jeromedusanter/aircalltest/data/base/IDataLocalModel;", "app_debug"})
public abstract interface IMapper<M extends com.jeromedusanter.aircalltest.domain.base.IModel, AM extends com.jeromedusanter.aircalltest.data.base.IDataApiModel, LM extends com.jeromedusanter.aircalltest.data.base.IDataLocalModel> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract AM mapModelToDataApiModel(@org.jetbrains.annotations.NotNull()
    M model);
    
    @org.jetbrains.annotations.NotNull()
    public abstract LM mapModelToDataLocalModel(@org.jetbrains.annotations.NotNull()
    M model);
    
    @org.jetbrains.annotations.NotNull()
    public abstract M mapDataApiModelToModel(@org.jetbrains.annotations.NotNull()
    AM model);
    
    @org.jetbrains.annotations.NotNull()
    public abstract M mapDataLocalModelToModel(@org.jetbrains.annotations.NotNull()
    LM model);
}