package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenView_ViewBinding */
class bw extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenView f15180b;
    final /* synthetic */ LockedScreenView_ViewBinding f15181c;

    bw(LockedScreenView_ViewBinding lockedScreenView_ViewBinding, LockedScreenView lockedScreenView) {
        this.f15181c = lockedScreenView_ViewBinding;
        this.f15180b = lockedScreenView;
    }

    public void doClick(View view) {
        this.f15180b.openJunkClean();
    }
}
