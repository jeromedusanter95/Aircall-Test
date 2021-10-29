package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListStatefulLayout;", "Lcz/kinst/jakub/view/StatefulLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setErrorView", "", "setup", "Lkotlin/Function1;", "Lcom/jeromedusanter/aircalltest/databinding/SflRepoGithubListErrorBinding;", "Lkotlin/ExtensionFunctionType;", "State", "app_debug"})
public final class RepoGithubListStatefulLayout extends cz.kinst.jakub.view.StatefulLayout {
    private java.util.HashMap _$_findViewCache;
    
    public final void setErrorView(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.jeromedusanter.aircalltest.databinding.SflRepoGithubListErrorBinding, kotlin.Unit> setup) {
    }
    
    public RepoGithubListStatefulLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public RepoGithubListStatefulLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public RepoGithubListStatefulLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListStatefulLayout$State;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONTENT", "ERROR", "LOADING", "EMPTY", "app_debug"})
    public static enum State {
        /*public static final*/ CONTENT /* = new CONTENT(null) */,
        /*public static final*/ ERROR /* = new ERROR(null) */,
        /*public static final*/ LOADING /* = new LOADING(null) */,
        /*public static final*/ EMPTY /* = new EMPTY(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        State(java.lang.String value) {
        }
    }
}