package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2447e;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.io.File;

/* compiled from: AppUpdateModel */
class fa implements Runnable {
    final /* synthetic */ C2447e f14188a;
    final /* synthetic */ et f14189b;

    fa(et etVar, C2447e c2447e) {
        this.f14189b = etVar;
        this.f14188a = c2447e;
    }

    public void run() {
        File a;
        Throwable th = null;
        try {
            a = et.m18505f(this.f14188a);
        } catch (Throwable th2) {
            th = th2;
            Object obj = null;
        }
        ThreadUtil.m19099a(false, new fb(this, a));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
