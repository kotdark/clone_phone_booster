package utility.quickest.phonebooster.fragment;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import java.util.Random;

/* compiled from: PopupMemoryJunkCleanFragment */
class fl implements AnimatorListener {
    final /* synthetic */ fj f13741a;

    fl(fj fjVar) {
        this.f13741a = fjVar;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
        int i = 0;
        int nextInt = new Random().nextInt(6);
        switch (new Random().nextInt(4)) {
            case 0:
                i = nextInt;
                break;
            case 1:
                i = nextInt;
                nextInt = -nextInt;
                break;
            case 2:
                i = -nextInt;
                break;
            case 3:
                i = -nextInt;
                nextInt = -nextInt;
                break;
            default:
                nextInt = 0;
                break;
        }
        this.f13741a.f13739a.f13738a.mWait4.setTranslationX((float) i);
        this.f13741a.f13739a.f13738a.mWait4.setTranslationY((float) nextInt);
    }
}
