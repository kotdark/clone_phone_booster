package utility.quickest.phonebooster.model_helper;

/* compiled from: MiscHelper */
class hj implements Runnable {
    final /* synthetic */ boolean f14329a;
    final /* synthetic */ hi f14330b;

    hj(hi hiVar, boolean z) {
        this.f14330b = hiVar;
        this.f14329a = z;
    }

    public void run() {
        hh.f14320a = false;
        if (this.f14329a) {
            this.f14330b.f14328b.m17488b(System.currentTimeMillis());
        }
    }
}
