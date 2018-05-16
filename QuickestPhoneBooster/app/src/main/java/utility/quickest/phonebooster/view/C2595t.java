package utility.quickest.phonebooster.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* compiled from: BatteryViewVertical1 */
class C2595t implements AnimatorListener {
    final /* synthetic */ C2470u f15253a;
    final /* synthetic */ BatteryViewVertical1 f15254b;

    C2595t(BatteryViewVertical1 batteryViewVertical1, C2470u c2470u) {
        this.f15254b = batteryViewVertical1;
        this.f15253a = c2470u;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f15253a.mo3110a();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
