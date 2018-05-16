package utility.quickest.phonebooster.view;

import java.util.Date;

/* compiled from: LockedScreenViewWithAd */
class be implements Runnable {
    final /* synthetic */ LockedScreenViewWithAd f15148a;

    be(LockedScreenViewWithAd lockedScreenViewWithAd) {
        this.f15148a = lockedScreenViewWithAd;
    }

    public void run() {
        this.f15148a.mLockScreenDate.setText(this.f15148a.f14938f.format(new Date()));
        this.f15148a.mLockScreenTime.setText(this.f15148a.f14939g.format(new Date()));
        LockedScreenViewWithAd.f14932o.postDelayed(this.f15148a.f14947p, 1000);
    }
}
