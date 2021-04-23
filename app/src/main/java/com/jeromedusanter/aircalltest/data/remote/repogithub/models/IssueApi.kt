package com.jeromedusanter.aircalltest.data.remote.repogithub.models

import com.google.gson.annotations.SerializedName
import com.jeromedusanter.aircalltest.data.base.IDataApiModel

data class IssueApi(
    @SerializedName("id ") val id: Int,
    @SerializedName("created_at") val createdAt: String
) : IDataApiModel