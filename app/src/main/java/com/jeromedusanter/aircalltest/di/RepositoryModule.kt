package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.data.remote.repogithub.RepoGithubRepositoryImpl
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    internal abstract fun bindsRepository(instance: RepoGithubRepositoryImpl): RepoGithubRepository
}