package com.jeromedusanter.aircalltest.ui.main.features.repogithub.details

import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.ui.base.IMapper
import javax.inject.Inject

class RepoGithubDetailsMapper @Inject constructor(
    private val issueMapper: IssueMapper
) : IMapper<RepoGithub, RepoGithubDetailsUiModel> {

    override fun mapModelToUiModel(model: RepoGithub): RepoGithubDetailsUiModel {
        return RepoGithubDetailsUiModel(
            model.name,
            model.description,
            model.watchersCount.toString(),
            model.stargazersCount.toString(),
            model.forksCount.toString(),
            model.issuesHistory.map { issueMapper.mapModelToUiModel(it) }
        )
    }

    override fun mapUiModelToModel(model: RepoGithubDetailsUiModel): RepoGithub =
        throw Exception("No use case yet for this method, it should never been called")
}