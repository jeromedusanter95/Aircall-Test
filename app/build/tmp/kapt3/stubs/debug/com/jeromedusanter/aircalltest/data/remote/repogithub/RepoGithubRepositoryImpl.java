package com.jeromedusanter.aircalltest.data.remote.repogithub;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\r0\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/jeromedusanter/aircalltest/data/remote/repogithub/RepoGithubRepositoryImpl;", "Lcom/jeromedusanter/aircalltest/domain/boundaries/RepoGithubRepository;", "apiService", "Lcom/jeromedusanter/aircalltest/data/remote/ApiService;", "repoGithubMapper", "Lcom/jeromedusanter/aircalltest/data/remote/repogithub/mappers/RepoGithubDataMapper;", "sortMapper", "Lcom/jeromedusanter/aircalltest/data/remote/repogithub/mappers/RepoGithubSortDataMapper;", "issueMapper", "Lcom/jeromedusanter/aircalltest/data/remote/repogithub/mappers/IssueDataMapper;", "(Lcom/jeromedusanter/aircalltest/data/remote/ApiService;Lcom/jeromedusanter/aircalltest/data/remote/repogithub/mappers/RepoGithubDataMapper;Lcom/jeromedusanter/aircalltest/data/remote/repogithub/mappers/RepoGithubSortDataMapper;Lcom/jeromedusanter/aircalltest/data/remote/repogithub/mappers/IssueDataMapper;)V", "getIssuesByRepoGithub", "Lio/reactivex/Single;", "", "Lcom/jeromedusanter/aircalltest/domain/models/Issue;", "owner", "", "repo", "since", "Lorg/threeten/bp/LocalDateTime;", "getRepoGithubList", "Lcom/jeromedusanter/aircalltest/domain/models/RepoGithub;", "filter", "Lcom/jeromedusanter/aircalltest/domain/models/RepoGithubFilter;", "app_debug"})
public final class RepoGithubRepositoryImpl implements com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository {
    private final com.jeromedusanter.aircalltest.data.remote.ApiService apiService = null;
    private final com.jeromedusanter.aircalltest.data.remote.repogithub.mappers.RepoGithubDataMapper repoGithubMapper = null;
    private final com.jeromedusanter.aircalltest.data.remote.repogithub.mappers.RepoGithubSortDataMapper sortMapper = null;
    private final com.jeromedusanter.aircalltest.data.remote.repogithub.mappers.IssueDataMapper issueMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.jeromedusanter.aircalltest.domain.models.RepoGithub>> getRepoGithubList(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter filter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.jeromedusanter.aircalltest.domain.models.Issue>> getIssuesByRepoGithub(@org.jetbrains.annotations.NotNull()
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    java.lang.String repo, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.LocalDateTime since) {
        return null;
    }
    
    @javax.inject.Inject()
    public RepoGithubRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.data.remote.repogithub.mappers.RepoGithubDataMapper repoGithubMapper, @org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.data.remote.repogithub.mappers.RepoGithubSortDataMapper sortMapper, @org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.data.remote.repogithub.mappers.IssueDataMapper issueMapper) {
        super();
    }
}