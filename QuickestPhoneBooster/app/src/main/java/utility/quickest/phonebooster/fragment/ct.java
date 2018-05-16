package utility.quickest.phonebooster.fragment;

/* compiled from: LockedScreenFragment */
class ct implements Runnable {
    final /* synthetic */ LockedScreenFragment f13620a;

    ct(LockedScreenFragment lockedScreenFragment) {
        this.f13620a = lockedScreenFragment;
    }

    public void run() {
        int lineCount;
        int i = 0;
        if (this.f13620a.mLockScreenMemoryTag.getLayout() != null) {
            lineCount = this.f13620a.mLockScreenMemoryTag.getLayout().getLineCount();
        } else {
            lineCount = 0;
        }
        if (this.f13620a.mLockScreenJunkTag.getLayout() != null) {
            i = this.f13620a.mLockScreenJunkTag.getLayout().getLineCount();
        }
        lineCount = Math.max(lineCount, i);
        if (lineCount > 0) {
            this.f13620a.mLockScreenMemoryTag.setLines(lineCount);
            this.f13620a.mLockScreenJunkTag.setLines(lineCount);
        }
    }
}
