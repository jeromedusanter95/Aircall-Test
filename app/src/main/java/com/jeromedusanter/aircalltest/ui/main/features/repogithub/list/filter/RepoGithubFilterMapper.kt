package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter

import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import com.jeromedusanter.aircalltest.ui.base.IMapper
import javax.inject.Inject

class RepoGithubFilterMapper @Inject constructor(
    private val sortMapper: RepoGithubSortMapper
) : IMapper<RepoGithubFilter, RepoGithubFilterUiModel> {

    override fun mapModelToUiModel(model: RepoGithubFilter): RepoGithubFilterUiModel {
        return RepoGithubFilterUiModel(
            sortMapper.mapModelToUiModel(model.sort).ordinal,
            model.perPage.toString(),
            model.query
        )
    }

    override fun mapUiModelToModel(model: RepoGithubFilterUiModel): RepoGithubFilter {
        return RepoGithubFilter(
            sortMapper.mapUiModelToModel(
                RepoGithubSortUiModel.fromOrdinal(model.sort) ?: RepoGithubSortUiModel.STARS
            ),
            model.perPage.toInt(),
            model.query
        )
    }
}