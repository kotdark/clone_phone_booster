package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenView_ViewBinding */
class br extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenView f15170b;
    final /* synthetic */ LockedScreenView_ViewBinding f15171c;

    br(LockedScreenView_ViewBinding lockedScreenView_ViewBinding, LockedScreenView lockedScreenView) {
        this.f15171c = lockedScreenView_ViewBinding;
        this.f15170b = lockedScreenView;
    }

    public void doClick(View view) {
        this.f15170b.closeLockScreen();
    }
}
