package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.p114d.C2449g;

/* compiled from: FakePopupLsFragment */
class bq implements fj {
    final /* synthetic */ FakePopupLsFragment f13573a;

    bq(FakePopupLsFragment fakePopupLsFragment) {
        this.f13573a = fakePopupLsFragment;
    }

    public void mo3097a(C2449g c2449g) {
        this.f13573a.mLockScreenBattery.setmCurrentEnegryPercent(c2449g.m17663a());
        this.f13573a.mLockScreenBattery.setmIsCharging(c2449g.m17664b());
    }
}
