package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenViewWithAd_ViewBinding */
class bm extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenViewWithAd f15160b;
    final /* synthetic */ LockedScreenViewWithAd_ViewBinding f15161c;

    bm(LockedScreenViewWithAd_ViewBinding lockedScreenViewWithAd_ViewBinding, LockedScreenViewWithAd lockedScreenViewWithAd) {
        this.f15161c = lockedScreenViewWithAd_ViewBinding;
        this.f15160b = lockedScreenViewWithAd;
    }

    public void doClick(View view) {
        this.f15160b.onNo();
    }
}
