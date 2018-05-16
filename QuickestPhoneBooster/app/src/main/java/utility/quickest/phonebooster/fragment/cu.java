package utility.quickest.phonebooster.fragment;

/* compiled from: LockedScreenFragment */
class cu implements Runnable {
    final /* synthetic */ LockedScreenFragment f13621a;

    cu(LockedScreenFragment lockedScreenFragment) {
        this.f13621a = lockedScreenFragment;
    }

    public void run() {
        int max = Math.max(this.f13621a.mJunkCleanButton.getMeasuredWidth(), this.f13621a.mPhoneBoostButton.getMeasuredWidth());
        if (max > 0) {
            this.f13621a.mJunkCleanButton.setWidth(max);
            this.f13621a.mPhoneBoostButton.setWidth(max);
        }
    }
}
