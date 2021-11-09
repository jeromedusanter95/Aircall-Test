package com.jeromedusanter.aircalltest.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object PreferencesModule {

    @Provides
    @Singleton
    internal fun preferences(@ApplicationContext appContext: Context): SharedPreferences {
        return appContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    private const val PREF_NAME = "default"
}