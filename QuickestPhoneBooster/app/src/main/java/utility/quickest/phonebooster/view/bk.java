package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenViewWithAd_ViewBinding */
class bk extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenViewWithAd f15156b;
    final /* synthetic */ LockedScreenViewWithAd_ViewBinding f15157c;

    bk(LockedScreenViewWithAd_ViewBinding lockedScreenViewWithAd_ViewBinding, LockedScreenViewWithAd lockedScreenViewWithAd) {
        this.f15157c = lockedScreenViewWithAd_ViewBinding;
        this.f15156b = lockedScreenViewWithAd;
    }

    public void doClick(View view) {
        this.f15156b.closeLockScreen();
    }
}
