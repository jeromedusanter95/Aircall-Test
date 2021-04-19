package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.navGraphViewModels
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.FragmentRepoGithubListBinding
import com.jeromedusanter.aircalltest.ui.base.BaseFragment
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubState
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel

class RepoGithubListFragment :
    BaseFragment<FragmentRepoGithubListBinding, RepoGithubState, RepoGithubViewModel>() {

    override val resId: Int = R.layout.fragment_repo_github_list

    override val viewModel: RepoGithubViewModel by navGraphViewModels(R.id.navigation_repoGithub) { factory }

    private val adapter by lazy { RepoGithubListAdapter(buildRepoGithubAdapterListener()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerRepoGithub.adapter = adapter
        viewModel.getRepoGithubList()
    }

    override fun render(state: RepoGithubState) {
        super.render(state)
        when (state) {
            is RepoGithubState.EmptyRepoGithubList -> binding.statefulLayoutRepoGithub.showEmpty()
            is RepoGithubState.ErrorRepoGithubList -> binding.statefulLayoutRepoGithub.showError()
            is RepoGithubState.LoadingRepoGithubList -> binding.statefulLayoutRepoGithub.showLoading()
            is RepoGithubState.SuccessRepoGithubList -> {
                adapter.addItems(state.repoGithubListList, clear = true)
                binding.statefulLayoutRepoGithub.showContent()
            }
            is RepoGithubState.NavToRepoGithubDetails -> navigate(RepoGithubListFragmentDirections.actionNavigateToRepositoryDetails())
        }
    }

    private fun buildRepoGithubAdapterListener() = object : RepoGithubListAdapter.Listener {
        override fun onClickItem(itemId: Long) {
            viewModel.selectRepoGithub(itemId)
        }
    }
}