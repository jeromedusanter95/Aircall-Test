package com.jeromedusanter.aircalltest.di

import android.content.SharedPreferences
import com.jeromedusanter.aircalltest.Application
import retrofit2.Retrofit

object ComponentManager {

    internal lateinit var applicationComponent: ApplicationComponent

    fun init(application: Application, retrofit: Retrofit, sharedPreferences: SharedPreferences) {
        val applicationModule = ApplicationModule(application)
        val retrofitModule = RetrofitModule(retrofit)
        val preferencesModule = PreferencesModule(sharedPreferences)
        initApplicationComponent(applicationModule, retrofitModule, preferencesModule)
    }


    private fun initApplicationComponent(
        applicationModule: ApplicationModule,
        retrofitModule: RetrofitModule,
        preferencesModule: PreferencesModule
    ) {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(applicationModule)
            .retrofitModule(retrofitModule)
            .preferencesModule(preferencesModule)
            .build()
    }
}