package com.jeromedusanter.aircalltest.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00062\u00020\u00072\b\u0012\u0004\u0012\u0002H\u00030\bB\u0005\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010\"H\u0017J\u0006\u0010-\u001a\u00020\u001eJ\u0016\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u000200R\u001c\u0010\n\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00028\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00061"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/base/BaseFragment;", "B", "Landroidx/databinding/ViewDataBinding;", "A", "Lcom/jeromedusanter/aircalltest/ui/base/IAction;", "VM", "Lcom/jeromedusanter/aircalltest/ui/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "Lcom/jeromedusanter/aircalltest/ui/base/IView;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "resId", "", "getResId", "()I", "viewModel", "getViewModel", "()Lcom/jeromedusanter/aircalltest/ui/base/BaseViewModel;", "navigate", "", "navDirections", "Landroidx/navigation/NavDirections;", "bundle", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "popBackStack", "destinationId", "inclusive", "", "app_debug"})
public abstract class BaseFragment<B extends androidx.databinding.ViewDataBinding, A extends com.jeromedusanter.aircalltest.ui.base.IAction, VM extends com.jeromedusanter.aircalltest.ui.base.BaseViewModel<A>> extends androidx.fragment.app.Fragment implements com.jeromedusanter.aircalltest.ui.base.IView<A> {
    public B binding;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory factory;
    private java.util.HashMap _$_findViewCache;
    
    public abstract int getResId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract VM getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    public final B getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void navigate(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections navDirections) {
    }
    
    public final void navigate(int resId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    public final void popBackStack() {
    }
    
    public final void popBackStack(int destinationId, boolean inclusive) {
    }
    
    public BaseFragment() {
        super();
    }
    
    public void onAction(@org.jetbrains.annotations.NotNull()
    A action) {
    }
}