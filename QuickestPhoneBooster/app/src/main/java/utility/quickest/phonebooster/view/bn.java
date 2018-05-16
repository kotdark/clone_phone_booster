package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenViewWithAd_ViewBinding */
class bn extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenViewWithAd f15162b;
    final /* synthetic */ LockedScreenViewWithAd_ViewBinding f15163c;

    bn(LockedScreenViewWithAd_ViewBinding lockedScreenViewWithAd_ViewBinding, LockedScreenViewWithAd lockedScreenViewWithAd) {
        this.f15163c = lockedScreenViewWithAd_ViewBinding;
        this.f15162b = lockedScreenViewWithAd;
    }

    public void doClick(View view) {
        this.f15162b.doSetting();
    }
}
