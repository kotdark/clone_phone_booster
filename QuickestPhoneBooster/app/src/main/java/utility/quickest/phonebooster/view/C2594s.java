package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: BatteryViewVertical1 */
class C2594s implements AnimatorUpdateListener {
    final /* synthetic */ BatteryViewVertical1 f15252a;

    C2594s(BatteryViewVertical1 batteryViewVertical1) {
        this.f15252a = batteryViewVertical1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            this.f15252a.f14841k = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            this.f15252a.invalidate();
        } catch (Throwable th) {
        }
    }
}
