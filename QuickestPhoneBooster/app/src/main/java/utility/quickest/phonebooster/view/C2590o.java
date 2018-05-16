package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: BatteryView */
class C2590o implements AnimatorUpdateListener {
    final /* synthetic */ BatteryView f15248a;

    C2590o(BatteryView batteryView) {
        this.f15248a = batteryView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            this.f15248a.f14828g = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            this.f15248a.invalidate();
        } catch (Throwable th) {
        }
    }
}
