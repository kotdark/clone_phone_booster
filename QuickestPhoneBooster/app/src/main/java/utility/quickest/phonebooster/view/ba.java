package utility.quickest.phonebooster.view;

/* compiled from: LockedScreenView */
class ba implements Runnable {
    final /* synthetic */ LockedScreenView f15144a;

    ba(LockedScreenView lockedScreenView) {
        this.f15144a = lockedScreenView;
    }

    public void run() {
        int max = Math.max(this.f15144a.mJunkCleanButton.getMeasuredWidth(), this.f15144a.mPhoneBoostButton.getMeasuredWidth());
        if (max > 0) {
            this.f15144a.mJunkCleanButton.setWidth(max);
            this.f15144a.mPhoneBoostButton.setWidth(max);
        }
    }
}
