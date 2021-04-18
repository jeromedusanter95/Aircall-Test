package com.jeromedusanter.aircalltest.ui.main.features.repository.list

import androidx.navigation.navGraphViewModels
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.FragmentRepositoryListBinding
import com.jeromedusanter.aircalltest.ui.base.BaseFragment
import com.jeromedusanter.aircalltest.ui.main.features.repository.RepositoryState
import com.jeromedusanter.aircalltest.ui.main.features.repository.RepositoryViewModel

class RepositoryListFragment :
    BaseFragment<FragmentRepositoryListBinding, RepositoryState, RepositoryViewModel>() {

    override val resId: Int = R.layout.fragment_repository_list

    override val viewModel: RepositoryViewModel by navGraphViewModels(R.id.navigation_repository) { factory }
}