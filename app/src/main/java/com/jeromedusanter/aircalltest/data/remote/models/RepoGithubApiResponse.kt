package com.jeromedusanter.aircalltest.data.remote.models

import com.google.gson.annotations.SerializedName

data class RepoGithubApiResponse(
    @SerializedName("total_count") val totalCount: Int,
    @SerializedName("incomplete_results") val inCompleteResults: Boolean,
    @SerializedName("items") val repoGithubApiList: List<RepoGithubApi>
)