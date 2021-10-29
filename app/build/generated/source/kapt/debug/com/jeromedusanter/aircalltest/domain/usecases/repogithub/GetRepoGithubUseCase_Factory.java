// Generated by Dagger (https://google.github.io/dagger).
package com.jeromedusanter.aircalltest.domain.usecases.repogithub;

import com.jeromedusanter.aircalltest.domain.boundaries.RepoGithubRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetRepoGithubUseCase_Factory implements Factory<GetRepoGithubUseCase> {
  private final Provider<RepoGithubRepository> repositoryProvider;

  public GetRepoGithubUseCase_Factory(Provider<RepoGithubRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetRepoGithubUseCase get() {
    return provideInstance(repositoryProvider);
  }

  public static GetRepoGithubUseCase provideInstance(
      Provider<RepoGithubRepository> repositoryProvider) {
    return new GetRepoGithubUseCase(repositoryProvider.get());
  }

  public static GetRepoGithubUseCase_Factory create(
      Provider<RepoGithubRepository> repositoryProvider) {
    return new GetRepoGithubUseCase_Factory(repositoryProvider);
  }

  public static GetRepoGithubUseCase newGetRepoGithubUseCase(RepoGithubRepository repository) {
    return new GetRepoGithubUseCase(repository);
  }
}
