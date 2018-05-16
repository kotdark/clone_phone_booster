package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenViewWithAd_ViewBinding */
class bo extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenViewWithAd f15164b;
    final /* synthetic */ LockedScreenViewWithAd_ViewBinding f15165c;

    bo(LockedScreenViewWithAd_ViewBinding lockedScreenViewWithAd_ViewBinding, LockedScreenViewWithAd lockedScreenViewWithAd) {
        this.f15165c = lockedScreenViewWithAd_ViewBinding;
        this.f15164b = lockedScreenViewWithAd;
    }

    public void doClick(View view) {
        this.f15164b.openMemoryClean();
    }
}
