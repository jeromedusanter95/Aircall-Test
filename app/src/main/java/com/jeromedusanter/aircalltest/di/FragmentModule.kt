package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.ui.main.features.repository.details.RepositoryDetailsFragment
import com.jeromedusanter.aircalltest.ui.main.features.repository.list.RepositoryListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeRepositoryListFragment(): RepositoryListFragment

    @ContributesAndroidInjector
    abstract fun contributeRepositoryDetailsFragment(): RepositoryDetailsFragment
}