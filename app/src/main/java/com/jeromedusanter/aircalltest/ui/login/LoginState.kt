package com.jeromedusanter.aircalltest.ui.login

import com.jeromedusanter.aircalltest.ui.base.IState

sealed class LoginState : IState {
    object NavToMainActivity : LoginState()
}