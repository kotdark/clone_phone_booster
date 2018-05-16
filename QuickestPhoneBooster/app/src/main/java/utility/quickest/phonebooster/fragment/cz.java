package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragmentWithAd_ViewBinding */
class cz extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragmentWithAd f13626b;
    final /* synthetic */ LockedScreenFragmentWithAd_ViewBinding f13627c;

    cz(LockedScreenFragmentWithAd_ViewBinding lockedScreenFragmentWithAd_ViewBinding, LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13627c = lockedScreenFragmentWithAd_ViewBinding;
        this.f13626b = lockedScreenFragmentWithAd;
    }

    public void doClick(View view) {
        this.f13626b.closeWindow();
    }
}
