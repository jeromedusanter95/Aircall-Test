package com.jeromedusanter.aircalltest.data.features.repogithub

import com.jeromedusanter.aircalltest.data.base.IMapper
import com.jeromedusanter.aircalltest.data.remote.models.RepoGithubApi
import com.jeromedusanter.aircalltest.data.utils.toLocaleDate
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import javax.inject.Inject

class RepoGithubMapper @Inject constructor() : IMapper<RepoGithub, RepoGithubApi, Nothing> {

    override fun mapModelToDataApiModel(model: RepoGithub): RepoGithubApi =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapModelToDataLocalModel(model: RepoGithub): Nothing =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapDataApiModelToModel(model: RepoGithubApi): RepoGithub {
        return RepoGithub(
            model.id,
            model.name,
            model.url,
            model.description,
            model.private,
            model.createdAt.toLocaleDate(),
            model.watchersCount,
            model.stargazersCount,
            model.forksCount
        )
    }

    override fun mapDataLocalModelToModel(model: Nothing): RepoGithub =
        throw Exception("No use case yet for this method, it should never been called")

}