package com.jeromedusanter.aircalltest.databinding;
import com.jeromedusanter.aircalltest.R;
import com.jeromedusanter.aircalltest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemIssueBindingImpl extends ItemIssueBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemIssueBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemIssueBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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
            setViewModel((com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.IssueItemViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.IssueItemViewModel ViewModel) {
        updateRegistration(4, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelWeekEndDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelWeek((androidx.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeViewModelWeekStartDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelAmount((androidx.databinding.ObservableInt) object, fieldId);
            case 4 :
                return onChangeViewModel((com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.IssueItemViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelWeekEndDate(androidx.databinding.ObservableField<java.lang.String> ViewModelWeekEndDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWeek(androidx.databinding.ObservableInt ViewModelWeek, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWeekStartDate(androidx.databinding.ObservableField<java.lang.String> ViewModelWeekStartDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAmount(androidx.databinding.ObservableInt ViewModelAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.IssueItemViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
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
        java.lang.String mboundView1AndroidStringRepoGithubDetailsIssuesWeekViewModelWeek = null;
        int viewModelWeekGet = 0;
        java.lang.String mboundView2AndroidStringRepoGithubDetailsIssuesIntervalDatesViewModelWeekStartDateViewModelWeekEndDate = null;
        java.lang.String mboundView3AndroidStringRepoGithubDetailsIssuesAmountViewModelAmount = null;
        java.lang.String viewModelWeekEndDateGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelWeekEndDate = null;
        androidx.databinding.ObservableInt viewModelWeek = null;
        java.lang.String viewModelWeekStartDateGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelWeekStartDate = null;
        androidx.databinding.ObservableInt viewModelAmount = null;
        int viewModelAmountGet = 0;
        com.jeromedusanter.aircalltest.ui.main.features.repogithub.details.IssueItemViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x35L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.weekEndDate
                        viewModelWeekEndDate = viewModel.getWeekEndDate();
                        // read viewModel.weekStartDate
                        viewModelWeekStartDate = viewModel.getWeekStartDate();
                    }
                    updateRegistration(0, viewModelWeekEndDate);
                    updateRegistration(2, viewModelWeekStartDate);


                    if (viewModelWeekEndDate != null) {
                        // read viewModel.weekEndDate.get()
                        viewModelWeekEndDateGet = viewModelWeekEndDate.get();
                    }
                    if (viewModelWeekStartDate != null) {
                        // read viewModel.weekStartDate.get()
                        viewModelWeekStartDateGet = viewModelWeekStartDate.get();
                    }


                    // read @android:string/repo_github_details_issues_interval_dates
                    mboundView2AndroidStringRepoGithubDetailsIssuesIntervalDatesViewModelWeekStartDateViewModelWeekEndDate = mboundView2.getResources().getString(R.string.repo_github_details_issues_interval_dates, viewModelWeekStartDateGet, viewModelWeekEndDateGet);
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.week
                        viewModelWeek = viewModel.getWeek();
                    }
                    updateRegistration(1, viewModelWeek);


                    if (viewModelWeek != null) {
                        // read viewModel.week.get()
                        viewModelWeekGet = viewModelWeek.get();
                    }


                    // read @android:string/repo_github_details_issues_week
                    mboundView1AndroidStringRepoGithubDetailsIssuesWeekViewModelWeek = mboundView1.getResources().getString(R.string.repo_github_details_issues_week, viewModelWeekGet);
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.amount
                        viewModelAmount = viewModel.getAmount();
                    }
                    updateRegistration(3, viewModelAmount);


                    if (viewModelAmount != null) {
                        // read viewModel.amount.get()
                        viewModelAmountGet = viewModelAmount.get();
                    }


                    // read @android:string/repo_github_details_issues_amount
                    mboundView3AndroidStringRepoGithubDetailsIssuesAmountViewModelAmount = mboundView3.getResources().getString(R.string.repo_github_details_issues_amount, viewModelAmountGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mboundView1AndroidStringRepoGithubDetailsIssuesWeekViewModelWeek);
        }
        if ((dirtyFlags & 0x35L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, mboundView2AndroidStringRepoGithubDetailsIssuesIntervalDatesViewModelWeekStartDateViewModelWeekEndDate);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, mboundView3AndroidStringRepoGithubDetailsIssuesAmountViewModelAmount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.weekEndDate
        flag 1 (0x2L): viewModel.week
        flag 2 (0x3L): viewModel.weekStartDate
        flag 3 (0x4L): viewModel.amount
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}