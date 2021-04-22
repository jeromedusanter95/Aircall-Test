package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter

import com.jeromedusanter.aircalltest.domain.models.RepoGithubSort
import com.jeromedusanter.aircalltest.ui.base.IMapper
import javax.inject.Inject

class RepoGithubSortMapper @Inject constructor() : IMapper<RepoGithubSort, RepoGithubSortUiModel> {

    override fun mapModelToUiModel(model: RepoGithubSort): RepoGithubSortUiModel {
        return when (model) {
            RepoGithubSort.FORKS -> RepoGithubSortUiModel.FORKS
            RepoGithubSort.STARS -> RepoGithubSortUiModel.STARS
            RepoGithubSort.HELP_WANTED_ISSUES -> RepoGithubSortUiModel.HELP_WANTED_ISSUES
            RepoGithubSort.UPDATED -> RepoGithubSortUiModel.UPDATED
        }
    }

    override fun mapUiModelToModel(model: RepoGithubSortUiModel): RepoGithubSort {
        return when (model) {
            RepoGithubSortUiModel.FORKS -> RepoGithubSort.FORKS
            RepoGithubSortUiModel.STARS -> RepoGithubSort.STARS
            RepoGithubSortUiModel.HELP_WANTED_ISSUES -> RepoGithubSort.HELP_WANTED_ISSUES
            RepoGithubSortUiModel.UPDATED -> RepoGithubSort.UPDATED
        }
    }
}