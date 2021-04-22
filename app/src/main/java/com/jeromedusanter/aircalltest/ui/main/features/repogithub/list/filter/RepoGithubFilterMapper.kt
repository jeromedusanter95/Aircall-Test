package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter

import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import com.jeromedusanter.aircalltest.domain.models.RepoGithubSort
import com.jeromedusanter.aircalltest.ui.base.IMapper
import javax.inject.Inject

class RepoGithubFilterMapper @Inject constructor(
    private val sortMapper: RepoGithubSortMapper
) : IMapper<RepoGithubFilter, RepoGithubFilterUiModel> {

    override fun mapModelToUiModel(model: RepoGithubFilter): RepoGithubFilterUiModel {
        return RepoGithubFilterUiModel(
            model.sort?.let { sortMapper.mapModelToUiModel(it) },
            model.order,
            model.perPage,
            model.query
        )
    }

    override fun mapUiModelToModel(model: RepoGithubFilterUiModel): RepoGithubFilter {
        return RepoGithubFilter(
            model.sort?.let { sortMapper.mapUiModelToModel(it) },
            model.order,
            model.perPage,
            model.query
        )
    }
}