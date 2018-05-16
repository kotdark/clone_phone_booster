package utility.quickest.phonebooster.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: BatteryView1 */
class C2591p implements AnimatorUpdateListener {
    final /* synthetic */ BatteryView1 f15249a;

    C2591p(BatteryView1 batteryView1) {
        this.f15249a = batteryView1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        try {
            this.f15249a.f14817g = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            this.f15249a.invalidate();
        } catch (Throwable th) {
        }
    }
}
