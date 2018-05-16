package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;

/* compiled from: RuntimeRemoteConfigModel */
class ic implements Runnable {
    final /* synthetic */ hz f14385a;

    ic(hz hzVar) {
        this.f14385a = hzVar;
    }

    public void run() {
        try {
            this.f14385a.f14373d = SystemClock.elapsedRealtime();
            this.f14385a.f14372c.m16828a(hz.f14368a).mo3000a(this.f14385a.f14374f);
        } catch (Throwable th) {
            this.f14385a.f14373d = 0;
        }
    }
}
