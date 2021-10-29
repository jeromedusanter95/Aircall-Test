package com.jeromedusanter.aircalltest.ui.main.features.test

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.FragmentTestBinding
import com.jeromedusanter.aircalltest.ui.base.BaseFragment
import com.jeromedusanter.aircalltest.ui.base.IAction

class TestFragment : BaseFragment<FragmentTestBinding, IAction, TestViewModel>() {

    override val resId: Int = R.layout.fragment_test

    override val viewModel: TestViewModel by viewModels { factory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getRepoList()
    }
}