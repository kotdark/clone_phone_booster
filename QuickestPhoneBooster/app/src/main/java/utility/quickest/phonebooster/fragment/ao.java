package utility.quickest.phonebooster.fragment;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.mopub.volley.DefaultRetryPolicy;

/* compiled from: CPUCoolingFinishFragment */
class ao implements AnimatorListener {
    final /* synthetic */ CPUCoolingFinishFragment f13526a;

    ao(CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13526a = cPUCoolingFinishFragment;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f13526a.mTagContainerFloat.setVisibility(0);
        Animation alphaAnimation = new AlphaAnimation(0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        alphaAnimation.setDuration(300);
        this.f13526a.mTagContainerFloat.clearAnimation();
        this.f13526a.mTagContainerFloat.setAnimation(alphaAnimation);
        alphaAnimation.start();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
