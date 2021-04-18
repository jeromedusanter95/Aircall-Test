package com.jeromedusanter.aircalltest.ui.login

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.jeromedusanter.aircalltest.BR
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.ActivityLoginBinding
import com.jeromedusanter.aircalltest.ui.base.BaseActivity
import com.jeromedusanter.aircalltest.ui.main.MainActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginState, LoginViewModel>() {

    override val resId: Int = R.layout.activity_login

    override val viewModel: LoginViewModel by viewModels { factory }

    override fun render(state: LoginState) {
        super.render(state)
        when (state) {
            is LoginState.NavToMainActivity -> startActivity(Intent(this, MainActivity::class.java))
        }
    }
}