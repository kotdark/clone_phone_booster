package utility.quickest.phonebooster.view;

import android.content.Context;
import android.content.Intent;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.gz;

/* compiled from: EnableLockedScreenTipView */
class ag implements Runnable {
    final /* synthetic */ EnableLockedScreenTipView f15118a;

    ag(EnableLockedScreenTipView enableLockedScreenTipView) {
        this.f15118a = enableLockedScreenTipView;
    }

    public void run() {
        if (gz.m18606b()) {
            this.f15118a.m19203a();
            try {
                Context a = MyApplicationLike.getApplication();
                Intent launchIntentForPackage = a.getPackageManager().getLaunchIntentForPackage("utility.quickest.phonebooster");
                launchIntentForPackage.setPackage(null);
                a.startActivity(launchIntentForPackage);
                return;
            } catch (Throwable th) {
                return;
            }
        }
        EnableLockedScreenTipView.f14896k.postDelayed(this.f15118a.f14907l, 500);
    }
}
