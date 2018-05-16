package utility.quickest.phonebooster.view;

import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.p114d.C2449g;

/* compiled from: LockedScreenViewWithAd */
class bc implements fj {
    final /* synthetic */ LockedScreenViewWithAd f15146a;

    bc(LockedScreenViewWithAd lockedScreenViewWithAd) {
        this.f15146a = lockedScreenViewWithAd;
    }

    public void mo3097a(C2449g c2449g) {
        this.f15146a.mLockScreenBattery.setmCurrentEnegryPercent(c2449g.m17663a());
        this.f15146a.mLockScreenBattery.setmIsCharging(c2449g.m17664b());
    }
}
