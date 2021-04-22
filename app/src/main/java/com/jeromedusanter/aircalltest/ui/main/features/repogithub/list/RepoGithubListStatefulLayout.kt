package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.SflRepoGithubListErrorBinding
import com.jeromedusanter.aircalltest.databinding.SflRepoGithubListErrorBindingImpl
import cz.kinst.jakub.view.StatefulLayout

class RepoGithubListStatefulLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : StatefulLayout(context, attrs, defStyleAttr) {

    init {
        setStateView(
            State.LOADING,
            LayoutInflater.from(getContext()).inflate(
                R.layout.sfl_repo_github_list_loading,
                null
            )
        )

        setStateView(
            State.EMPTY,
            LayoutInflater.from(getContext()).inflate(
                R.layout.sfl_repo_github_list_empty,
                null
            )
        )
    }

    fun setErrorView(setup: SflRepoGithubListErrorBinding.() -> Unit) {
        val binding = DataBindingUtil.inflate<SflRepoGithubListErrorBinding>(
            LayoutInflater.from(context),
            R.layout.sfl_repo_github_list_error,
            this,
            false
        )
        setStateView(State.ERROR, binding.root)
        setup.invoke(binding)
    }

    fun showContent() {
        state = StatefulLayout.State.CONTENT
    }

    fun showError() {
        state = State.ERROR
    }

    fun showLoading() {
        state = State.LOADING
    }

    fun showEmpty() {
        state = State.EMPTY
    }

    class State : StatefulLayout.State() {
        companion object {
            const val ERROR = "error"
            const val LOADING = "loading"
            const val EMPTY = "empty"
        }
    }
}