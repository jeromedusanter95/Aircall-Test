package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.data.base.ErrorHandlerImpl
import com.jeromedusanter.aircalltest.data.features.repogithub.RepoGithubRepositoryImpl
import com.jeromedusanter.aircalltest.domain.base.IErrorHandler
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {
    @Binds
    internal abstract fun bindsRepository(instance: RepoGithubRepositoryImpl): RepoGithubRepository

    @Binds
    internal abstract fun bindsErrorHandler(instance: ErrorHandlerImpl): IErrorHandler
}