package com.jeromedusanter.aircalltest;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jeromedusanter.aircalltest.databinding.ActivityLoginBindingImpl;
import com.jeromedusanter.aircalltest.databinding.ActivityMainBindingImpl;
import com.jeromedusanter.aircalltest.databinding.DialogRepoGithubFilterBindingImpl;
import com.jeromedusanter.aircalltest.databinding.FragmentRepoGithubDetailsBindingImpl;
import com.jeromedusanter.aircalltest.databinding.FragmentRepoGithubListBindingImpl;
import com.jeromedusanter.aircalltest.databinding.FragmentTestBindingImpl;
import com.jeromedusanter.aircalltest.databinding.ItemIssueBindingImpl;
import com.jeromedusanter.aircalltest.databinding.ItemRepoGithubBindingImpl;
import com.jeromedusanter.aircalltest.databinding.SflRepoGithubListErrorBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_DIALOGREPOGITHUBFILTER = 3;

  private static final int LAYOUT_FRAGMENTREPOGITHUBDETAILS = 4;

  private static final int LAYOUT_FRAGMENTREPOGITHUBLIST = 5;

  private static final int LAYOUT_FRAGMENTTEST = 6;

  private static final int LAYOUT_ITEMISSUE = 7;

  private static final int LAYOUT_ITEMREPOGITHUB = 8;

  private static final int LAYOUT_SFLREPOGITHUBLISTERROR = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jeromedusanter.aircalltest.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jeromedusanter.aircalltest.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jeromedusanter.aircalltest.R.layout.dialog_repo_github_filter, LAYOUT_DIALOGREPOGITHUBFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jeromedusanter.aircalltest.R.layout.fragment_repo_github_details, LAYOUT_FRAGMENTREPOGITHUBDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jeromedusanter.aircalltest.R.layout.fragment_repo_github_list, LAYOUT_FRAGMENTREPOGITHUBLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jeromedusanter.aircalltest.R.layout.fragment_test, LAYOUT_FRAGMENTTEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jeromedusanter.aircalltest.R.layout.item_issue, LAYOUT_ITEMISSUE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jeromedusanter.aircalltest.R.layout.item_repo_github, LAYOUT_ITEMREPOGITHUB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jeromedusanter.aircalltest.R.layout.sfl_repo_github_list_error, LAYOUT_SFLREPOGITHUBLISTERROR);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGREPOGITHUBFILTER: {
          if ("layout/dialog_repo_github_filter_0".equals(tag)) {
            return new DialogRepoGithubFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_repo_github_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREPOGITHUBDETAILS: {
          if ("layout/fragment_repo_github_details_0".equals(tag)) {
            return new FragmentRepoGithubDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_repo_github_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREPOGITHUBLIST: {
          if ("layout/fragment_repo_github_list_0".equals(tag)) {
            return new FragmentRepoGithubListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_repo_github_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEST: {
          if ("layout/fragment_test_0".equals(tag)) {
            return new FragmentTestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_test is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMISSUE: {
          if ("layout/item_issue_0".equals(tag)) {
            return new ItemIssueBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_issue is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREPOGITHUB: {
          if ("layout/item_repo_github_0".equals(tag)) {
            return new ItemRepoGithubBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_repo_github is invalid. Received: " + tag);
        }
        case  LAYOUT_SFLREPOGITHUBLISTERROR: {
          if ("layout/sfl_repo_github_list_error_0".equals(tag)) {
            return new SflRepoGithubListErrorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sfl_repo_github_list_error is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "perPage");
      sKeys.put(2, "query");
      sKeys.put(3, "sort");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_login_0", com.jeromedusanter.aircalltest.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.jeromedusanter.aircalltest.R.layout.activity_main);
      sKeys.put("layout/dialog_repo_github_filter_0", com.jeromedusanter.aircalltest.R.layout.dialog_repo_github_filter);
      sKeys.put("layout/fragment_repo_github_details_0", com.jeromedusanter.aircalltest.R.layout.fragment_repo_github_details);
      sKeys.put("layout/fragment_repo_github_list_0", com.jeromedusanter.aircalltest.R.layout.fragment_repo_github_list);
      sKeys.put("layout/fragment_test_0", com.jeromedusanter.aircalltest.R.layout.fragment_test);
      sKeys.put("layout/item_issue_0", com.jeromedusanter.aircalltest.R.layout.item_issue);
      sKeys.put("layout/item_repo_github_0", com.jeromedusanter.aircalltest.R.layout.item_repo_github);
      sKeys.put("layout/sfl_repo_github_list_error_0", com.jeromedusanter.aircalltest.R.layout.sfl_repo_github_list_error);
    }
  }
}
