package com.jeromedusanter.aircalltest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/jeromedusanter/aircalltest/di/ApplicationComponent;", "", "inject", "", "application", "Lcom/jeromedusanter/aircalltest/Application;", "app_debug"})
@dagger.Component(modules = {com.jeromedusanter.aircalltest.di.ApplicationModule.class, com.jeromedusanter.aircalltest.di.ActivityModule.class, com.jeromedusanter.aircalltest.di.FragmentModule.class, com.jeromedusanter.aircalltest.di.ViewModelModule.class, dagger.android.support.AndroidSupportInjectionModule.class, com.jeromedusanter.aircalltest.di.RetrofitModule.class, com.jeromedusanter.aircalltest.di.RepositoryModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.Application application);
}