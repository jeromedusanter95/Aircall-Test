package com.jeromedusanter.aircalltest.di

import com.jeromedusanter.aircalltest.Application

object ComponentManager {

    internal lateinit var applicationComponent: ApplicationComponent

    fun init(application: Application) {
        val applicationModule = ApplicationModule(application)
        initApplicationComponent(applicationModule)
    }


    private fun initApplicationComponent(applicationModule: ApplicationModule) {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(applicationModule)
            .build()
    }
}