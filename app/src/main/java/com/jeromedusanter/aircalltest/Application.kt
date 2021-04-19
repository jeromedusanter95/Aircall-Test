package com.jeromedusanter.aircalltest

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.jeromedusanter.aircalltest.data.remote.RequestManager
import com.jeromedusanter.aircalltest.di.ComponentManager
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class Application : Application(), HasActivityInjector, HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var mFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun activityInjector(): DispatchingAndroidInjector<Activity>? {
        return dispatchingAndroidInjector
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return mFragmentInjector
    }

    override fun onCreate() {
        super.onCreate()
        ComponentManager.init(this, RequestManager.getRetrofit())
        ComponentManager.applicationComponent.inject(this)
    }
}