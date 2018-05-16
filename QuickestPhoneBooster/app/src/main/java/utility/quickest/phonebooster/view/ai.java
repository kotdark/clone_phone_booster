package utility.quickest.phonebooster.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;

/* compiled from: EnableLockedScreenTipView */
class ai implements AnimatorListener {
    final /* synthetic */ ObjectAnimator f15120a;
    final /* synthetic */ EnableLockedScreenTipView f15121b;

    ai(EnableLockedScreenTipView enableLockedScreenTipView, ObjectAnimator objectAnimator) {
        this.f15121b = enableLockedScreenTipView;
        this.f15120a = objectAnimator;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f15121b.f14899c != null) {
            this.f15121b.f14899c.start();
        }
        if (this.f15121b.f14902f != null) {
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15);
            layoutParams.addRule(11);
            this.f15121b.mTip.setLayoutParams(layoutParams);
            this.f15121b.f14902f.mo3144a();
        }
        this.f15121b.mContainer.setVisibility(0);
        this.f15120a.start();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
