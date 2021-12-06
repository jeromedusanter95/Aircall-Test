package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.FragmentRepoGithubListBinding
import com.jeromedusanter.aircalltest.ui.base.BaseFragment
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubAction
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepoGithubListFragment :
    BaseFragment<FragmentRepoGithubListBinding, RepoGithubAction, RepoGithubViewModel>() {

    override val resId: Int = R.layout.fragment_repo_github_list

    override val viewModel: RepoGithubViewModel by hiltNavGraphViewModels(R.id.navigation_repo_github)

    private val adapter by lazy { RepoGithubListAdapter(buildRepoGithubAdapterListener()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerRepoGithub.adapter = adapter
        binding.statefulLayoutRepoGithub.setErrorView {
            buttonRetry.setOnClickListener { viewModel.getRepoGithubList() }
        }
    }

    override fun onReceiveUiAction(action: RepoGithubAction?) {
        when (action) {
            is RepoGithubAction.NavToRepoGithubDetails -> navigate(RepoGithubListFragmentDirections.actionNavigateToRepoGithubDetails())
            is RepoGithubAction.InvalidateOptionsMenu -> requireActivity().invalidateOptionsMenu()
            is RepoGithubAction.displayFavoriteStatus -> adapter.notifyDataSetChanged()
        }
    }

    private fun buildRepoGithubAdapterListener() = object : RepoGithubListAdapter.Listener {
        override fun onClickItem(itemId: Long) {
            viewModel.selectRepoGithub(itemId)
        }

        override fun onFavoriteClick(itemId: Long) {
            viewModel.setFavorited(itemId)
        }
    }

    private fun showFilterDialogFragment() {
        RepoGithubFilterDialogFragment.newInstance().show(childFragmentManager, "")
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_repo_github_list, menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        val itemFilter = menu.findItem(R.id.item_filter)
        val itemRefresh = menu.findItem(R.id.item_refresh)
        when (viewModel.listUiState.get()) {
            RepoGithubListStatefulLayout.State.CONTENT -> {
                itemFilter.isVisible = true
                itemRefresh.isVisible = true
            }
            RepoGithubListStatefulLayout.State.ERROR -> {
                itemFilter.isVisible = true
                itemRefresh.isVisible = true
            }
            RepoGithubListStatefulLayout.State.EMPTY -> {
                itemFilter.isVisible = true
                itemRefresh.isVisible = true
            }
            RepoGithubListStatefulLayout.State.LOADING -> {
                itemFilter.isVisible = false
                itemRefresh.isVisible = false
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_filter -> {
                showFilterDialogFragment()
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