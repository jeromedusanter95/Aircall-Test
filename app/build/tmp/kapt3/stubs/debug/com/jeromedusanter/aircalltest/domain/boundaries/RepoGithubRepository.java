package com.jeromedusanter.aircalltest.domain.boundaries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lcom/jeromedusanter/aircalltest/domain/boundaries/RepoGithubRepository;", "", "getIssuesByRepoGithub", "Lio/reactivex/Single;", "", "Lcom/jeromedusanter/aircalltest/domain/models/Issue;", "owner", "", "repo", "since", "Lorg/threeten/bp/LocalDateTime;", "getRepoGithubList", "Lcom/jeromedusanter/aircalltest/domain/models/RepoGithub;", "filter", "Lcom/jeromedusanter/aircalltest/domain/models/RepoGithubFilter;", "app_debug"})
public abstract interface RepoGithubRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.jeromedusanter.aircalltest.domain.models.RepoGithub>> getRepoGithubList(@org.jetbrains.annotations.NotNull()
    com.jeromedusanter.aircalltest.domain.models.RepoGithubFilter filter);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.jeromedusanter.aircalltest.domain.models.Issue>> getIssuesByRepoGithub(@org.jetbrains.annotations.NotNull()
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    java.lang.String repo, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.LocalDateTime since);
}