package com.jeromedusanter.aircalltest.ui.main.features.repogithub.list;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.jeromedusanter.aircalltest.R;

public class RepoGithubListFragmentDirections {
  private RepoGithubListFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigateToRepoGithubDetails() {
    return new ActionOnlyNavDirections(R.id.action_navigate_to_repo_github_details);
  }

  @NonNull
  public static NavDirections actionNavigateToTest() {
    return new ActionOnlyNavDirections(R.id.action_navigate_to_test);
  }
}
