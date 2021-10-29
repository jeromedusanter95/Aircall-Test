package com.jeromedusanter.aircalltest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/jeromedusanter/aircalltest/di/ComponentManager;", "", "()V", "applicationComponent", "Lcom/jeromedusanter/aircalltest/di/ApplicationComponent;", "getApplicationComponent$app_debug", "()Lcom/jeromedusanter/aircalltest/di/ApplicationComponent;", "setApplicationComponent$app_debug", "(Lcom/jeromedusanter/aircalltest/di/ApplicationComponent;)V", "init", "", "application", "Lcom/jeromedusanter/aircalltest/Application;", "retrofit", "Lretrofit2/Retrofit;", "initApplicationComponent", "applicationModule", "Lcom/jeromedusanter/aircalltest/di/ApplicationModule;", "retrofitModule", "Lcom/jeromedusanter/aircalltest/di/RetrofitModule;", "app_debug"})
public final class ComponentManager {
    public static com.jeromedusanter.aircalltest.di.ApplicationComponent applicationComponent;
    @org.jetbrains.annotations.NotNull()
    public static final com.jeromedusanter.aircalltest.di.ComponentManager INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jeromedusanter.aircalltest.di.ApplicationComponent getApplicationComponent$app_debug() {
        return null;
    }
    
    public final void setApplicationComponent$app_debug(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.di.ApplicationComponent p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.Application application, @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
    }
    
    private final void initApplicationComponent(com.jeromedusanter.aircalltest.di.ApplicationModule applicationModule, com.jeromedusanter.aircalltest.di.RetrofitModule retrofitModule) {
    }
    
    private ComponentManager() {
        super();
    }
}