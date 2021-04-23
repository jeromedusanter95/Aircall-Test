package com.jeromedusanter.aircalltest.ui.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.jeromedusanter.aircalltest.BR
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class BaseFragment<B : ViewDataBinding, A : IAction, VM : BaseViewModel<A>> : Fragment(), IView<A> {

    abstract val resId: Int

    abstract val viewModel: VM

    lateinit var binding: B

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, resId, container, false)
        binding.setVariable(BR.viewModel, viewModel)
        binding.lifecycleOwner = viewLifecycleOwner
        initView()
        return binding.root
    }

    open fun initView() = Unit

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.action.observe(viewLifecycleOwner, { action -> onAction(action) })
    }

    fun navigate(navDirections: NavDirections) {
        try {
            findNavController().navigate(navDirections)
        } catch (t: Throwable) {
            t.printStackTrace()
        }
    }

    fun navigate(resId: Int, bundle: Bundle? = null) {
        try {
            findNavController().navigate(resId, bundle)
        } catch (t: Throwable) {
            t.printStackTrace()
        }
    }

    fun popBackStack() {
        try {
            findNavController().popBackStack()
        } catch (t: Throwable) {
            t.printStackTrace()
        }
    }

    fun popBackStack(destinationId: Int, inclusive: Boolean) {
        try {
            findNavController().popBackStack(destinationId, inclusive)
        } catch (t: Throwable) {
            t.printStackTrace()
        }
    }
}