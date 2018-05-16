package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenView_ViewBinding */
class bv extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenView f15178b;
    final /* synthetic */ LockedScreenView_ViewBinding f15179c;

    bv(LockedScreenView_ViewBinding lockedScreenView_ViewBinding, LockedScreenView lockedScreenView) {
        this.f15179c = lockedScreenView_ViewBinding;
        this.f15178b = lockedScreenView;
    }

    public void doClick(View view) {
        this.f15178b.openMemoryClean();
    }
}
