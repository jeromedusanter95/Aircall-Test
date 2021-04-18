package com.jeromedusanter.aircalltest.ui.login

import androidx.databinding.ObservableField
import com.jeromedusanter.aircalltest.ui.base.BaseViewModel
import javax.inject.Inject

class LoginViewModel @Inject constructor() : BaseViewModel<LoginState>() {
    val userId = ObservableField("")
    val password = ObservableField("")

    fun clickSignIn() {
        dispatch(LoginState.NavToMainActivity)
    }
}