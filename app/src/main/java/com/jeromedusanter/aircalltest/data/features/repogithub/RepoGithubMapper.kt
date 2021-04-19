package com.jeromedusanter.aircalltest.data.features.repogithub

import com.jeromedusanter.aircalltest.data.base.Mapper
import com.jeromedusanter.aircalltest.data.remote.models.RepoGithubApi
import com.jeromedusanter.aircalltest.data.utils.toDatabaseFormatString
import com.jeromedusanter.aircalltest.data.utils.toLocaleDate
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import javax.inject.Inject

class RepoGithubMapper @Inject constructor() : Mapper<RepoGithub, RepoGithubApi> {

    override fun toApiModel(model: RepoGithub): RepoGithubApi =
        throw Exception("No use case yet for this method, it should never been called")

    override fun toModel(apiModel: RepoGithubApi): RepoGithub {
        return RepoGithub(
            apiModel.id,
            apiModel.name,
            apiModel.url,
            apiModel.description,
            apiModel.private,
            apiModel.createdAt.toLocaleDate(),
            apiModel.watchersCount,
            apiModel.stargazersCount,
            apiModel.forksCount
        )
    }
}