// Generated by Dagger (https://google.github.io/dagger).
package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list;

import dagger.internal.Factory;

public final class RepoGithubListMapper_Factory implements Factory<RepoGithubListMapper> {
  private static final RepoGithubListMapper_Factory INSTANCE = new RepoGithubListMapper_Factory();

  @Override
  public RepoGithubListMapper get() {
    return provideInstance();
  }

  public static RepoGithubListMapper provideInstance() {
    return new RepoGithubListMapper();
  }

  public static RepoGithubListMapper_Factory create() {
    return INSTANCE;
  }

  public static RepoGithubListMapper newRepoGithubListMapper() {
    return new RepoGithubListMapper();
  }
}
