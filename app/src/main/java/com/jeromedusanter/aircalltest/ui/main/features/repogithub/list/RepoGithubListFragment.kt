package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.navigation.navGraphViewModels
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.FragmentRepoGithubListBinding
import com.jeromedusanter.aircalltest.ui.base.BaseFragment
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubState
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterDialogFragment
import javax.inject.Inject

class RepoGithubListFragment :
    BaseFragment<FragmentRepoGithubListBinding, RepoGithubState, RepoGithubViewModel>() {

    override val resId: Int = R.layout.fragment_repo_github_list

    override val viewModel: RepoGithubViewModel by navGraphViewModels(R.id.navigation_repoGithub) { factory }

    private val adapter by lazy { RepoGithubListAdapter(buildRepoGithubAdapterListener()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun initView() {
        super.initView()
        binding.recyclerRepoGithub.adapter = adapter
        binding.statefulLayoutRepoGithub.setErrorView {
            buttonRetry.setOnClickListener { viewModel.getRepoGithubList() }
        }
    }

    override fun render(state: RepoGithubState) {
        super.render(state)
        when (state) {
            is RepoGithubState.EmptyRepoGithubList -> binding.statefulLayoutRepoGithub.showEmpty()
            is RepoGithubState.ErrorRepoGithubList -> binding.statefulLayoutRepoGithub.showError()
            is RepoGithubState.LoadingRepoGithubList -> binding.statefulLayoutRepoGithub.showLoading()
            is RepoGithubState.SuccessRepoGithubList -> binding.statefulLayoutRepoGithub.showContent()
            is RepoGithubState.NavToRepoGithubDetails -> navigate(RepoGithubListFragmentDirections.actionNavigateToRepositoryDetails())
            is RepoGithubState.ShowDialogFilter -> showFilterDialogFragment()
        }
    }

    private fun buildRepoGithubAdapterListener() = object : RepoGithubListAdapter.Listener {
        override fun onClickItem(itemId: Long) {
            viewModel.selectRepoGithub(itemId)
        }
    }

    private fun showFilterDialogFragment() {
        RepoGithubFilterDialogFragment(factory).show(childFragmentManager, "")
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_repo_github_list, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_filter -> {
                viewModel.dispatch(RepoGithubState.ShowDialogFilter)
                true
            }
            R.id.item_refresh -> {
                viewModel.refreshPage()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}