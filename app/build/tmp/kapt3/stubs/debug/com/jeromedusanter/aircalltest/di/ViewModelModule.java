package com.jeromedusanter.aircalltest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H%J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH%J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH%J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH%J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H!\u00a2\u0006\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/jeromedusanter/aircalltest/di/ViewModelModule;", "", "()V", "bindLoginViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/jeromedusanter/aircalltest/ui/login/LoginViewModel;", "bindMainViewModel", "Lcom/jeromedusanter/aircalltest/ui/main/MainViewModel;", "bindRepositoryViewModel", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/RepoGithubViewModel;", "bindTestViewModel", "Lcom/jeromedusanter/aircalltest/ui/main/features/test/TestViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/jeromedusanter/aircalltest/di/ViewModelFactory;", "bindViewModelFactory$app_debug", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory$app_debug(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.di.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.jeromedusanter.aircalltest.ui.login.LoginViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    protected abstract androidx.lifecycle.ViewModel bindLoginViewModel(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.ui.login.LoginViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.jeromedusanter.aircalltest.ui.main.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    protected abstract androidx.lifecycle.ViewModel bindMainViewModel(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.ui.main.MainViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    protected abstract androidx.lifecycle.ViewModel bindRepositoryViewModel(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.jeromedusanter.aircalltest.ui.main.features.test.TestViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    protected abstract androidx.lifecycle.ViewModel bindTestViewModel(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.ui.main.features.test.TestViewModel viewModel);
    
    public ViewModelModule() {
        super();
    }
}