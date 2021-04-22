package com.jeromedusanter.aircalltest.ui.login

import com.jeromedusanter.aircalltest.data.remote.ApiService
import com.jeromedusanter.aircalltest.ui.base.BaseViewModel
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val apiService: ApiService
) : BaseViewModel<LoginState>() {

    fun clickSignIn() {
        dispatch(LoginState.NavToMainActivity)
    }
}