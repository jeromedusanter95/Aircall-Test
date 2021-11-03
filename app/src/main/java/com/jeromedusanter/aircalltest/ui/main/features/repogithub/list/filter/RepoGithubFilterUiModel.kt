package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.jeromedusanter.aircalltest.BR
import com.jeromedusanter.aircalltest.ui.base.IUiModel

class RepoGithubFilterUiModel(
    sort: Int,
    perPage: String,
    query: String
) : IUiModel, BaseObservable() {

    //This code permit to enable two-way databinding but maybe it's not the best
    @Bindable
    var sort: Int = sort
        set(value) {
            field = value
            notifyPropertyChanged(BR.sort)
        }

    @Bindable
    var perPage: String = perPage
        set(value) {
            field = value
            notifyPropertyChanged(BR.perPage)
        }

    @Bindable
    var query: String = query
        set(value) {
            field = value
            notifyPropertyChanged(BR.query)
        }
}