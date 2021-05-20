package com.jeromedusanter.aircalltest.ui.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.jeromedusanter.aircalltest.BR
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class BaseDialogFragment<B : ViewDataBinding, A : IAction, VM : BaseViewModel<A>> :
    DialogFragment(), IView<A> {

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
        retainInstance = true
        binding = DataBindingUtil.inflate(inflater, resId, container, false)
        binding.setVariable(BR.viewModel, viewModel)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.action.observe(viewLifecycleOwner, { action -> action?.let { onAction(action) } })
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            val width = ViewGroup.LayoutParams.MATCH_PARENT
            val height = ViewGroup.LayoutParams.WRAP_CONTENT
            dialog.window?.setLayout(width, height)
        }
    }
}