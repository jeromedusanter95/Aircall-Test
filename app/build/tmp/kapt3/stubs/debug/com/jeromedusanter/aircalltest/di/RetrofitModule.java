package com.jeromedusanter.aircalltest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0003H\u0001\u00a2\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/jeromedusanter/aircalltest/di/RetrofitModule;", "", "retrofit", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)V", "provideDataService", "Lcom/jeromedusanter/aircalltest/data/remote/ApiService;", "provideDataService$app_debug", "provideRetrofit", "provideRetrofit$app_debug", "app_debug"})
@dagger.Module()
public final class RetrofitModule {
    private final retrofit2.Retrofit retrofit = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.jeromedusanter.aircalltest.data.remote.ApiService provideDataService$app_debug() {
        return null;
    }
    
    public RetrofitModule(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        super();
    }
}