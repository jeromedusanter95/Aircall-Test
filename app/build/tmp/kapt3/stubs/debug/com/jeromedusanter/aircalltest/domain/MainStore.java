package com.jeromedusanter.aircalltest.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J$\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/jeromedusanter/aircalltest/domain/MainStore;", "Lcom/jeromedusanter/aircalltest/domain/base/Store;", "Lcom/jeromedusanter/aircalltest/domain/MainAction;", "repository", "Lcom/jeromedusanter/aircalltest/domain/boundaries/RepoGithubRepository;", "(Lcom/jeromedusanter/aircalltest/domain/boundaries/RepoGithubRepository;)V", "getRepoGithubList", "Lio/reactivex/Observable;", "", "Lcom/jeromedusanter/aircalltest/domain/models/RepoGithub;", "action", "Lcom/jeromedusanter/aircalltest/domain/MainAction$GetRepoGithubListAction;", "oldState", "Lcom/jeromedusanter/aircalltest/domain/MainState;", "reduce", "app_debug"})
@javax.inject.Singleton()
public final class MainStore extends com.jeromedusanter.aircalltest.domain.base.Store<com.jeromedusanter.aircalltest.domain.MainAction> {
    private final com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<?> reduce(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.MainState oldState, @org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.MainAction action) {
        return null;
    }
    
    private final io.reactivex.Observable<java.util.List<com.jeromedusanter.aircalltest.domain.models.RepoGithub>> getRepoGithubList(com.jeromedusanter.aircalltest.domain.MainAction.GetRepoGithubListAction action, com.jeromedusanter.aircalltest.domain.MainState oldState) {
        return null;
    }
    
    @javax.inject.Inject()
    public MainStore(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository repository) {
        super(null);
    }
}