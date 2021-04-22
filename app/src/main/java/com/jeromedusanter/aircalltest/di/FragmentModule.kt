package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsFragment
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListFragment
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterDialogFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeRepositoryListFragment(): RepoGithubListFragment

    @ContributesAndroidInjector
    abstract fun contributeRepositoryDetailsFragment(): RepoGithubDetailsFragment

    @ContributesAndroidInjector
    abstract fun contributeRepoGithubFilterDialogFragment(): RepoGithubFilterDialogFragment
}