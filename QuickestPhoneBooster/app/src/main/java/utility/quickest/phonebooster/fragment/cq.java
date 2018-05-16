package utility.quickest.phonebooster.fragment;

import java.util.Date;

/* compiled from: LockedScreenFragment */
class cq implements Runnable {
    final /* synthetic */ LockedScreenFragment f13617a;

    cq(LockedScreenFragment lockedScreenFragment) {
        this.f13617a = lockedScreenFragment;
    }

    public void run() {
        this.f13617a.mLockScreenDate.setText(this.f13617a.f13300d.format(new Date()));
        this.f13617a.mLockScreenTime.setText(this.f13617a.f13301e.format(new Date()));
        LockedScreenFragment.f13296l.postDelayed(this.f13617a.f13308m, 1000);
    }
}
