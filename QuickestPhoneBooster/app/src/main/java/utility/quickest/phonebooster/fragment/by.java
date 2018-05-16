package utility.quickest.phonebooster.fragment;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import utility.quickest.phonebooster.util.C2535e;

/* compiled from: JunkCleanFinishFragment */
class by implements AnimatorUpdateListener {
    final /* synthetic */ JunkCleanFinishFragment f13585a;

    by(JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13585a = junkCleanFinishFragment;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            float parseFloat = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            this.f13585a.mFinishTagContainer.getLayoutParams().height = (int) parseFloat;
            this.f13585a.mFinishTagContainer.requestLayout();
            this.f13585a.mFinishTag1.setAlpha(parseFloat / ((float) C2535e.f14680d));
        } catch (Throwable th) {
        }
    }
}
