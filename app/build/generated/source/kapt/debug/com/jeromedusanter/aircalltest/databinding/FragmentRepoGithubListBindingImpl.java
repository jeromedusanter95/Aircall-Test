package com.jeromedusanter.aircalltest.databinding;
import com.jeromedusanter.aircalltest.R;
import com.jeromedusanter.aircalltest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRepoGithubListBindingImpl extends FragmentRepoGithubListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRepoGithubListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentRepoGithubListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListStatefulLayout) bindings[0]
            );
        this.recyclerRepoGithub.setTag(null);
        this.statefulLayoutRepoGithub.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelListUiState((androidx.databinding.ObservableField<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListStatefulLayout.State>) object, fieldId);
            case 1 :
                return onChangeViewModelListUiModel((androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelListUiState(androidx.databinding.ObservableField<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListStatefulLayout.State> ViewModelListUiState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelListUiModel(androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel> ViewModelListUiModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListStatefulLayout.State viewModelListUiStateGet = null;
        com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel viewModelListUiModelGetValue = null;
        androidx.databinding.ObservableField<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListStatefulLayout.State> viewModelListUiState = null;
        com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel viewModel = mViewModel;
        java.lang.String viewModelListUiStateValue = null;
        java.util.List<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubItemUiModel> viewModelListUiModelList = null;
        androidx.lifecycle.LiveData<com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.RepoGithubListUiModel> viewModelListUiModel = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.listUiState
                        viewModelListUiState = viewModel.getListUiState();
                    }
                    updateRegistration(0, viewModelListUiState);


                    if (viewModelListUiState != null) {
                        // read viewModel.listUiState.get()
                        viewModelListUiStateGet = viewModelListUiState.get();
                    }


                    if (viewModelListUiStateGet != null) {
                        // read viewModel.listUiState.get().value
                        viewModelListUiStateValue = viewModelListUiStateGet.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.listUiModel
                        viewModelListUiModel = viewModel.getListUiModel();
                    }
                    updateLiveDataRegistration(1, viewModelListUiModel);


                    if (viewModelListUiModel != null) {
                        // read viewModel.listUiModel.getValue()
                        viewModelListUiModelGetValue = viewModelListUiModel.getValue();
                    }


                    if (viewModelListUiModelGetValue != null) {
                        // read viewModel.listUiModel.getValue().list
                        viewModelListUiModelList = viewModelListUiModelGetValue.getList();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.jeromedusanter.aircalltest.ui.utils.BindingAdaptersKt.setList(this.recyclerRepoGithub, viewModelListUiModelList);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.jeromedusanter.aircalltest.ui.utils.BindingAdaptersKt.setUiState(this.statefulLayoutRepoGithub, viewModelListUiStateValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.listUiState
        flag 1 (0x2L): viewModel.listUiModel
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}