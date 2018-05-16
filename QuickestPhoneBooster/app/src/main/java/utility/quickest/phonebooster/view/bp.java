package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenView_ViewBinding */
class bp extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenView f15166b;
    final /* synthetic */ LockedScreenView_ViewBinding f15167c;

    bp(LockedScreenView_ViewBinding lockedScreenView_ViewBinding, LockedScreenView lockedScreenView) {
        this.f15167c = lockedScreenView_ViewBinding;
        this.f15166b = lockedScreenView;
    }

    public void doClick(View view) {
        this.f15166b.closeWindow();
    }
}
