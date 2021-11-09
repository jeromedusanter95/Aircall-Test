package com.jeromedusanter.aircalltest.ui.main.features.repogithub

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.viewModelScope
import com.jeromedusanter.aircalltest.domain.base.Result
import com.jeromedusanter.aircalltest.domain.base.SideEffectListener
import com.jeromedusanter.aircalltest.domain.base.UseCaseException
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetRepoGithubBaseUseCase
import com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetRepoGithubBaseUseCase.SideEffect.*
import com.jeromedusanter.aircalltest.ui.base.BaseViewModel
import com.jeromedusanter.aircalltest.ui.base.CommonUiAction
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListStatefulLayout
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterMapper
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel
import com.jeromedusanter.aircalltest.ui.utils.addOnPropertyChanged
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RepoGithubViewModel @Inject constructor(
    private val getRepoGithubUseCase: GetRepoGithubBaseUseCase,
    private val listMapper: RepoGithubListMapper,
    private val detailsMapper: RepoGithubDetailsMapper,
    private val filterMapper: RepoGithubFilterMapper
) : BaseViewModel() {

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
        _selectedFilter.addOnPropertyChanged { filter ->
            filter.get()?.let {
                filterUiModel = if (it == RepoGithubFilter.newDefaultInstance()) {
                    RepoGithubFilterUiModel(0, "0", "")
                } else {
                    filterMapper.mapModelToUiModel(it)
                }
            }
        }

        listUiState.addOnPropertyChanged {
            doUiAction(RepoGithubAction.InvalidateOptionsMenu)
        }

        getRepoGithubList()
    }

    fun selectRepoGithub(id: Long) {
        _selectedRepoGithub.value = _repoGithubList.value?.find { it.id == id }
        doUiAction(RepoGithubAction.NavToRepoGithubDetails)
    }

    fun refreshPage() {
        _selectedFilter.set(RepoGithubFilter.newDefaultInstance())
        getRepoGithubList()
    }

    fun tryChangeFilter() {
        doUiAction(RepoGithubAction.ShowErrorQueryError(filterUiModel.query.isEmpty()))
        doUiAction(RepoGithubAction.ShowErrorPerPageError(filterUiModel.perPage.isEmpty() || filterUiModel.perPage.toInt() <= 0))
        if (filterUiModel.query.isNotEmpty() && filterUiModel.perPage.isNotEmpty() && filterUiModel.perPage.toInt() > 0) {
            doUiAction(CommonUiAction.HideKeyBoard)
            doUiAction(CommonUiAction.DismissDialog)
            changeFilter()
        }
    }

    private fun changeFilter() {
        _selectedFilter.set(filterMapper.mapUiModelToModel(filterUiModel))
        getRepoGithubList()
    }

    fun getRepoGithubList() {
        listUiState.set(RepoGithubListStatefulLayout.State.LOADING)
        viewModelScope.launch {
            val result = getRepoGithubUseCase.tryExecute(
                params = _selectedFilter.get(),
                listener = getReposSideEffectListener,
            )
            when (result) {
                is Result.Success -> {
                    val list = result.data
                    if (list.isNullOrEmpty()) {
                        listUiState.set(RepoGithubListStatefulLayout.State.EMPTY)
                    } else {
                        _repoGithubList.value = result.data
                        listUiState.set(RepoGithubListStatefulLayout.State.CONTENT)
                    }
                }
                is Result.Error -> {
                    result.exception.printStackTrace()
                    when (result.exception) {
                        UseCaseException.NoNetwork -> listUiState.set(RepoGithubListStatefulLayout.State.ERROR_NO_WIFI)
                        else -> listUiState.set(RepoGithubListStatefulLayout.State.ERROR)
                    }

                }
            }
        }
    }

    private val getReposSideEffectListener =
        SideEffectListener<GetRepoGithubBaseUseCase.SideEffect>(viewModelScope) { sideEffect ->
            Log.d("RepoGithubViewModel", sideEffect.javaClass.name)
            when (sideEffect) {
                SideEffect1 -> doUiAction(CommonUiAction.ShowToast("Test 1"))
                SideEffect2 -> doUiAction(CommonUiAction.ShowToast("Test 1"))
                SideEffect3 -> doUiAction(CommonUiAction.ShowSnackBar("Test 1"))
                SideEffect4 -> doUiAction(CommonUiAction.ShowSnackBar("Test 1"))
            }
        }
}