package utility.quickest.phonebooster.model_helper;

/* compiled from: SplashHelper */
class io implements Runnable {
    final /* synthetic */ im f14420a;

    io(im imVar) {
        this.f14420a = imVar;
    }

    public void run() {
        if (!this.f14420a.f14416b) {
            if (this.f14420a.f14418e != null) {
                this.f14420a.f14418e.mo3102a(this.f14420a.f14415a);
            }
            if (!this.f14420a.f14415a) {
                this.f14420a.m18731d();
                im.f14414d.postDelayed(this.f14420a.f14417c, 3000);
            }
        }
    }
}
