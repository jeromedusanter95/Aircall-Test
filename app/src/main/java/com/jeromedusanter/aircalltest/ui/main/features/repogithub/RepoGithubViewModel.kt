package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetRepoGithubUseCase
import com.jeromedusanter.aircalltest.ui.base.BaseViewModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListMapper
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

    lateinit var repoGithubList: List<RepoGithub>

    fun selectRepoGithub(id: Long) {
        _selectedRepoGithub.value = repoGithubList.find { it.id == id }!!
        dispatch(RepoGithubState.NavToRepoGithubDetails)
    }

    fun getRepoGithubList() {
        getRepoGithubUseCase.execute(true)
            .doOnSubscribe { dispatch(RepoGithubState.LoadingRepoGithubList) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                repoGithubList = it
                dispatch(RepoGithubState.SuccessRepoGithubList(it.map {
                    repoGithubListMapper.toUiModel(
                        it
                    )
                }))
            }, {
                it.printStackTrace()
                dispatch(RepoGithubState.ErrorRepoGithubList)
            })
            .addTo(disposable)
    }
}