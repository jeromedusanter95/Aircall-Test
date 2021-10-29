package com.jeromedusanter.aircalltest.domain

import com.jeromedusanter.aircalltest.domain.base.Store
import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository
import com.jeromedusanter.aircalltest.domain.models.RepoGithub
import com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainStore @Inject constructor(
    private val repository: RepoGithubRepository
) : Store<MainAction>(MainState.initialState()) {

    override fun reduce(oldState: MainState, action: MainAction): Observable<*> {
        return when (action) {
            is MainAction.GetRepoGithubListAction -> getRepoGithubList(action, oldState)
        }
    }

    private fun getRepoGithubList(
        action: MainAction.GetRepoGithubListAction,
        oldState: MainState
    ): Observable<List<RepoGithub>> {
        return repository.getRepoGithubList(action.params ?: RepoGithubFilter.newDefaultInstance())
            .doOnSuccess { state = oldState.copy(repoGitHubList = it) }
            .toObservable()
    }
}