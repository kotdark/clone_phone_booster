package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenView_ViewBinding */
class bt extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenView f15174b;
    final /* synthetic */ LockedScreenView_ViewBinding f15175c;

    bt(LockedScreenView_ViewBinding lockedScreenView_ViewBinding, LockedScreenView lockedScreenView) {
        this.f15175c = lockedScreenView_ViewBinding;
        this.f15174b = lockedScreenView;
    }

    public void doClick(View view) {
        this.f15174b.onNo();
    }
}
