package com.jeromedusanter.aircalltest.data.features.repogithub.models

import com.google.gson.annotations.SerializedName

data class RepoGithubApiResponse(
    @SerializedName("total_count") val totalCount: Int,
    @SerializedName("incomplete_results") val inCompleteResults: Boolean,
    @SerializedName("items") val items: List<RepoGithubApi>
)