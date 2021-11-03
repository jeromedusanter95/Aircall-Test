package com.jeromedusanter.aircalltest.ui.main

import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.ActivityMainBinding
import com.jeromedusanter.aircalltest.ui.base.BaseActivity
import com.jeromedusanter.aircalltest.ui.base.IUiAction

class MainActivity : BaseActivity<ActivityMainBinding, IUiAction, MainViewModel>() {

    private val navController by lazy { findNavController(R.id.nav_host_fragment) }
    private val appBarConfiguration by lazy { AppBarConfiguration(setOf(R.id.fragment_repo_github_list)) }

    override val resId: Int = R.layout.activity_main

    override val viewModel: MainViewModel by viewModels { factory }

    override fun onStart() {
        super.onStart()
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp() = NavigationUI.navigateUp(navController, appBarConfiguration)
}