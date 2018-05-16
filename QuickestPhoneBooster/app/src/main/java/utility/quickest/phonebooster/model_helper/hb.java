package utility.quickest.phonebooster.model_helper;

import android.view.WindowManager;
import utility.quickest.phonebooster.view.EnableLockedScreenTipView;
import utility.quickest.phonebooster.view.al;

/* compiled from: LockedScreenWindowHelper */
final class hb implements al {
    final /* synthetic */ WindowManager f14312a;
    final /* synthetic */ EnableLockedScreenTipView f14313b;

    hb(WindowManager windowManager, EnableLockedScreenTipView enableLockedScreenTipView) {
        this.f14312a = windowManager;
        this.f14313b = enableLockedScreenTipView;
    }

    public void mo3143a() {
        try {
            this.f14312a.removeView(this.f14313b);
        } catch (Throwable th) {
        }
    }
}
