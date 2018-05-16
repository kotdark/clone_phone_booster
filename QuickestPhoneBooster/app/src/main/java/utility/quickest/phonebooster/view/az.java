package utility.quickest.phonebooster.view;

/* compiled from: LockedScreenView */
class az implements Runnable {
    final /* synthetic */ LockedScreenView f15142a;

    az(LockedScreenView lockedScreenView) {
        this.f15142a = lockedScreenView;
    }

    public void run() {
        int lineCount;
        int i = 0;
        if (this.f15142a.mLockScreenMemoryTag.getLayout() != null) {
            lineCount = this.f15142a.mLockScreenMemoryTag.getLayout().getLineCount();
        } else {
            lineCount = 0;
        }
        if (this.f15142a.mLockScreenJunkTag.getLayout() != null) {
            i = this.f15142a.mLockScreenJunkTag.getLayout().getLineCount();
        }
        lineCount = Math.max(lineCount, i);
        if (lineCount > 0) {
            this.f15142a.mLockScreenMemoryTag.setLines(lineCount);
            this.f15142a.mLockScreenJunkTag.setLines(lineCount);
        }
    }
}
