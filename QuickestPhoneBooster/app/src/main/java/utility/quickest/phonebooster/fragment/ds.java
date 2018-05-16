package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFramgentForSpecialAd_ViewBinding */
class ds extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFramgentForSpecialAd f13662b;
    final /* synthetic */ LockedScreenFramgentForSpecialAd_ViewBinding f13663c;

    ds(LockedScreenFramgentForSpecialAd_ViewBinding lockedScreenFramgentForSpecialAd_ViewBinding, LockedScreenFramgentForSpecialAd lockedScreenFramgentForSpecialAd) {
        this.f13663c = lockedScreenFramgentForSpecialAd_ViewBinding;
        this.f13662b = lockedScreenFramgentForSpecialAd;
    }

    public void doClick(View view) {
        this.f13662b.doSetting();
    }
}
