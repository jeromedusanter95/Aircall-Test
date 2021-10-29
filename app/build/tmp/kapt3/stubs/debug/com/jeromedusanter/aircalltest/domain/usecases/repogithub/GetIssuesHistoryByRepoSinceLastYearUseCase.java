package com.jeromedusanter.aircalltest.domain.usecases.repogithub;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/jeromedusanter/aircalltest/domain/usecases/repogithub/GetIssuesHistoryByRepoSinceLastYearUseCase;", "Lcom/jeromedusanter/aircalltest/domain/base/IUseCase;", "Lkotlin/Pair;", "", "Lio/reactivex/Single;", "", "Lcom/jeromedusanter/aircalltest/domain/models/IssuesHistoryByWeek;", "repository", "Lcom/jeromedusanter/aircalltest/domain/boundaries/RepoGithubRepository;", "(Lcom/jeromedusanter/aircalltest/domain/boundaries/RepoGithubRepository;)V", "execute", "param", "app_debug"})
public final class GetIssuesHistoryByRepoSinceLastYearUseCase implements com.jeromedusanter.aircalltest.domain.base.IUseCase<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, io.reactivex.Single<java.util.List<? extends com.jeromedusanter.aircalltest.domain.models.IssuesHistoryByWeek>>> {
    private final com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.jeromedusanter.aircalltest.domain.models.IssuesHistoryByWeek>> execute(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.String, java.lang.String> param) {
        return null;
    }
    
    @javax.inject.Inject()
    public GetIssuesHistoryByRepoSinceLastYearUseCase(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository repository) {
        super();
    }
}