package utility.quickest.phonebooster.model_helper;

import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.view.EnableLockedScreenTipView;
import utility.quickest.phonebooster.view.am;

/* compiled from: LockedScreenWindowHelper */
final class hc implements am {
    final /* synthetic */ WindowManager f14314a;
    final /* synthetic */ EnableLockedScreenTipView f14315b;

    hc(WindowManager windowManager, EnableLockedScreenTipView enableLockedScreenTipView) {
        this.f14314a = windowManager;
        this.f14315b = enableLockedScreenTipView;
    }

    public void mo3144a() {
        try {
            LayoutParams layoutParams = new WindowManager.LayoutParams(2005);
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.gravity = 80;
            layoutParams.format = -2;
            this.f14314a.updateViewLayout(this.f14315b, layoutParams);
        } catch (Throwable th) {
        }
    }

    public void mo3145b() {
        try {
            LayoutParams layoutParams = new WindowManager.LayoutParams(2005);
            layoutParams.flags = 8;
            layoutParams.width = -1;
            layoutParams.height = C2535e.f14680d / 2;
            layoutParams.gravity = 80;
            layoutParams.format = -2;
            this.f14314a.updateViewLayout(this.f14315b, layoutParams);
        } catch (Throwable th) {
        }
    }
}
