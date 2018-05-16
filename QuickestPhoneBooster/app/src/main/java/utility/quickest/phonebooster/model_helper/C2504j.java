package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class C2504j implements Runnable {
    final /* synthetic */ C2443a f14438a;
    final /* synthetic */ C2492b f14439b;

    C2504j(C2492b c2492b, C2443a c2443a) {
        this.f14439b = c2492b;
        this.f14438a = c2443a;
    }

    public void run() {
        Throwable th = null;
        da daVar = new da();
        try {
            C2492b.m18301b(this.f14438a, daVar);
        } catch (Throwable th2) {
            th = th2;
            daVar.f14066a = -1;
        }
        ThreadUtil.m19099a(false, new C2505k(this, daVar));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
