package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2450h;
import utility.quickest.phonebooster.p114d.C2451i;

/* compiled from: DeepJunkHelper */
class gf implements Runnable {
    final /* synthetic */ C2450h f14267a;
    final /* synthetic */ C2451i f14268b;
    final /* synthetic */ ge f14269c;

    gf(ge geVar, C2450h c2450h, C2451i c2451i) {
        this.f14269c = geVar;
        this.f14267a = c2450h;
        this.f14268b = c2451i;
    }

    public void run() {
        C2450h c2450h = (C2450h) this.f14269c.f14266d.f14243h.get(this.f14267a.m17669a());
        if (c2450h != null) {
            c2450h = c2450h.m17670b(this.f14268b);
            if (c2450h == null) {
                this.f14269c.f14266d.f14243h.remove(this.f14267a.m17669a());
            } else {
                this.f14269c.f14266d.f14243h.put(c2450h.m17669a(), c2450h);
            }
        }
    }
}
