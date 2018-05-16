package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragmentWithAd_ViewBinding */
class df extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragmentWithAd f13640b;
    final /* synthetic */ LockedScreenFragmentWithAd_ViewBinding f13641c;

    df(LockedScreenFragmentWithAd_ViewBinding lockedScreenFragmentWithAd_ViewBinding, LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13641c = lockedScreenFragmentWithAd_ViewBinding;
        this.f13640b = lockedScreenFragmentWithAd;
    }

    public void doClick(View view) {
        this.f13640b.openMemoryClean();
    }
}
