package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.p114d.C2449g;

/* compiled from: LockedScreenFragmentWithAd */
class cw implements fj {
    final /* synthetic */ LockedScreenFragmentWithAd f13623a;

    cw(LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13623a = lockedScreenFragmentWithAd;
    }

    public void mo3097a(C2449g c2449g) {
        this.f13623a.mLockScreenBattery.setmCurrentEnegryPercent(c2449g.m17663a());
        this.f13623a.mLockScreenBattery.setmIsCharging(c2449g.m17664b());
    }
}
