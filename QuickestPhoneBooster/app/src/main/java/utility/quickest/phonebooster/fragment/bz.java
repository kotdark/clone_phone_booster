package utility.quickest.phonebooster.fragment;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

/* compiled from: JunkCleanFinishFragment */
class bz implements AnimatorListener {
    final /* synthetic */ JunkCleanFinishFragment f13586a;

    bz(JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13586a = junkCleanFinishFragment;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f13586a.mFinishTagContainer.getLayoutParams().height = this.f13586a.m17699c().getDimensionPixelSize(R.dimen.clean_finish_fragment_tag_size);
        this.f13586a.mFinishTagContainer.requestLayout();
        this.f13586a.mFinishTagContainerFloat.getLayoutParams().height = this.f13586a.mFinishTagContainer.getLayoutParams().height;
        this.f13586a.mFinishTagContainerFloat.requestLayout();
        this.f13586a.mFinishTagContainerFloat.setVisibility(0);
        this.f13586a.mFinishTagContainer.setVisibility(4);
        Animation alphaAnimation = new AlphaAnimation(0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        alphaAnimation.setDuration(300);
        this.f13586a.mFinishTagContainerJunkCleanFloat.clearAnimation();
        this.f13586a.mFinishTagContainerJunkCleanFloat.setAnimation(alphaAnimation);
        alphaAnimation.start();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
