package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragmentWithAd_ViewBinding */
class dc extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragmentWithAd f13634b;
    final /* synthetic */ LockedScreenFragmentWithAd_ViewBinding f13635c;

    dc(LockedScreenFragmentWithAd_ViewBinding lockedScreenFragmentWithAd_ViewBinding, LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13635c = lockedScreenFragmentWithAd_ViewBinding;
        this.f13634b = lockedScreenFragmentWithAd;
    }

    public void doClick(View view) {
        this.f13634b.onYes();
    }
}
