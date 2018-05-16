package utility.quickest.phonebooster.view;

import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.p114d.C2449g;

/* compiled from: LockedScreenView */
class aw implements fj {
    final /* synthetic */ LockedScreenView f15139a;

    aw(LockedScreenView lockedScreenView) {
        this.f15139a = lockedScreenView;
    }

    public void mo3097a(C2449g c2449g) {
        this.f15139a.mLockScreenBattery.setmCurrentEnegryPercent(c2449g.m17663a());
        this.f15139a.mLockScreenBattery.setmIsCharging(c2449g.m17664b());
        this.f15139a.m19214h();
    }
}
