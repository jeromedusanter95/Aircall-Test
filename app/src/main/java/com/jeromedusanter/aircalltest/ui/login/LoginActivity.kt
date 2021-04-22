package com.jeromedusanter.aircalltest.ui.login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.ActivityLoginBinding
import com.jeromedusanter.aircalltest.ui.base.BaseActivity
import com.jeromedusanter.aircalltest.ui.main.MainActivity

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginState, LoginViewModel>() {

    override val resId: Int = R.layout.activity_login

    override val viewModel: LoginViewModel by viewModels { factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent.data?.let { uri ->
            if (uri.toString().startsWith(REDIRECT_URI)) {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
        binding.buttonLogin.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }

    companion object {
        private const val GITHUB_ID: String = "1998c436528b18a04d4e"
        const val GITHUB_SECRET: String = "f936cabcf1367514a323bafd4e8b28d62440bc96"
        private const val REDIRECT_URI = "jeromedusanter://callback"
        const val url = "https://github.com/login/oauth/authorize" +
                "?client_id=" + GITHUB_ID +
                "&scope=repo&redirect_uri=" + REDIRECT_URI
    }

}