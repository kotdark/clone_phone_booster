package utility.quickest.phonebooster.adapter;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.C2539i;

/* compiled from: AppVirusListAdapter */
class C2391b implements AnimationListener {
    final /* synthetic */  AppVirusInfo f12912a;
    final /* synthetic */ AppVirusListAdapter f12913b;

    C2391b(AppVirusListAdapter appVirusListAdapter,  AppVirusInfo c2448f) {
        this.f12913b = appVirusListAdapter;
        this.f12912a = c2448f;
    }

    public void onAnimationEnd(Animation animation) {
        try {
            this.f12913b.f12860d.put(this.f12912a, Boolean.valueOf(false));
            if (!this.f12913b.f12860d.values().contains(Boolean.valueOf(true))) {
                C2539i.EVENT_IGNORE_APP_VIRUS.m19064a(this.f12913b.f12860d.keySet());
                this.f12913b.f12860d.clear();
            }
        } catch (Throwable th) {
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
