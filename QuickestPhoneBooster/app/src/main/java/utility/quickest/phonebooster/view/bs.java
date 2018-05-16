package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenView_ViewBinding */
class bs extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenView f15172b;
    final /* synthetic */ LockedScreenView_ViewBinding f15173c;

    bs(LockedScreenView_ViewBinding lockedScreenView_ViewBinding, LockedScreenView lockedScreenView) {
        this.f15173c = lockedScreenView_ViewBinding;
        this.f15172b = lockedScreenView;
    }

    public void doClick(View view) {
        this.f15172b.onYes();
    }
}
