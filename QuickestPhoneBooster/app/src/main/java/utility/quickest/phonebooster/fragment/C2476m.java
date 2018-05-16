package utility.quickest.phonebooster.fragment;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import utility.quickest.phonebooster.util.C2535e;

/* compiled from: AntivirusFinishFragment */
class C2476m implements AnimatorUpdateListener {
    final /* synthetic */ AntivirusFinishFragment f13839a;

    C2476m(AntivirusFinishFragment antivirusFinishFragment) {
        this.f13839a = antivirusFinishFragment;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            float parseFloat = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            this.f13839a.mFinishTagContainer.getLayoutParams().height = (int) parseFloat;
            this.f13839a.mFinishTagContainer.requestLayout();
            this.f13839a.mFinishTag1.setAlpha(parseFloat / ((float) C2535e.f14680d));
        } catch (Throwable th) {
        }
    }
}
