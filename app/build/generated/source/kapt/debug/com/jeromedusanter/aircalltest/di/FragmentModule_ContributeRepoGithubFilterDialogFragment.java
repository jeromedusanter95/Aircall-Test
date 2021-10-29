package com.jeromedusanter.aircalltest.di;

import androidx.fragment.app.Fragment;
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterDialogFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentModule_ContributeRepoGithubFilterDialogFragment
          .RepoGithubFilterDialogFragmentSubcomponent.class
)
public abstract class FragmentModule_ContributeRepoGithubFilterDialogFragment {
  private FragmentModule_ContributeRepoGithubFilterDialogFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RepoGithubFilterDialogFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RepoGithubFilterDialogFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RepoGithubFilterDialogFragmentSubcomponent
      extends AndroidInjector<RepoGithubFilterDialogFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RepoGithubFilterDialogFragment> {}
  }
}
