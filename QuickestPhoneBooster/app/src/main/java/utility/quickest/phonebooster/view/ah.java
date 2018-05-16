package utility.quickest.phonebooster.view;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: EnableLockedScreenTipView */
class ah implements OnGlobalLayoutListener {
    final /* synthetic */ EnableLockedScreenTipView f15119a;

    ah(EnableLockedScreenTipView enableLockedScreenTipView) {
        this.f15119a = enableLockedScreenTipView;
    }

    public void onGlobalLayout() {
        this.f15119a.f14903g = this.f15119a.mTipContainer.getMeasuredHeight();
        this.f15119a.f14904h = this.f15119a.mTip.getMeasuredWidth();
        if (this.f15119a.f14904h > 0 && this.f15119a.f14903g > 0) {
            this.f15119a.mTip.setTranslationX((float) this.f15119a.f14904h);
            this.f15119a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
