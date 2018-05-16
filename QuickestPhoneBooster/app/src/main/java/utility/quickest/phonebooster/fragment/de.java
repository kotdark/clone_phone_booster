package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragmentWithAd_ViewBinding */
class de extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragmentWithAd f13638b;
    final /* synthetic */ LockedScreenFragmentWithAd_ViewBinding f13639c;

    de(LockedScreenFragmentWithAd_ViewBinding lockedScreenFragmentWithAd_ViewBinding, LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13639c = lockedScreenFragmentWithAd_ViewBinding;
        this.f13638b = lockedScreenFragmentWithAd;
    }

    public void doClick(View view) {
        this.f13638b.doSetting();
    }
}
