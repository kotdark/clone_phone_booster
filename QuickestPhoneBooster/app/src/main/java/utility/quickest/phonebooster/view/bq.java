package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenView_ViewBinding */
class bq extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenView f15168b;
    final /* synthetic */ LockedScreenView_ViewBinding f15169c;

    bq(LockedScreenView_ViewBinding lockedScreenView_ViewBinding, LockedScreenView lockedScreenView) {
        this.f15169c = lockedScreenView_ViewBinding;
        this.f15168b = lockedScreenView;
    }

    public void doClick(View view) {
        this.f15168b.closeChoiceDialog();
    }
}
