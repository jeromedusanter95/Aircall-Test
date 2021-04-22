package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import androidx.databinding.ObservableField
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetRepoGithubUseCase
import com.jeromedusanter.aircalltest.ui.base.BaseViewModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel
import com.jeromedusanter.aircalltest.ui.utils.addOnPropertyChanged
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RepoGithubViewModel @Inject constructor(
    private val getRepoGithubUseCase: GetRepoGithubUseCase,
    private val listMapper: RepoGithubListMapper,
    private val detailsMapper: RepoGithubDetailsMapper,
    private val filterMapper: RepoGithubFilterMapper
) : BaseViewModel<RepoGithubState>() {

    val detailsUiModel = ObservableField<RepoGithubDetailsUiModel>()
    private val _selectedRepoGithub = ObservableField<RepoGithub>()

    val listUiModel = ObservableField<RepoGithubListUiModel>()
    private val _repoGithubList = ObservableField<List<RepoGithub>>()

    val filterUiModel = ObservableField<RepoGithubFilterUiModel>()
    private val _selectedFilter = ObservableField<RepoGithubFilter>()

    init {
        getRepoGithubList()

        _selectedRepoGithub.addOnPropertyChanged {
            it.get()?.let {
                detailsUiModel.set(detailsMapper.mapModelToUiModel(it))
            }
        }

        _repoGithubList.addOnPropertyChanged {
            it.get()?.let {
                listUiModel.set(RepoGithubListUiModel(it.map {
                    listMapper.mapModelToUiModel(it)
                }))
            }
        }

        _selectedFilter.addOnPropertyChanged {
            it.get()?.let {
                filterUiModel.set(filterMapper.mapModelToUiModel(it))
            }
        }
    }

    fun selectRepoGithub(id: Long) {
        _selectedRepoGithub.set(_repoGithubList.get()?.find { it.id == id })
        dispatch(RepoGithubState.NavToRepoGithubDetails)
    }

    fun refreshPage() {
        _selectedFilter.set(null)
        getRepoGithubList()
    }

    fun changeFilter(uiModel: RepoGithubFilterUiModel) {
        _selectedFilter.set(filterMapper.mapUiModelToModel(uiModel))
        getRepoGithubList()
    }

    fun getRepoGithubList() {
        getRepoGithubUseCase.execute(_selectedFilter.get())
            .delay(2, TimeUnit.SECONDS) //To see the beautiful lottie animation :)
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