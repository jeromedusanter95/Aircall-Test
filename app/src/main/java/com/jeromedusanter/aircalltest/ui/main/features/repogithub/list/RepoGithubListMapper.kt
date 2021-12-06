package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.ui.base.IMapper
import com.jeromedusanter.aircalltest.ui.utils.toFormattedStringWithPattern
import javax.inject.Inject

class RepoGithubListMapper @Inject constructor() : IMapper<RepoGithub, RepoGithubItemUiModel> {

    override fun mapModelToUiModel(model: RepoGithub): RepoGithubItemUiModel {
        return RepoGithubItemUiModel(
            model.id,
            model.name,
            model.description,
            model.private,
            model.createdAt.toFormattedStringWithPattern("dd/MM/yyyy"),
            model.isFavorited
        )
    }

    override fun mapUiModelToModel(model: RepoGithubItemUiModel): RepoGithub =
        throw Exception("No use case yet for this method, it should never been called")
}