package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2454l;

/* compiled from: SwitchModel */
class iy implements Runnable {
    final /* synthetic */ C2454l f14435a;
    final /* synthetic */ ix f14436b;

    iy(ix ixVar, C2454l c2454l) {
        this.f14436b = ixVar;
        this.f14435a = c2454l;
    }

    public void run() {
        this.f14436b.f14434a.m18218a(this.f14435a);
        if (!this.f14436b.f14434a.f13884e.isEmpty()) {
            this.f14436b.f14434a.f13882c.postDelayed(this.f14436b.f14434a.f13883d, 1000);
        }
    }
}
