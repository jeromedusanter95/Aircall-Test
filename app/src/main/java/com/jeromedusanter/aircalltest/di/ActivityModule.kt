package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.ui.login.LoginActivity
import com.jeromedusanter.aircalltest.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeLoginActivity(): LoginActivity
}