package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule constructor(private val application: Application) {

    @Provides
    @Singleton
    internal fun provideContext() = application.applicationContext
}