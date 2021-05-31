package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetIssuesHistoryByRepoSinceLastYearUseCase
import com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetRepoGithubUseCase
import com.jeromedusanter.aircalltest.ui.base.BaseViewModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListStatefulLayout
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel
import com.jeromedusanter.aircalltest.ui.utils.addOnPropertyChanged
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class RepoGithubViewModel @Inject constructor(
    private val getRepoGithubUseCase: GetRepoGithubUseCase,
    private val getIssuesHistoryByRepoSinceLastYearUseCase: GetIssuesHistoryByRepoSinceLastYearUseCase,
    private val listMapper: RepoGithubListMapper,
    private val detailsMapper: RepoGithubDetailsMapper,
    private val filterMapper: RepoGithubFilterMapper
) : BaseViewModel<RepoGithubAction>() {

    private val _selectedRepoGithub = MutableLiveData<RepoGithub>()
    val detailsUiModel = Transformations.map(_selectedRepoGithub) {
        it?.let { detailsMapper.mapModelToUiModel(it) }
    }

    val listUiState = ObservableField(RepoGithubListStatefulLayout.State.CONTENT)

    private val _repoGithubList = MutableLiveData<List<RepoGithub>>()
    val listUiModel: LiveData<RepoGithubListUiModel> = Transformations.map(_repoGithubList) {
        RepoGithubListUiModel(it?.map { listMapper.mapModelToUiModel(it) } ?: emptyList())
    }

    private val _selectedFilter = ObservableField(RepoGithubFilter.newDefaultInstance())
    var filterUiModel = RepoGithubFilterUiModel(0, "0", "")

    init {
        getRepoGithubList()

        _selectedFilter.addOnPropertyChanged {
            it.get()?.let {
                if (it == RepoGithubFilter.newDefaultInstance()) {
                    filterUiModel = RepoGithubFilterUiModel(0, "0", "")
                } else {
                    filterUiModel = filterMapper.mapModelToUiModel(it)
                }
            }
        }

        listUiState.addOnPropertyChanged {
            dispatch(RepoGithubAction.InvalidateOptionsMenu)
        }
    }

    fun selectRepoGithub(id: Long) {
        _selectedRepoGithub.value = _repoGithubList.value?.find { it.id == id }
        dispatch(RepoGithubAction.NavToRepoGithubDetails)
    }

    fun refreshPage() {
        _selectedFilter.set(RepoGithubFilter.newDefaultInstance())
        getRepoGithubList()
    }

    fun tryChangeFilter() {
        dispatch(RepoGithubAction.ShowErrorQueryError(filterUiModel.query.isEmpty()))
        dispatch(RepoGithubAction.ShowErrorPerPageError(filterUiModel.perPage.isEmpty() || filterUiModel.perPage.toInt() <= 0))
        if (filterUiModel.query.isNotEmpty() && filterUiModel.perPage.isNotEmpty() && filterUiModel.perPage.toInt() > 0) {
            dispatch(RepoGithubAction.HideKeyBoard)
            dispatch(RepoGithubAction.DismissFilterDialog)
            changeFilter()
        }
    }

    private fun changeFilter() {
        _selectedFilter.set(filterMapper.mapUiModelToModel(filterUiModel))
        getRepoGithubList()
    }

    fun getRepoGithubList() {
        getRepoGithubUseCase.execute(_selectedFilter.get())
            .flatMap { repoGithubList ->
                Single.merge(repoGithubList.map { repo ->
                    getIssuesHistoryByRepoSinceLastYearUseCase.execute(Pair(repo.owner, repo.name))
                        .map { repo.copy(issuesHistory = it.toMutableList()) }
                })
                    .toList()
            }
            .doOnSubscribe { listUiState.set(RepoGithubListStatefulLayout.State.LOADING) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ list ->
                _repoGithubList.value = list
                listUiState.set(
                    if (list.isEmpty()) RepoGithubListStatefulLayout.State.EMPTY
                    else RepoGithubListStatefulLayout.State.CONTENT
                )
            }, {
                it.printStackTrace()
                listUiState.set(RepoGithubListStatefulLayout.State.ERROR)
            })
            .addTo(disposable)
    }
}