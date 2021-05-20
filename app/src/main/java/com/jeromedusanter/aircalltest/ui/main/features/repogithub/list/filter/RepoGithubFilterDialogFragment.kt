package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import androidx.navigation.navGraphViewModels
import com.google.android.material.radiobutton.MaterialRadioButton
import com.jeromedusanter.aircalltest.R
import com.jeromedusanter.aircalltest.databinding.DialogRepoGithubFilterBinding
import com.jeromedusanter.aircalltest.ui.base.BaseDialogFragment
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubAction
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel
import com.jeromedusanter.aircalltest.ui.utils.hideKeyboard

class RepoGithubFilterDialogFragment :
    BaseDialogFragment<DialogRepoGithubFilterBinding, RepoGithubAction, RepoGithubViewModel>() {

    override val resId: Int = R.layout.dialog_repo_github_filter

    override val viewModel: RepoGithubViewModel by navGraphViewModels(R.id.navigation_repo_github) { factory }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RepoGithubSortUiModel.values().forEach {
            binding.radioGroupSort.addView(MaterialRadioButton(requireContext())
                .apply {
                    id = it.ordinal
                    setText(it.titleId)
                    buttonTintList = ColorStateList.valueOf(R.color.purple_700)
                })
        }
        binding.buttonValidate.setOnClickListener {
            viewModel.tryChangeFilter()
        }
    }

    override fun onAction(action: RepoGithubAction) {
        super.onAction(action)
        when (action) {
            RepoGithubAction.DismissFilterDialog -> dismiss()
            RepoGithubAction.HideKeyBoard -> requireContext().hideKeyboard(requireView())
            is RepoGithubAction.ShowErrorPerPageError -> {
                binding.textInputPerPage.error =
                    if (action.showError)
                        getString(R.string.repo_github_filter_query_error)
                    else null
            }
            is RepoGithubAction.ShowErrorQueryError -> {
                binding.textInputQuery.error =
                    if (action.showError)
                        getString(R.string.repo_github_filter_per_page_error)
                    else null
            }
        }
    }

    companion object {
        fun newInstance(): RepoGithubFilterDialogFragment = RepoGithubFilterDialogFragment()
    }
}
