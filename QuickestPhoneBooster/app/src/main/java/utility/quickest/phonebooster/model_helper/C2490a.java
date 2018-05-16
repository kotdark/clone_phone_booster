package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AccountModel */
public final class C2490a {
    private static volatile C2490a f13885a = null;
    private C2443a f13886b;

    public static C2490a m18243a() {
        if (f13885a == null) {
            synchronized (C2490a.class) {
                if (f13885a == null) {
                    f13885a = new C2490a();
                }
            }
        }
        return f13885a;
    }

    public C2443a m18244b() {
        ThreadUtil.m19102b();
        return this.f13886b;
    }

    private C2490a() {
        this.f13886b = null;
        this.f13886b = C2443a.m17608a( SharedPrefHelper.m17454a().m17486b());
        if (this.f13886b == null) {
            this.f13886b = C2443a.m17607a();
             SharedPrefHelper.m17454a().m17483a(C2443a.m17610a(this.f13886b));
        }
    }
}
