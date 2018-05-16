package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenViewWithAd_ViewBinding */
class bl extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenViewWithAd f15158b;
    final /* synthetic */ LockedScreenViewWithAd_ViewBinding f15159c;

    bl(LockedScreenViewWithAd_ViewBinding lockedScreenViewWithAd_ViewBinding, LockedScreenViewWithAd lockedScreenViewWithAd) {
        this.f15159c = lockedScreenViewWithAd_ViewBinding;
        this.f15158b = lockedScreenViewWithAd;
    }

    public void doClick(View view) {
        this.f15158b.onYes();
    }
}
