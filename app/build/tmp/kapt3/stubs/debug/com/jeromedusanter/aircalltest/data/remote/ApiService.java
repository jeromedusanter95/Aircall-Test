package com.jeromedusanter.aircalltest.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\'JK\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0007H\'\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/jeromedusanter/aircalltest/data/remote/ApiService;", "", "fetchIssuesByRepo", "Lio/reactivex/Single;", "", "Lcom/jeromedusanter/aircalltest/data/remote/repogithub/models/IssueApi;", "owner", "", "repo", "since", "page", "", "perPage", "fetchRepositories", "Lcom/jeromedusanter/aircalltest/data/remote/repogithub/models/RepoGithubApiResponse;", "sort", "order", "query", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)Lio/reactivex/Single;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/repositories")
    public abstract io.reactivex.Single<com.jeromedusanter.aircalltest.data.remote.repogithub.models.RepoGithubApiResponse> fetchRepositories(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "sort")
    java.lang.String sort, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "order")
    java.lang.String order, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @retrofit2.http.Query(value = "per_page")
    int perPage, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "repos/{owner}/{repo}/issues")
    public abstract io.reactivex.Single<java.util.List<com.jeromedusanter.aircalltest.data.remote.repogithub.models.IssueApi>> fetchIssuesByRepo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "owner")
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "repo")
    java.lang.String repo, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "since")
    java.lang.String since, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}