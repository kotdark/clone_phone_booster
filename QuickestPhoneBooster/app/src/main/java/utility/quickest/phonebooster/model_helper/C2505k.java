package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p113c.C2432a;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class C2505k implements Runnable {
    final /* synthetic */ da f14481a;
    final /* synthetic */ C2504j f14482b;

    C2505k(C2504j c2504j, da daVar) {
        this.f14482b = c2504j;
        this.f14481a = daVar;
    }

    public void run() {
        this.f14482b.f14439b.f13959c = false;
        long j = 3600000;
        if (C2432a.m17559a(this.f14481a.f14066a)) {
            if (this.f14481a.f14067b.f14491b == null) {
                this.f14481a.f14067b.f14491b = "";
            } else {
                this.f14481a.f14067b.f14491b = this.f14481a.f14067b.f14491b.trim();
                if ("utility.quickest.phonebooster".equals(this.f14481a.f14067b.f14491b)) {
                    this.f14481a.f14067b.f14491b = "";
                }
            }
            if (this.f14481a.f14067b.f14491b.equals(this.f14482b.f14439b.f13961e)) {
                this.f14482b.f14439b.f13960d = this.f14481a.f14067b.f14490a;
            }
            if (this.f14481a.f14068c.ExpireInSeconds > 0) {
                j = this.f14481a.f14068c.ExpireInSeconds * 1000;
            }
            ThreadUtil.m19096a(new C2506l(this));
        }
        ThreadUtil.m19098a(new C2507m(this), j);
    }
}
