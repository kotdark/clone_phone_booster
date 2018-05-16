package utility.quickest.phonebooster.fragment;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.ir;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;

/* compiled from: LauncherFragmentNew */
class cm implements ir {
    final /* synthetic */ LauncherFragmentNew f13610a;

    cm(LauncherFragmentNew launcherFragmentNew) {
        this.f13610a = launcherFragmentNew;
    }

    public void mo3102a(boolean z) {
        if (z) {
            this.f13610a.mLauncherOpenNow.setVisibility(0);
            this.f13610a.mLauncherOpenNowContaier.setVisibility(0);
            this.f13610a.mLauncherTermPrivacy.setVisibility(0);
            this.f13610a.mLauncherTermPrivacy1.setVisibility(0);
            this.f13610a.mLauncherTermContaier.setVisibility(0);
            this.f13610a.mIconContainer.setGravity(17);
            try {
                if (this.f13610a.mLauncherTermPrivacy1.getText().toString().trim().length() == 0) {
                    this.f13610a.mLauncherTermPrivacy1.setVisibility(8);
                    this.f13610a.mLauncherTermContaier.setVisibility(8);
                    this.f13610a.mIconContainer.setGravity(17);
                }
            } catch (Throwable th) {
            }
            if (this.f13610a.mLauncherOpenNow.getVisibility() == 0) {
                Animation translateAnimation = new TranslateAnimation((float) (-ViewUtil.m18918a(120.0f)), (float) C2535e.f14679c, 0.0f, 0.0f);
                translateAnimation.setRepeatCount(-1);
                translateAnimation.setDuration(1500);
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f13610a.mHalo.startAnimation(translateAnimation);
            }
            C2542m.m19082a("launcher_fragment", "with_confirm_show", null);
            return;
        }
        this.f13610a.mLauncherOpenNow.setVisibility(8);
        this.f13610a.mLauncherOpenNowContaier.setVisibility(8);
        this.f13610a.mLauncherTermPrivacy.setVisibility(8);
        this.f13610a.mLauncherTermPrivacy1.setVisibility(8);
        this.f13610a.mLauncherTermContaier.setVisibility(8);
        this.f13610a.mIconContainer.setGravity(17);
    }

    public void mo3101a(cv cvVar) {
        this.f13610a.m17798a(cvVar);
        this.f13610a.mAdContainerContainer.setVisibility(0);
    }

    public void mo3100a() {
        if (ViewUtil.m18937a(this.f13610a)) {
            try {
                this.f13610a.getActivity().getWindow().setFlags(2048, 2048);
            } catch (Throwable th) {
            }
            this.f13610a.f13286a.m18735b();
            MainActivity.m17286a(this.f13610a);
            this.f13610a.getActivity().finish();
        }
    }
}
