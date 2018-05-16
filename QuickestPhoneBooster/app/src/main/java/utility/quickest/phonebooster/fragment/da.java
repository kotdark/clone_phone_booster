package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragmentWithAd_ViewBinding */
class da extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragmentWithAd f13630b;
    final /* synthetic */ LockedScreenFragmentWithAd_ViewBinding f13631c;

    da(LockedScreenFragmentWithAd_ViewBinding lockedScreenFragmentWithAd_ViewBinding, LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13631c = lockedScreenFragmentWithAd_ViewBinding;
        this.f13630b = lockedScreenFragmentWithAd;
    }

    public void doClick(View view) {
        this.f13630b.closeChoiceDialog();
    }
}
