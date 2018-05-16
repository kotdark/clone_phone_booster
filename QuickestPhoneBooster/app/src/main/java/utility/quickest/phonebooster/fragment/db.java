package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragmentWithAd_ViewBinding */
class db extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragmentWithAd f13632b;
    final /* synthetic */ LockedScreenFragmentWithAd_ViewBinding f13633c;

    db(LockedScreenFragmentWithAd_ViewBinding lockedScreenFragmentWithAd_ViewBinding, LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13633c = lockedScreenFragmentWithAd_ViewBinding;
        this.f13632b = lockedScreenFragmentWithAd;
    }

    public void doClick(View view) {
        this.f13632b.closeLockScreen();
    }
}
