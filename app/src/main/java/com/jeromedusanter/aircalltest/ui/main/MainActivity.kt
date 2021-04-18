package com.jeromedusanter.aircalltest.ui.main

import androidx.activity.viewModels
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.ActivityMainBinding
import com.jeromedusanter.aircalltest.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainState, MainViewModel>() {

    override val resId: Int
        get() = R.layout.activity_main

    override val viewModel: MainViewModel by viewModels { factory }
}