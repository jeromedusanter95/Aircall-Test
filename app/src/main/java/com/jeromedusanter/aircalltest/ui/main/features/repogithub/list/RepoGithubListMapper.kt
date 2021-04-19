package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list

import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.ui.base.Mapper
import com.jeromedusanter.aircalltest.utils.toFormattedStringWithPattern
import java.lang.Exception
import javax.inject.Inject

class RepoGithubListMapper @Inject constructor() : Mapper<RepoGithub, RepoGithubListUiModel> {

    override fun toUiModel(model: RepoGithub): RepoGithubListUiModel {
        return RepoGithubListUiModel(
            model.id,
            model.name,
            model.description,
            model.private,
            model.createdAt.toFormattedStringWithPattern("dd/MM/yyyy")
        )
    }

    override fun toModel(uiModel: RepoGithubListUiModel): RepoGithub =
        throw Exception("No use case yet for this method, it should never been called")
}