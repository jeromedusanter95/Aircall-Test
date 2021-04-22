package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetRepoGithubUseCase
import com.jeromedusanter.aircalltest.ui.base.BaseViewModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel
import com.jeromedusanter.aircalltest.ui.utils.addOnPropertyChanged
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class RepoGithubViewModel @Inject constructor(
    private val getRepoGithubUseCase: GetRepoGithubUseCase,
    private val repoGithubListMapper: RepoGithubListMapper,
    private val repoGithubDetailsMapper: RepoGithubDetailsMapper
) : BaseViewModel<RepoGithubState>() {

    val repoGithubDetailsUiModel = ObservableField<RepoGithubDetailsUiModel>()
    private val _selectedRepoGithub = ObservableField<RepoGithub>()

    val repoGithubListUiModel = ObservableField<RepoGithubListUiModel>()
    private val _repoGithubList = ObservableField<List<RepoGithub>>()

    init {
        getRepoGithubList()

        _selectedRepoGithub.addOnPropertyChanged {
            it.get()?.let {
                repoGithubDetailsUiModel.set(repoGithubDetailsMapper.mapModelToUiModel(it))
            }
        }

        _repoGithubList.addOnPropertyChanged {
            it.get()?.let {
                repoGithubListUiModel.set(RepoGithubListUiModel(it.map {
                    repoGithubListMapper.mapModelToUiModel(it)
                }))
            }
        }
    }

    fun selectRepoGithub(id: Long) {
        _selectedRepoGithub.set(_repoGithubList.get()?.find { it.id == id })
        dispatch(RepoGithubState.NavToRepoGithubDetails)
    }

    private fun getRepoGithubList() {
        getRepoGithubUseCase.execute(null)
            .doOnSubscribe { dispatch(RepoGithubState.LoadingRepoGithubList) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ list ->
                _repoGithubList.set(list)
                dispatch(
                    if (list.isEmpty()) {
                        RepoGithubState.EmptyRepoGithubList
                    } else {
                        RepoGithubState.SuccessRepoGithubList
                    }
                )
            }, {
                it.printStackTrace()
                dispatch(RepoGithubState.ErrorRepoGithubList)
            })
            .addTo(disposable)
    }
}