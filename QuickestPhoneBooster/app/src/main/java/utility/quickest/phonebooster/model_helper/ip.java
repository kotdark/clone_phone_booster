package utility.quickest.phonebooster.model_helper;

/* compiled from: SplashHelper */
class ip implements Runnable {
    final /* synthetic */ C2492b f14421a;
    final /* synthetic */ im f14422b;

    ip(im imVar, C2492b c2492b) {
        this.f14422b = imVar;
        this.f14421a = c2492b;
    }

    public void run() {
        if (!this.f14422b.f14416b) {
            this.f14421a.m18325a(db.SPLASH, new iq(this));
        }
    }
}
