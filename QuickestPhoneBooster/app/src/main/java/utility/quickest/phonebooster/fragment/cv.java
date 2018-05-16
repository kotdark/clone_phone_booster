package utility.quickest.phonebooster.fragment;

import java.util.Date;

/* compiled from: LockedScreenFragmentWithAd */
class cv implements Runnable {
    final /* synthetic */ LockedScreenFragmentWithAd f13622a;

    cv(LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13622a = lockedScreenFragmentWithAd;
    }

    public void run() {
        this.f13622a.mLockScreenDate.setText(this.f13622a.f13314d.format(new Date()));
        this.f13622a.mLockScreenTime.setText(this.f13622a.f13315e.format(new Date()));
        LockedScreenFragmentWithAd.f13310l.postDelayed(this.f13622a.f13322m, 1000);
    }
}
