package com.jeromedusanter.aircalltest.data.remote.repogithub.models

import com.google.gson.annotations.SerializedName
import com.jeromedusanter.aircalltest.data.base.IDataApiModel

data class RepoGithubApi(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("html_url") val url: String,
    @SerializedName("description") val description: String?,
    @SerializedName("private") val private: Boolean,
    @SerializedName("created_at") val createdAt: String,
    @SerializedName("watchers_count") val watchersCount: Int,
    @SerializedName("stargazers_count") val stargazersCount: Int,
    @SerializedName("forks_count") val forksCount: Int
) : IDataApiModel