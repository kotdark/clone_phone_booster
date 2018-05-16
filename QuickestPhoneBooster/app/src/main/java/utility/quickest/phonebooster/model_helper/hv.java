package utility.quickest.phonebooster.model_helper;

import android.os.PowerManager.WakeLock;
import utility.quickest.phonebooster.activity.PopupAdActivity;

/* compiled from: PushModel */
class hv implements cz {
    final /* synthetic */ WakeLock f14360a;
    final /* synthetic */ hq f14361b;

    hv(hq hqVar, WakeLock wakeLock) {
        this.f14361b = hqVar;
        this.f14360a = wakeLock;
    }

    public void mo3073a() {
        if (C2492b.m18285a().m18330d(db.SPLASH2)) {
            PopupAdActivity.m17302d();
        }
        if (this.f14360a != null) {
            try {
                this.f14360a.release();
            } catch (Throwable th) {
            }
        }
    }
}
