// Generated by Dagger (https://google.github.io/dagger).
package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class RepoGithubFilterMapper_Factory implements Factory<RepoGithubFilterMapper> {
  private final Provider<RepoGithubSortMapper> sortMapperProvider;

  public RepoGithubFilterMapper_Factory(Provider<RepoGithubSortMapper> sortMapperProvider) {
    this.sortMapperProvider = sortMapperProvider;
  }

  @Override
  public RepoGithubFilterMapper get() {
    return provideInstance(sortMapperProvider);
  }

  public static RepoGithubFilterMapper provideInstance(
      Provider<RepoGithubSortMapper> sortMapperProvider) {
    return new RepoGithubFilterMapper(sortMapperProvider.get());
  }

  public static RepoGithubFilterMapper_Factory create(
      Provider<RepoGithubSortMapper> sortMapperProvider) {
    return new RepoGithubFilterMapper_Factory(sortMapperProvider);
  }

  public static RepoGithubFilterMapper newRepoGithubFilterMapper(RepoGithubSortMapper sortMapper) {
    return new RepoGithubFilterMapper(sortMapper);
  }
}
