package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.data.features.repogithub.RepoGithubDataSource
import com.jeromedusanter.aircalltest.data.remote.RepoGithubRemoteDataSource
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class DataSourceModule {
    @Binds
    @Named("RepoGithubRemoteDataSource")
    internal abstract fun bindsRepository(instance: RepoGithubRemoteDataSource): RepoGithubDataSource
}