package com.jeromedusanter.aircalltest.ui.main.features.repogithub.details

import androidx.navigation.navGraphViewModels
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.FragmentRepoGithubDetailsBinding
import com.jeromedusanter.aircalltest.ui.base.BaseFragment
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubState
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel

class RepoGithubDetailsFragment :
    BaseFragment<FragmentRepoGithubDetailsBinding, RepoGithubState, RepoGithubViewModel>() {

    override val resId: Int = R.layout.fragment_repo_github_details

    override val viewModel: RepoGithubViewModel by navGraphViewModels(R.id.navigation_repo_github) { factory }
}