// Generated by Dagger (https://google.github.io/dagger).
package com.jeromedusanter.aircalltest.data.remote.repogithub.mappers;

import dagger.internal.Factory;

public final class IssueDataMapper_Factory implements Factory<IssueDataMapper> {
  private static final IssueDataMapper_Factory INSTANCE = new IssueDataMapper_Factory();

  @Override
  public IssueDataMapper get() {
    return provideInstance();
  }

  public static IssueDataMapper provideInstance() {
    return new IssueDataMapper();
  }

  public static IssueDataMapper_Factory create() {
    return INSTANCE;
  }

  public static IssueDataMapper newIssueDataMapper() {
    return new IssueDataMapper();
  }
}
