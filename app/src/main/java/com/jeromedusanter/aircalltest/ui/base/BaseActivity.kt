package com.jeromedusanter.aircalltest.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.jeromedusanter.aircalltest.BR
import dagger.android.AndroidInjection
import javax.inject.Inject

abstract class BaseActivity<B : ViewDataBinding, A : IAction, VM : BaseViewModel<A>> : AppCompatActivity(), IView<A> {

    abstract val resId: Int

    abstract val viewModel: VM

    lateinit var binding: B

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, resId)
        binding.setVariable(BR.viewModel, viewModel)
        binding.lifecycleOwner = this
    }

    override fun onResume() {
        super.onResume()
        viewModel.action.observe(this, { action -> onAction(action) })
    }
}