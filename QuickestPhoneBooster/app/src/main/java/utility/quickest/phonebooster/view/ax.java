package utility.quickest.phonebooster.view;

import java.util.Date;

/* compiled from: LockedScreenView */
class ax implements Runnable {
    final /* synthetic */ LockedScreenView f15140a;

    ax(LockedScreenView lockedScreenView) {
        this.f15140a = lockedScreenView;
    }

    public void run() {
        this.f15140a.mLockScreenDate.setText(this.f15140a.f14928e.format(new Date()));
        this.f15140a.mLockScreenTime.setText(this.f15140a.f14929f.format(new Date()));
        LockedScreenView.f14923h.postDelayed(this.f15140a.f14931i, 1000);
    }
}
