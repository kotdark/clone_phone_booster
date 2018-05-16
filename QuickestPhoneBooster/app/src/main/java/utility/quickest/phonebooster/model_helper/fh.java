package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2449g;

/* compiled from: BatteryModel */
class fh implements Runnable {
    final /* synthetic */ C2449g f14197a;
    final /* synthetic */ fg f14198b;

    fh(fg fgVar, C2449g c2449g) {
        this.f14198b = fgVar;
        this.f14197a = c2449g;
    }

    public void run() {
        this.f14198b.f14196a.m18197a(this.f14197a);
        long a = this.f14198b.f14196a.m18206h();
        if (a >= 0) {
            this.f14198b.f14196a.f13877c.postDelayed(this.f14198b.f14196a.f13878d, a);
        }
    }
}
