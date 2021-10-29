package com.jeromedusanter.aircalltest.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/login/LoginActivity;", "Lcom/jeromedusanter/aircalltest/ui/base/BaseActivity;", "Lcom/jeromedusanter/aircalltest/databinding/ActivityLoginBinding;", "Lcom/jeromedusanter/aircalltest/ui/login/LoginAction;", "Lcom/jeromedusanter/aircalltest/ui/login/LoginViewModel;", "()V", "resId", "", "getResId", "()I", "viewModel", "getViewModel", "()Lcom/jeromedusanter/aircalltest/ui/login/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class LoginActivity extends com.jeromedusanter.aircalltest.ui.base.BaseActivity<com.jeromedusanter.aircalltest.databinding.ActivityLoginBinding, com.jeromedusanter.aircalltest.ui.login.LoginAction, com.jeromedusanter.aircalltest.ui.login.LoginViewModel> {
    private final int resId = com.jeromedusanter.aircalltest.R.layout.activity_login;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private static final java.lang.String GITHUB_ID = "1998c436528b18a04d4e";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GITHUB_SECRET = "f936cabcf1367514a323bafd4e8b28d62440bc96";
    private static final java.lang.String REDIRECT_URI = "jeromedusanter://callback";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String url = "https://github.com/login/oauth/authorize?client_id=1998c436528b18a04d4e&scope=repo&redirect_uri=jeromedusanter://callback";
    @org.jetbrains.annotations.NotNull()
    public static final com.jeromedusanter.aircalltest.ui.login.LoginActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jeromedusanter.aircalltest.ui.login.LoginViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public LoginActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/login/LoginActivity$Companion;", "", "()V", "GITHUB_ID", "", "GITHUB_SECRET", "REDIRECT_URI", "url", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}