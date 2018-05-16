package utility.quickest.phonebooster.fragment;

import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import com.mopub.volley.DefaultRetryPolicy;

/* compiled from: PowerSavingFragmentNew */
class fz implements Runnable {
    final /* synthetic */ PowerSavingFragmentNew f13759a;

    fz(PowerSavingFragmentNew powerSavingFragmentNew) {
        this.f13759a = powerSavingFragmentNew;
    }

    public void run() {
        this.f13759a.mBattery.m19160a((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, new ga(this));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f13759a.mDeletingIcon, "translationY", new float[]{(float) this.f13759a.mPowerSavingWaitBg.getMeasuredHeight(), 0.0f});
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(1800);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
        ofFloat = ObjectAnimator.ofFloat(this.f13759a.mDeletingIcon2, "translationY", new float[]{(float) this.f13759a.mPowerSavingWaitBg.getMeasuredHeight(), 0.0f});
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(1200);
        ofFloat.start();
        ofFloat = ObjectAnimator.ofFloat(this.f13759a.mDeletingIcon3, "translationY", new float[]{(float) this.f13759a.mPowerSavingWaitBg.getMeasuredHeight(), 0.0f});
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(2000);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
    }
}
