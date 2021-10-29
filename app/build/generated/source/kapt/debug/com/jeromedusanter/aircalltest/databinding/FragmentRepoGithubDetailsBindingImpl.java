package com.jeromedusanter.aircalltest.databinding;
import com.jeromedusanter.aircalltest.R;
import com.jeromedusanter.aircalltest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRepoGithubDetailsBindingImpl extends FragmentRepoGithubDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.container, 7);
        sViewsWithIds.put(R.id.text_watchersTitle, 8);
        sViewsWithIds.put(R.id.text_stargazersTitle, 9);
        sViewsWithIds.put(R.id.text_forksTitle, 10);
        sViewsWithIds.put(R.id.text_issues_title, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRepoGithubDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentRepoGithubDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            );
        this.recyclerIssues.setTag(null);
        this.scrollView.setTag(null);
        this.textDescription.setTag(null);
        this.textForksCount.setTag(null);
        this.textStargazersCount.setTag(null);
        this.textTitle.setTag(null);
        this.textWatchersCount.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDetailsUiModel((androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDetailsUiModel(androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel> ViewModelDetailsUiModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelDetailsUiModelName = null;
        java.util.List<com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.IssueUiModel> viewModelDetailsUiModelIssueList = null;
        java.lang.String viewModelDetailsUiModelStargazersCount = null;
        androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel> viewModelDetailsUiModel = null;
        java.lang.String viewModelDetailsUiModelWatchersCount = null;
        java.lang.String viewModelDetailsUiModelForksCount = null;
        com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.RepoGithubDetailsUiModel viewModelDetailsUiModelGetValue = null;
        com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel viewModel = mViewModel;
        java.lang.String viewModelDetailsUiModelDescription = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.detailsUiModel
                    viewModelDetailsUiModel = viewModel.getDetailsUiModel();
                }
                updateLiveDataRegistration(0, viewModelDetailsUiModel);


                if (viewModelDetailsUiModel != null) {
                    // read viewModel.detailsUiModel.getValue()
                    viewModelDetailsUiModelGetValue = viewModelDetailsUiModel.getValue();
                }


                if (viewModelDetailsUiModelGetValue != null) {
                    // read viewModel.detailsUiModel.getValue().name
                    viewModelDetailsUiModelName = viewModelDetailsUiModelGetValue.getName();
                    // read viewModel.detailsUiModel.getValue().issueList
                    viewModelDetailsUiModelIssueList = viewModelDetailsUiModelGetValue.getIssueList();
                    // read viewModel.detailsUiModel.getValue().stargazersCount
                    viewModelDetailsUiModelStargazersCount = viewModelDetailsUiModelGetValue.getStargazersCount();
                    // read viewModel.detailsUiModel.getValue().watchersCount
                    viewModelDetailsUiModelWatchersCount = viewModelDetailsUiModelGetValue.getWatchersCount();
                    // read viewModel.detailsUiModel.getValue().forksCount
                    viewModelDetailsUiModelForksCount = viewModelDetailsUiModelGetValue.getForksCount();
                    // read viewModel.detailsUiModel.getValue().description
                    viewModelDetailsUiModelDescription = viewModelDetailsUiModelGetValue.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.jeromedusanter.aircalltest.ui.utils.BindingAdaptersKt.setList(this.recyclerIssues, viewModelDetailsUiModelIssueList);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textDescription, viewModelDetailsUiModelDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textForksCount, viewModelDetailsUiModelForksCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textStargazersCount, viewModelDetailsUiModelStargazersCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTitle, viewModelDetailsUiModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textWatchersCount, viewModelDetailsUiModelWatchersCount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.detailsUiModel
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}