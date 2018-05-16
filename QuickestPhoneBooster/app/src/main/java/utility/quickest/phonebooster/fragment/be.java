package utility.quickest.phonebooster.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import utility.quickest.phonebooster.util.ViewUtil;

/* compiled from: CPUCoolingFragment */
class be implements Runnable {
    final /* synthetic */ CPUCoolingFragment f13553a;

    be(CPUCoolingFragment cPUCoolingFragment) {
        this.f13553a = cPUCoolingFragment;
    }

    public void run() {
        if (ViewUtil.m18937a(this.f13553a)) {
            if (this.f13553a.f13225i == null) {
                this.f13553a.f13225i = new AnimatorSet();
                this.f13553a.mTemperatureWait1.setTranslationY(this.f13553a.mTemperatureWaitBg1.getY());
                ObjectAnimator.ofFloat(this.f13553a.mTemperatureWait, "translationY", new float[]{this.f13553a.mTemperatureWaitBg1.getY() + ((float) this.f13553a.mTemperatureWaitBg.getMeasuredHeight()), this.f13553a.mTemperatureWaitBg1.getY()}).setDuration(2000);
                ObjectAnimator.ofFloat(this.f13553a.mTemperatureWait1, "translationY", new float[]{this.f13553a.mTemperatureWaitBg1.getY(), (float) (this.f13553a.mTemperatureWaitBg1.getMeasuredHeight() - this.f13553a.mTemperatureWait1.getMeasuredHeight())}).setDuration(2000);
                ObjectAnimator.ofFloat(this.f13553a.mTemperatureWait, "translationY", new float[]{this.f13553a.mTemperatureWaitBg1.getY() + ((float) this.f13553a.mTemperatureWaitBg.getMeasuredHeight()), this.f13553a.mTemperatureWaitBg1.getY()}).setDuration(2000);
                ObjectAnimator.ofFloat(this.f13553a.mTemperatureWait1, "translationY", new float[]{this.f13553a.mTemperatureWaitBg1.getY(), (float) (this.f13553a.mTemperatureWaitBg1.getMeasuredHeight() - this.f13553a.mTemperatureWait1.getMeasuredHeight())}).setDuration(2000);
                this.f13553a.f13225i.playSequentially(new Animator[]{r0, r1, r2, r3});
            }
            this.f13553a.f13225i.start();
        }
    }
}
