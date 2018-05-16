package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2446d;

/* compiled from: AppRunningHelper */
class eo implements Runnable {
    final /* synthetic */ C2446d f14157a;
    final /* synthetic */ en f14158b;

    eo(en enVar, C2446d c2446d) {
        this.f14158b = enVar;
        this.f14157a = c2446d;
    }

    public void run() {
        this.f14158b.f14156c.f14144c.remove(this.f14157a.m17629a());
    }
}
