package com.jeromedusanter.aircalltest.ui.main.features.repository.details

import androidx.navigation.navGraphViewModels
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.FragmentRepositoryDetailsBinding
import com.jeromedusanter.aircalltest.ui.base.BaseFragment
import com.jeromedusanter.aircalltest.ui.main.features.repository.RepositoryState
import com.jeromedusanter.aircalltest.ui.main.features.repository.RepositoryViewModel

class RepositoryDetailsFragment :
    BaseFragment<FragmentRepositoryDetailsBinding, RepositoryState, RepositoryViewModel>() {

    override val resId: Int = R.layout.fragment_repository_details

    override val viewModel: RepositoryViewModel by navGraphViewModels(R.id.navigation_repository) { factory }
}