package com.jeromedusanter.aircalltest.data.features.repogithub

import com.jeromedusanter.aircalltest.data.base.Mapper
import com.jeromedusanter.aircalltest.data.remote.models.RepoGithubApi
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.utils.toDatabaseFormatString
import com.jeromedusanter.aircalltest.utils.toLocaleDate
import javax.inject.Inject

class RepoGithubMapper @Inject constructor() : Mapper<RepoGithub, RepoGithubApi> {

    override fun toApiModel(model: RepoGithub): RepoGithubApi {
        return RepoGithubApi(
            model.id,
            model.name,
            model.url,
            model.description,
            model.private,
            model.createdAt.toDatabaseFormatString()
        )
    }

    override fun toModel(apiModel: RepoGithubApi): RepoGithub {
        return RepoGithub(
            apiModel.id,
            apiModel.name,
            apiModel.url,
            apiModel.description,
            apiModel.private,
            apiModel.createdAt.toLocaleDate()
        )
    }
}