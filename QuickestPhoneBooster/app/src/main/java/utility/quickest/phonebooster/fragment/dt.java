package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFramgentForSpecialAd_ViewBinding */
class dt extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFramgentForSpecialAd f13664b;
    final /* synthetic */ LockedScreenFramgentForSpecialAd_ViewBinding f13665c;

    dt(LockedScreenFramgentForSpecialAd_ViewBinding lockedScreenFramgentForSpecialAd_ViewBinding, LockedScreenFramgentForSpecialAd lockedScreenFramgentForSpecialAd) {
        this.f13665c = lockedScreenFramgentForSpecialAd_ViewBinding;
        this.f13664b = lockedScreenFramgentForSpecialAd;
    }

    public void doClick(View view) {
        this.f13664b.openMemoryClean();
    }
}
