package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2445c;
import utility.quickest.phonebooster.p114d.C2451i;

/* compiled from: DeepJunkHelper */
class ga implements Runnable {
    final /* synthetic */ C2445c f14254a;
    final /* synthetic */ C2451i f14255b;
    final /* synthetic */ fz f14256c;

    ga(fz fzVar, C2445c c2445c, C2451i c2451i) {
        this.f14256c = fzVar;
        this.f14254a = c2445c;
        this.f14255b = c2451i;
    }

    public void run() {
        C2445c c2445c = (C2445c) this.f14256c.f14251d.f14242g.get(this.f14254a.m17623a());
        if (c2445c != null) {
            c2445c = c2445c.m17624b(this.f14255b);
            if (c2445c == null) {
                this.f14256c.f14251d.f14242g.remove(this.f14254a.m17623a());
            } else {
                this.f14256c.f14251d.f14242g.put(c2445c.m17623a(), c2445c);
            }
        }
    }
}
