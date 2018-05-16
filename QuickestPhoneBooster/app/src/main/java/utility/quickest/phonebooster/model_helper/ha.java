package utility.quickest.phonebooster.model_helper;

import android.view.WindowManager;
import utility.quickest.phonebooster.app.MyApplicationLike;

/* compiled from: LockedScreenWindowHelper */
final class ha implements hf {
    final /* synthetic */ hd f14311a;

    ha(hd hdVar) {
        this.f14311a = hdVar;
    }

    public void mo3142a() {
        try {
            ((WindowManager) MyApplicationLike.getApplication().getSystemService("window")).removeView(this.f14311a);
            gz.f14309b = false;
        } catch (Throwable th) {
        }
    }
}
