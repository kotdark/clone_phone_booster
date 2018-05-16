package utility.quickest.phonebooster.fragment;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import utility.quickest.phonebooster.util.C2535e;

/* compiled from: CPUCoolingFinishFragment */
class an implements AnimatorUpdateListener {
    final /* synthetic */ int f13524a;
    final /* synthetic */ CPUCoolingFinishFragment f13525b;

    an(CPUCoolingFinishFragment cPUCoolingFinishFragment, int i) {
        this.f13525b = cPUCoolingFinishFragment;
        this.f13524a = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            float parseFloat = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            this.f13525b.mTagContainer.getLayoutParams().height = ((int) parseFloat) > this.f13524a ? this.f13524a : (int) parseFloat;
            this.f13525b.mTagContainer.requestLayout();
            this.f13525b.mAdContainerContainer.setY(parseFloat);
            this.f13525b.mFinishTag.setAlpha(parseFloat / ((float) C2535e.f14680d));
            this.f13525b.mProgress.setAlpha(parseFloat / ((float) C2535e.f14680d));
        } catch (Throwable th) {
        }
    }
}
