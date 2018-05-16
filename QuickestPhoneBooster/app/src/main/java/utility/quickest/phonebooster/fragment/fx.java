package utility.quickest.phonebooster.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import utility.quickest.phonebooster.util.ViewUtil;

/* compiled from: PowerSavingFragmentNew */
class fx implements Runnable {
    final /* synthetic */ PowerSavingFragmentNew f13757a;

    fx(PowerSavingFragmentNew powerSavingFragmentNew) {
        this.f13757a = powerSavingFragmentNew;
    }

    public void run() {
        if (ViewUtil.m18937a(this.f13757a)) {
            if (this.f13757a.f13451h == null) {
                this.f13757a.f13451h = new AnimatorSet();
                this.f13757a.mPowerSavingWaitView1.setTranslationY((float) this.f13757a.mPowerSavingWaitBg.getMeasuredHeight());
                this.f13757a.mPowerSavingWaitView2.setTranslationY((float) (-this.f13757a.mPowerSavingWaitBg.getMeasuredHeight()));
                ObjectAnimator.ofFloat(this.f13757a.mPowerSavingWaitView1, "translationY", new float[]{(float) this.f13757a.mPowerSavingWaitBg.getMeasuredHeight(), 0.0f, (float) (-this.f13757a.mPowerSavingWaitBg.getMeasuredHeight())}).setDuration(3000);
                ObjectAnimator.ofFloat(this.f13757a.mPowerSavingWaitView2, "translationY", new float[]{(float) (-this.f13757a.mPowerSavingWaitBg.getMeasuredHeight()), 0.0f, (float) this.f13757a.mPowerSavingWaitBg.getMeasuredHeight()}).setDuration(3000);
                this.f13757a.f13451h.playSequentially(new Animator[]{r0, r1});
                this.f13757a.f13451h.addListener(new fy(this));
            }
            this.f13757a.f13451h.start();
        }
    }
}
