package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: BatteryViewVertical */
class C2592q implements AnimatorUpdateListener {
    final /* synthetic */ BatteryViewVertical f15250a;

    C2592q(BatteryViewVertical batteryViewVertical) {
        this.f15250a = batteryViewVertical;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            this.f15250a.f14852g = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            this.f15250a.invalidate();
        } catch (Throwable th) {
        }
    }
}
