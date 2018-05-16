package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.p114d.C2449g;

/* compiled from: LockedScreenFragment */
class cr implements fj {
    final /* synthetic */ LockedScreenFragment f13618a;

    cr(LockedScreenFragment lockedScreenFragment) {
        this.f13618a = lockedScreenFragment;
    }

    public void mo3097a(C2449g c2449g) {
        this.f13618a.mLockScreenBattery.setmCurrentEnegryPercent(c2449g.m17663a());
        this.f13618a.mLockScreenBattery.setmIsCharging(c2449g.m17664b());
        this.f13618a.m17808h();
    }
}
