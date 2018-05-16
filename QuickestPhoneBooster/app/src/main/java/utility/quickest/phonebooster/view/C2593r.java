package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: BatteryViewVertical1 */
class C2593r implements AnimatorUpdateListener {
    final /* synthetic */ BatteryViewVertical1 f15251a;

    C2593r(BatteryViewVertical1 batteryViewVertical1) {
        this.f15251a = batteryViewVertical1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            this.f15251a.f14840j = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            this.f15251a.invalidate();
        } catch (Throwable th) {
        }
    }
}
