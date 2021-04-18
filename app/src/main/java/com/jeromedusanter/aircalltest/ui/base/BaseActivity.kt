package com.jeromedusanter.aircalltest.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.jeromedusanter.aircalltest.BR
import dagger.android.AndroidInjection
import javax.inject.Inject

abstract class BaseActivity<B : ViewDataBinding, BS : BaseState, VM : BaseViewModel<BS>> : AppCompatActivity() {

    abstract val resId: Int

    abstract val viewModel: VM

    private lateinit var binding: B

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
        viewModel.state.observe(this, { state -> render(state) })
    }

    open fun render(state: BS) = Unit
}