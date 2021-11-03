package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.Application
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        ActivityModule::class,
        FragmentModule::class,
        ViewModelModule::class,
        AndroidSupportInjectionModule::class,
        RetrofitModule::class,
        RepositoryModule::class,
        PreferencesModule::class
    ]
)
interface ApplicationComponent {
    fun inject(application: Application)
}