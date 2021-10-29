// Generated by Dagger (https://google.github.io/dagger).
package com.jeromedusanter.aircalltest.ui.base;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseFragment_MembersInjector<
        B extends ViewDataBinding, A extends IAction, VM extends BaseViewModel<A>>
    implements MembersInjector<BaseFragment<B, A, VM>> {
  private final Provider<ViewModelProvider.Factory> factoryProvider;

  public BaseFragment_MembersInjector(Provider<ViewModelProvider.Factory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static <B extends ViewDataBinding, A extends IAction, VM extends BaseViewModel<A>>
      MembersInjector<BaseFragment<B, A, VM>> create(
          Provider<ViewModelProvider.Factory> factoryProvider) {
    return new BaseFragment_MembersInjector<B, A, VM>(factoryProvider);
  }

  @Override
  public void injectMembers(BaseFragment<B, A, VM> instance) {
    injectFactory(instance, factoryProvider.get());
  }

  public static <B extends ViewDataBinding, A extends IAction, VM extends BaseViewModel<A>>
      void injectFactory(BaseFragment<B, A, VM> instance, ViewModelProvider.Factory factory) {
    instance.factory = factory;
  }
}
