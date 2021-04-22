package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter

import android.content.res.ColorStateList
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.navGraphViewModels
import com.google.android.material.radiobutton.MaterialRadioButton
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.DialogRepoGithubFilterBinding
import com.jeromedusanter.aircalltest.ui.base.BaseDialogFragment
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubState
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel
import com.jeromedusanter.aircalltest.ui.utils.hideKeyboard

class RepoGithubFilterDialogFragment(val factory: ViewModelProvider.Factory) :
    BaseDialogFragment<DialogRepoGithubFilterBinding, RepoGithubState, RepoGithubViewModel>() {

    override val resId: Int = R.layout.dialog_repo_github_filter

    override val viewModel: RepoGithubViewModel by navGraphViewModels(R.id.navigation_repo_github) { factory }

    override fun initView() {
        super.initView()
        RepoGithubSortUiModel.values().forEach {
            binding.radioGroupSort.addView(MaterialRadioButton(requireContext())
                .apply {
                    id = it.ordinal
                    setText(it.titleId)
                    buttonTintList = ColorStateList.valueOf(R.color.purple_700)
                })
        }
        with(binding) {
            buttonValidate.setOnClickListener {
                val query = editQuery.text.toString()
                val perPage = editPerPage.text.toString()
                textInputQuery.error =
                    if (query.isEmpty()) getString(R.string.repo_github_filter_per_page_error) else null
                textInputPerPage.error =
                    if (perPage.isEmpty() || perPage.toLong() <= 0) getString(R.string.repo_github_filter_query_error) else null
                if (query.isNotEmpty() && perPage.isNotEmpty() && perPage.toLong() > 0) {
                    requireContext().hideKeyboard(requireView())
                    dismiss()
                    this@RepoGithubFilterDialogFragment.viewModel.changeFilter(
                        RepoGithubFilterUiModel(
                            sort = RepoGithubSortUiModel.fromOrdinal(radioGroupSort.checkedRadioButtonId)
                                ?: RepoGithubSortUiModel.STARS,
                            perPage = perPage.toLong(),
                            query = query
                        )
                    )
                }
            }
        }
    }
}
