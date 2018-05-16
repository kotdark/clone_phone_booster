package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragmentWithAd_ViewBinding */
class dd extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragmentWithAd f13636b;
    final /* synthetic */ LockedScreenFragmentWithAd_ViewBinding f13637c;

    dd(LockedScreenFragmentWithAd_ViewBinding lockedScreenFragmentWithAd_ViewBinding, LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13637c = lockedScreenFragmentWithAd_ViewBinding;
        this.f13636b = lockedScreenFragmentWithAd;
    }

    public void doClick(View view) {
        this.f13636b.onNo();
    }
}
