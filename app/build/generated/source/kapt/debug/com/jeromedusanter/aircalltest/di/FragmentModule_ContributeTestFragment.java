package com.jeromedusanter.aircalltest.di;

import androidx.fragment.app.Fragment;
import com.jeromedusanter.aircalltest.ui.main.features.test.TestFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentModule_ContributeTestFragment.TestFragmentSubcomponent.class)
public abstract class FragmentModule_ContributeTestFragment {
  private FragmentModule_ContributeTestFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(TestFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TestFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TestFragmentSubcomponent extends AndroidInjector<TestFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TestFragment> {}
  }
}
