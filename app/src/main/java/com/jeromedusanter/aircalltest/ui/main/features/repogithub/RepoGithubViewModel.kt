package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetRepoGithubUseCase
import com.jeromedusanter.aircalltest.ui.base.BaseViewModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class RepoGithubViewModel @Inject constructor(
    private val getRepoGithubUseCase: GetRepoGithubUseCase,
    private val repoGithubListMapper: RepoGithubListMapper,
    private val repoGithubDetailsMapper: RepoGithubDetailsMapper
) : BaseViewModel<RepoGithubState>() {

    val selectedRepoGithubUiModel: LiveData<RepoGithubDetailsUiModel>
        get() = MutableLiveData(_selectedRepoGithub.value?.let {
            repoGithubDetailsMapper.toUiModel(it)
        })
    private val _selectedRepoGithub = MutableLiveData<RepoGithub>()

    val repoGithubUiModelList: LiveData<List<RepoGithubListUiModel>>
        get() = MutableLiveData(_repoGithubList.value?.let {
            it.map { repoGithubListMapper.toUiModel(it) }
        })
    private val _repoGithubList = MutableLiveData<List<RepoGithub>>()

    init {
        getRepoGithubList()
    }

    fun selectRepoGithub(id: Long) {
        _selectedRepoGithub.value = _repoGithubList.value?.find { it.id == id }!!
        dispatch(RepoGithubState.NavToRepoGithubDetails)
    }

    private fun getRepoGithubList() {
        getRepoGithubUseCase.execute(true)
            .doOnSubscribe { dispatch(RepoGithubState.LoadingRepoGithubList) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ list ->
                _repoGithubList.value = list
                dispatch(
                    if (list.isEmpty()) {
                        RepoGithubState.EmptyRepoGithubList
                    } else {
                        RepoGithubState.SuccessRepoGithubList(
                            list.map { repoGithubListMapper.toUiModel(it) }
                        )
                    }
                )
            }, {
                it.printStackTrace()
                dispatch(RepoGithubState.ErrorRepoGithubList)
            })
            .addTo(disposable)
    }
}