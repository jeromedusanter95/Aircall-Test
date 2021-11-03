package com.jeromedusanter.aircalltest.data.features.repogithub.models

import com.jeromedusanter.aircalltest.data.base.IDataApiModel

enum class SortRepoGithubApi constructor(val serverValue: String) : IDataApiModel {
    STARS("stars"),
    FORKS("forks"),
    HELP_WANTED_ISSUES("help-wanted-issues"),
    UPDATED("updated")
}