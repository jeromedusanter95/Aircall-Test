package com.jeromedusanter.aircalltest.ui.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0001\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"setList", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/jeromedusanter/aircalltest/ui/base/IUiModel;", "setUiState", "Lcz/kinst/jakub/view/StatefulLayout;", "state", "", "setVisibility", "Landroid/view/View;", "visible", "", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"app:list"})
    public static final void setList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.jeromedusanter.aircalltest.ui.base.IUiModel> list) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:uiState"})
    public static final void setUiState(@org.jetbrains.annotations.NotNull()
    cz.kinst.jakub.view.StatefulLayout view, @org.jetbrains.annotations.NotNull()
    java.lang.String state) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:visibleOrGone"})
    public static final void setVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean visible) {
    }
}