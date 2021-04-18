package com.jeromedusanter.aircalltest.ui.login

import com.jeromedusanter.aircalltest.ui.base.BaseState

sealed class LoginState : BaseState {
    object NavToMainActivity : LoginState()
}