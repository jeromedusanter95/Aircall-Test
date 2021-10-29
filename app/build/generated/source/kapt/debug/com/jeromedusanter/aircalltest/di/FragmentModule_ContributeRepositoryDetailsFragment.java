package com.jeromedusanter.aircalltest.di;

import androidx.fragment.app.Fragment;
import com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentModule_ContributeRepositoryDetailsFragment.RepoGithubDetailsFragmentSubcomponent.class
)
public abstract class FragmentModule_ContributeRepositoryDetailsFragment {
  private FragmentModule_ContributeRepositoryDetailsFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(RepoGithubDetailsFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      RepoGithubDetailsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface RepoGithubDetailsFragmentSubcomponent
      extends AndroidInjector<RepoGithubDetailsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RepoGithubDetailsFragment> {}
  }
}
