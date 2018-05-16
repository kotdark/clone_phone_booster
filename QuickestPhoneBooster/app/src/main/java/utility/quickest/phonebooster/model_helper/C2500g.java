package utility.quickest.phonebooster.model_helper;

import java.util.List;

/* compiled from: AdvertisementModel */
class C2500g implements Runnable {
    final /* synthetic */ List f14252a;
    final /* synthetic */ C2499f f14253b;

    C2500g(C2499f c2499f, List list) {
        this.f14253b = c2499f;
        this.f14252a = list;
    }

    public void run() {
        this.f14253b.f14187c.f14135b.f13963g.remove(this.f14253b.f14187c.f14134a);
        if (this.f14252a != null) {
            for (cv b : this.f14252a) {
                try {
                    b.m18401l();
                } catch (Throwable th) {
                }
            }
            this.f14253b.f14187c.f14135b.f13962f.put(this.f14253b.f14187c.f14134a, this.f14252a);
        }
        this.f14253b.f14187c.f14135b.m18315e(this.f14253b.f14187c.f14134a);
    }
}
