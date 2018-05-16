package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: MiscHelper */
final class hi implements Runnable {
    final /* synthetic */ C2443a f14327a;
    final /* synthetic */  SharedPrefHelper f14328b;

    hi(C2443a c2443a,  SharedPrefHelper c2430b) {
        this.f14327a = c2443a;
        this.f14328b = c2430b;
    }

    public void run() {
        boolean a;
        Throwable th = null;
        try {
            a = hh.m18636b(this.f14327a);
        } catch (Throwable th2) {
            th = th2;
            a = false;
        }
        ThreadUtil.m19099a(false, new hj(this, a));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
