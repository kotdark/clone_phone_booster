package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenViewWithAd_ViewBinding */
class bi extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenViewWithAd f15152b;
    final /* synthetic */ LockedScreenViewWithAd_ViewBinding f15153c;

    bi(LockedScreenViewWithAd_ViewBinding lockedScreenViewWithAd_ViewBinding, LockedScreenViewWithAd lockedScreenViewWithAd) {
        this.f15153c = lockedScreenViewWithAd_ViewBinding;
        this.f15152b = lockedScreenViewWithAd;
    }

    public void doClick(View view) {
        this.f15152b.closeWindow();
    }
}
