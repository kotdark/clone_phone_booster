package utility.quickest.phonebooster.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;

/* compiled from: EnableLockedScreenTipView */
class aj implements AnimatorListener {
    final /* synthetic */ ObjectAnimator f15122a;
    final /* synthetic */ EnableLockedScreenTipView f15123b;

    aj(EnableLockedScreenTipView enableLockedScreenTipView, ObjectAnimator objectAnimator) {
        this.f15123b = enableLockedScreenTipView;
        this.f15122a = objectAnimator;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f15123b.f14899c != null) {
            this.f15123b.f14899c.selectDrawable(0);
            this.f15123b.f14899c.stop();
        }
        if (this.f15123b.f14902f != null) {
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            this.f15123b.mTip.setLayoutParams(layoutParams);
            this.f15123b.f14902f.mo3145b();
        }
        this.f15122a.start();
        this.f15123b.mContainer.setVisibility(8);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
