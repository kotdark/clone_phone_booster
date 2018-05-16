package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.EnumMap;
import java.util.List;

/* compiled from: AdvertisementModel */
class C2499f implements Runnable {
    final /* synthetic */ C2443a f14185a;
    final /* synthetic */ EnumMap f14186b;
    final /* synthetic */ C2497e f14187c;

    C2499f(C2497e c2497e, C2443a c2443a, EnumMap enumMap) {
        this.f14187c = c2497e;
        this.f14185a = c2443a;
        this.f14186b = enumMap;
    }

    public void run() {
        List a;
        Throwable th = null;
        try {
            a = C2492b.m18300b(this.f14185a, this.f14187c.f14134a, (List) this.f14186b.get(this.f14187c.f14134a));
        } catch (Throwable th2) {
            th = th2;
            Object obj = null;
        }
        ThreadUtil.m19099a(false, new C2500g(this, a));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
