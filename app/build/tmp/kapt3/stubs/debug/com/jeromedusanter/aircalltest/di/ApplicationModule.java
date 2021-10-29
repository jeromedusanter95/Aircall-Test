package com.jeromedusanter.aircalltest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0001\u00a2\u0006\u0002\b\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/jeromedusanter/aircalltest/di/ApplicationModule;", "", "application", "Lcom/jeromedusanter/aircalltest/Application;", "(Lcom/jeromedusanter/aircalltest/Application;)V", "provideContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "provideContext$app_debug", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final com.jeromedusanter.aircalltest.Application application = null;
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext$app_debug() {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.Application application) {
        super();
    }
}