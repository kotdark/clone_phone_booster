package utility.quickest.phonebooster.fragment;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.view.p115a.C2468s;
import utility.quickest.phonebooster.view.p115a.C2560f;

/* compiled from: PopupMemoryJunkCleanFragment */
class fj implements C2468s {
    final /* synthetic */ fi f13739a;

    fj(fi fiVar) {
        this.f13739a = fiVar;
    }

    public void mo3109a(C2560f c2560f, boolean z, float f, float f2) {
        this.f13739a.f13738a.mWait4.setVisibility(0);
        ThreadUtil.m19098a(new fk(this), 4000);
        Animation rotateAnimation = new RotateAnimation(3.0f, 1440.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        rotateAnimation.setDuration(4000);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        this.f13739a.f13738a.mWait2.clearAnimation();
        this.f13739a.f13738a.mWait2.startAnimation(rotateAnimation);
        this.f13739a.f13738a.f13421c = ValueAnimator.ofInt(new int[]{0, 1});
        this.f13739a.f13738a.f13421c.setRepeatCount(-1);
        this.f13739a.f13738a.f13421c.setDuration(70);
        this.f13739a.f13738a.f13421c.addListener(new fl(this));
        this.f13739a.f13738a.f13421c.start();
    }
}
