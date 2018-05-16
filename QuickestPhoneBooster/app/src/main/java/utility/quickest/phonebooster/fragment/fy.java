package utility.quickest.phonebooster.fragment;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* compiled from: PowerSavingFragmentNew */
class fy implements AnimatorListener {
    final /* synthetic */ fx f13758a;

    fy(fx fxVar) {
        this.f13758a = fxVar;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f13758a.f13757a.f13453j = true;
        this.f13758a.f13757a.m17900f();
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
