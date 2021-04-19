package com.jeromedusanter.aircalltest.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jeromedusanter.aircalltest.ui.login.LoginViewModel
import com.jeromedusanter.aircalltest.ui.main.MainViewModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)

@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    protected abstract fun bindLoginViewModel(viewModel: LoginViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    protected abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RepoGithubViewModel::class)
    protected abstract fun bindRepositoryViewModel(viewModel: RepoGithubViewModel): ViewModel
}