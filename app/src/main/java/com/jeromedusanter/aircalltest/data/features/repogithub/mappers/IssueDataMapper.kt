package com.jeromedusanter.aircalltest.data.features.repogithub.mappers

import com.jeromedusanter.aircalltest.data.base.IMapper
import com.jeromedusanter.aircalltest.data.features.repogithub.models.IssueApi
import com.jeromedusanter.aircalltest.data.utils.toLocaleDateTime
import com.jeromedusanter.aircalltest.domain.models.Issue
import javax.inject.Inject

class IssueDataMapper @Inject constructor() : IMapper<Issue, IssueApi, Nothing> {

    override fun mapModelToDataApiModel(model: Issue): IssueApi =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapModelToDataLocalModel(model: Issue): Nothing =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapDataApiModelToModel(model: IssueApi): Issue {
        return Issue(model.id, model.createdAt.toLocaleDateTime())
    }

    override fun mapDataLocalModelToModel(model: Nothing): Issue =
        throw Exception("No use case yet for this method, it should never been called")
}