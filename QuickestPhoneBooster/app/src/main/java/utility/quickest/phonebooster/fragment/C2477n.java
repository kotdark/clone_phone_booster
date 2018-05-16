package utility.quickest.phonebooster.fragment;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;

/* compiled from: AntivirusFinishFragment */
class C2477n implements AnimatorListener {
    final /* synthetic */ AntivirusFinishFragment f13840a;

    C2477n(AntivirusFinishFragment antivirusFinishFragment) {
        this.f13840a = antivirusFinishFragment;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f13840a.mFinishTagContainer.getLayoutParams().height = this.f13840a.m17699c().getDimensionPixelSize(R.dimen.clean_finish_fragment_tag_size);
        this.f13840a.mFinishTagContainer.requestLayout();
        this.f13840a.mFinishTagContainerFloat.getLayoutParams().height = this.f13840a.mFinishTagContainer.getLayoutParams().height;
        this.f13840a.mFinishTagContainerFloat.requestLayout();
        this.f13840a.mFinishTagContainerFloat.setVisibility(0);
        this.f13840a.mFinishTagContainer.setVisibility(4);
        Animation alphaAnimation = new AlphaAnimation(0.0f, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        alphaAnimation.setDuration(300);
        this.f13840a.mFinishTagContainerJunkCleanFloat.clearAnimation();
        this.f13840a.mFinishTagContainerJunkCleanFloat.setAnimation(alphaAnimation);
        alphaAnimation.start();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
