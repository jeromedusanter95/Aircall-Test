package com.jeromedusanter.aircalltest.data.features.repogithub.models

import com.google.gson.annotations.SerializedName
import com.jeromedusanter.aircalltest.data.base.IDataApiModel

data class RepoGithubOwnerApi(@SerializedName("login") val login: String) : IDataApiModel
