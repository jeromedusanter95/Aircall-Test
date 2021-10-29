package com.jeromedusanter.aircalltest.di;

import androidx.fragment.app.Fragment;
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentModule_ContributeRepositoryListFragment.RepoGithubListFragmentSubcomponent.class
)
public abstract class FragmentModule_ContributeRepositoryListFragment {
  private FragmentModule_ContributeRepositoryListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RepoGithubListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RepoGithubListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RepoGithubListFragmentSubcomponent
      extends AndroidInjector<RepoGithubListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RepoGithubListFragment> {}
  }
}
