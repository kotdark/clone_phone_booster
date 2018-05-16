package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenViewWithAd_ViewBinding */
class bj extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenViewWithAd f15154b;
    final /* synthetic */ LockedScreenViewWithAd_ViewBinding f15155c;

    bj(LockedScreenViewWithAd_ViewBinding lockedScreenViewWithAd_ViewBinding, LockedScreenViewWithAd lockedScreenViewWithAd) {
        this.f15155c = lockedScreenViewWithAd_ViewBinding;
        this.f15154b = lockedScreenViewWithAd;
    }

    public void doClick(View view) {
        this.f15154b.closeChoiceDialog();
    }
}
