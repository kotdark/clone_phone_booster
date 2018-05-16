package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AppUpdateModel */
class ey implements Runnable {
    final /* synthetic */ C2443a f14181a;
    final /* synthetic */ et f14182b;

    ey(et etVar, C2443a c2443a) {
        this.f14182b = etVar;
        this.f14181a = c2443a;
    }

    public void run() {
        Throwable th = null;
        fe feVar = new fe();
        try {
            et.m18491b(this.f14181a, AppUtil.m19020e(), "utility.quickest.phonebooster", feVar);
        } catch (Throwable th2) {
            th = th2;
            feVar.f14194a = -1;
        }
        ThreadUtil.m19099a(false, new ez(this, feVar));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
