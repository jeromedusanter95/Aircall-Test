package com.jeromedusanter.aircalltest.ui.main.features.repogithub;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020,J\u0006\u0010.\u001a\u00020,J\u000e\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020,R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u001f\u0010\'\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010(0(0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/RepoGithubViewModel;", "Lcom/jeromedusanter/aircalltest/ui/base/BaseViewModel;", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/RepoGithubAction;", "getRepoGithubUseCase", "Lcom/jeromedusanter/aircalltest/domain/usecases/repogithub/GetRepoGithubUseCase;", "getIssuesHistoryByRepoSinceLastYearUseCase", "Lcom/jeromedusanter/aircalltest/domain/usecases/repogithub/GetIssuesHistoryByRepoSinceLastYearUseCase;", "listMapper", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListMapper;", "detailsMapper", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/details/RepoGithubDetailsMapper;", "filterMapper", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/filter/RepoGithubFilterMapper;", "mainStore", "Lcom/jeromedusanter/aircalltest/domain/MainStore;", "(Lcom/jeromedusanter/aircalltest/domain/usecases/repogithub/GetRepoGithubUseCase;Lcom/jeromedusanter/aircalltest/domain/usecases/repogithub/GetIssuesHistoryByRepoSinceLastYearUseCase;Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListMapper;Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/details/RepoGithubDetailsMapper;Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/filter/RepoGithubFilterMapper;Lcom/jeromedusanter/aircalltest/domain/MainStore;)V", "_repoGithubList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/jeromedusanter/aircalltest/domain/models/RepoGithub;", "_selectedFilter", "Landroidx/databinding/ObservableField;", "Lcom/jeromedusanter/aircalltest/domain/models/RepoGithubFilter;", "kotlin.jvm.PlatformType", "_selectedRepoGithub", "detailsUiModel", "Landroidx/lifecycle/LiveData;", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/details/RepoGithubDetailsUiModel;", "getDetailsUiModel", "()Landroidx/lifecycle/LiveData;", "filterUiModel", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/filter/RepoGithubFilterUiModel;", "getFilterUiModel", "()Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/filter/RepoGithubFilterUiModel;", "setFilterUiModel", "(Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/filter/RepoGithubFilterUiModel;)V", "listUiModel", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListUiModel;", "getListUiModel", "listUiState", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListStatefulLayout$State;", "getListUiState", "()Landroidx/databinding/ObservableField;", "changeFilter", "", "getRepoGithubList", "refreshPage", "selectRepoGithub", "id", "", "tryChangeFilter", "app_debug"})
public final class RepoGithubViewModel extends com.jeromedusanter.aircalltest.ui.base.BaseViewModel<com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubAction> {
    private final androidx.lifecycle.MutableLiveData<com.jeromedusanter.aircalltest.domain.models.RepoGithub> _selectedRepoGithub = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel> detailsUiModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListStatefulLayout.State> listUiState = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jeromedusanter.aircalltest.domain.models.RepoGithub>> _repoGithubList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel> listUiModel = null;
    private final androidx.databinding.ObservableField<com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter> _selectedFilter = null;
    @org.jetbrains.annotations.NotNull()
    private com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel filterUiModel;
    private final com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetRepoGithubUseCase getRepoGithubUseCase = null;
    private final com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetIssuesHistoryByRepoSinceLastYearUseCase getIssuesHistoryByRepoSinceLastYearUseCase = null;
    private final com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListMapper listMapper = null;
    private final com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsMapper detailsMapper = null;
    private final com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterMapper filterMapper = null;
    private final com.jeromedusanter.aircalltest.domain.MainStore mainStore = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel> getDetailsUiModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListStatefulLayout.State> getListUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel> getListUiModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel getFilterUiModel() {
        return null;
    }
    
    public final void setFilterUiModel(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel p0) {
    }
    
    public final void selectRepoGithub(long id) {
    }
    
    public final void refreshPage() {
    }
    
    public final void tryChangeFilter() {
    }
    
    private final void changeFilter() {
    }
    
    public final void getRepoGithubList() {
    }
    
    @javax.inject.Inject()
    public RepoGithubViewModel(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetRepoGithubUseCase getRepoGithubUseCase, @org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.usecases.repogithub.GetIssuesHistoryByRepoSinceLastYearUseCase getIssuesHistoryByRepoSinceLastYearUseCase, @org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListMapper listMapper, @org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsMapper detailsMapper, @org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterMapper filterMapper, @org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.MainStore mainStore) {
        super();
    }
}