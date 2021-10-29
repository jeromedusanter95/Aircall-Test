package com.jeromedusanter.aircalltest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/jeromedusanter/aircalltest/di/FragmentModule;", "", "()V", "contributeRepoGithubFilterDialogFragment", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/filter/RepoGithubFilterDialogFragment;", "contributeRepositoryDetailsFragment", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/details/RepoGithubDetailsFragment;", "contributeRepositoryListFragment", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListFragment;", "contributeTestFragment", "Lcom/jeromedusanter/aircalltest/ui/main/features/test/TestFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListFragment contributeRepositoryListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsFragment contributeRepositoryDetailsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterDialogFragment contributeRepoGithubFilterDialogFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.jeromedusanter.aircalltest.ui.main.features.test.TestFragment contributeTestFragment();
    
    public FragmentModule() {
        super();
    }
}