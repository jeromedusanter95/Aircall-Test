package com.jeromedusanter.aircalltest.data.remote.models

import com.google.gson.annotations.SerializedName
import com.jeromedusanter.aircalltest.data.base.ApiModel

data class RepoGithubApi(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("html_url") val url: String,
    @SerializedName("description") val description: String,
    @SerializedName("private") val private: Boolean,
    @SerializedName("created_at") val createdAt: String
) : ApiModel