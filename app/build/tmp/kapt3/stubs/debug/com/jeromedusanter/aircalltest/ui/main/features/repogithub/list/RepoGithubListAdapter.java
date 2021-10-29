package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\tB\u0011\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListAdapter;", "Lcom/jeromedusanter/aircalltest/ui/base/BaseAdapter;", "Lcom/jeromedusanter/aircalltest/databinding/ItemRepoGithubBinding;", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubItemUiModel;", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubItemViewModel;", "listener", "Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListAdapter$Listener;", "(Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListAdapter$Listener;)V", "createViewModel", "Listener", "app_debug"})
public final class RepoGithubListAdapter extends com.jeromedusanter.aircalltest.ui.base.BaseAdapter<com.jeromedusanter.aircalltest.databinding.ItemRepoGithubBinding, com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubItemUiModel, com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubItemViewModel> {
    private final com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListAdapter.Listener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubItemViewModel createViewModel() {
        return null;
    }
    
    public RepoGithubListAdapter(@org.jetbrains.annotations.Nullable()
    com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListAdapter.Listener listener) {
        super(0);
    }
    
    public RepoGithubListAdapter() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/jeromedusanter/aircalltest/ui/main/features/repogithub/list/RepoGithubListAdapter$Listener;", "", "onClickItem", "", "itemId", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClickItem(long itemId);
    }
}