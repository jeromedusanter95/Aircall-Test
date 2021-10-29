package com.jeromedusanter.aircalltest.databinding;
import com.jeromedusanter.aircalltest.R;
import com.jeromedusanter.aircalltest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogRepoGithubFilterBindingImpl extends DialogRepoGithubFilterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.container, 4);
        sViewsWithIds.put(R.id.text_title, 5);
        sViewsWithIds.put(R.id.text_input_query, 6);
        sViewsWithIds.put(R.id.text_input_per_page, 7);
        sViewsWithIds.put(R.id.button_validate, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editPerPageandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.filterUiModel.perPage
            //         is viewModel.filterUiModel.setPerPage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPerPage);
            // localize variables for thread safety
            // viewModel.filterUiModel
            com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel viewModelFilterUiModel = null;
            // viewModel
            com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.filterUiModel.perPage
            java.lang.String viewModelFilterUiModelPerPage = null;
            // viewModel.filterUiModel != null
            boolean viewModelFilterUiModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFilterUiModel = viewModel.getFilterUiModel();

                viewModelFilterUiModelJavaLangObjectNull = (viewModelFilterUiModel) != (null);
                if (viewModelFilterUiModelJavaLangObjectNull) {




                    viewModelFilterUiModel.setPerPage(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editQueryandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.filterUiModel.query
            //         is viewModel.filterUiModel.setQuery((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editQuery);
            // localize variables for thread safety
            // viewModel.filterUiModel.query
            java.lang.String viewModelFilterUiModelQuery = null;
            // viewModel.filterUiModel
            com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel viewModelFilterUiModel = null;
            // viewModel
            com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.filterUiModel != null
            boolean viewModelFilterUiModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFilterUiModel = viewModel.getFilterUiModel();

                viewModelFilterUiModelJavaLangObjectNull = (viewModelFilterUiModel) != (null);
                if (viewModelFilterUiModelJavaLangObjectNull) {




                    viewModelFilterUiModel.setQuery(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener radioGroupSortandroidCheckedButtonAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.filterUiModel.sort
            //         is viewModel.filterUiModel.setSort((int) callbackArg_0)
            int callbackArg_0 = radioGroupSort.getCheckedRadioButtonId();
            // localize variables for thread safety
            // viewModel.filterUiModel.sort
            int viewModelFilterUiModelSort = 0;
            // viewModel.filterUiModel
            com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel viewModelFilterUiModel = null;
            // viewModel
            com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.filterUiModel != null
            boolean viewModelFilterUiModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFilterUiModel = viewModel.getFilterUiModel();

                viewModelFilterUiModelJavaLangObjectNull = (viewModelFilterUiModel) != (null);
                if (viewModelFilterUiModelJavaLangObjectNull) {




                    viewModelFilterUiModel.setSort(((int) (callbackArg_0)));
                }
            }
        }
    };

    public DialogRepoGithubFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private DialogRepoGithubFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (android.widget.RadioGroup) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            );
        this.editPerPage.setTag(null);
        this.editQuery.setTag(null);
        this.radioGroupSort.setTag(null);
        this.scrollView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
                return onChangeViewModelFilterUiModel((com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFilterUiModel(com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel ViewModelFilterUiModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.sort) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.query) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.perPage) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String viewModelFilterUiModelQuery = null;
        int viewModelFilterUiModelSort = 0;
        com.jeromedusanter.aircalltest.ui.main.features.repogithub.list.filter.RepoGithubFilterUiModel viewModelFilterUiModel = null;
        com.jeromedusanter.aircalltest.ui.main.features.repogithub.RepoGithubViewModel viewModel = mViewModel;
        java.lang.String viewModelFilterUiModelPerPage = null;

        if ((dirtyFlags & 0x3fL) != 0) {



                if (viewModel != null) {
                    // read viewModel.filterUiModel
                    viewModelFilterUiModel = viewModel.getFilterUiModel();
                }
                updateRegistration(0, viewModelFilterUiModel);

            if ((dirtyFlags & 0x2bL) != 0) {

                    if (viewModelFilterUiModel != null) {
                        // read viewModel.filterUiModel.query
                        viewModelFilterUiModelQuery = viewModelFilterUiModel.getQuery();
                    }
            }
            if ((dirtyFlags & 0x27L) != 0) {

                    if (viewModelFilterUiModel != null) {
                        // read viewModel.filterUiModel.sort
                        viewModelFilterUiModelSort = viewModelFilterUiModel.getSort();
                    }
            }
            if ((dirtyFlags & 0x33L) != 0) {

                    if (viewModelFilterUiModel != null) {
                        // read viewModel.filterUiModel.perPage
                        viewModelFilterUiModelPerPage = viewModelFilterUiModel.getPerPage();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x33L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPerPage, viewModelFilterUiModelPerPage);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPerPage, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPerPageandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editQuery, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editQueryandroidTextAttrChanged);
            androidx.databinding.adapters.RadioGroupBindingAdapter.setListeners(this.radioGroupSort, (android.widget.RadioGroup.OnCheckedChangeListener)null, radioGroupSortandroidCheckedButtonAttrChanged);
        }
        if ((dirtyFlags & 0x2bL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editQuery, viewModelFilterUiModelQuery);
        }
        if ((dirtyFlags & 0x27L) != 0) {
            // api target 1

            androidx.databinding.adapters.RadioGroupBindingAdapter.setCheckedButton(this.radioGroupSort, viewModelFilterUiModelSort);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.filterUiModel
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): viewModel.filterUiModel.sort
        flag 3 (0x4L): viewModel.filterUiModel.query
        flag 4 (0x5L): viewModel.filterUiModel.perPage
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}