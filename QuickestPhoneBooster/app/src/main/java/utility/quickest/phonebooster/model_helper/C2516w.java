package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import java.util.UUID;

/* compiled from: AdvertisementModel */
class C2516w implements Runnable {
    final /* synthetic */ GAInterstitialAdListener f14511a;

    C2516w(GAInterstitialAdListener c2514u) {
        this.f14511a = c2514u;
    }

    public void run() {
        this.f14511a.f14508d.f14504c.f14501b.m18248a(true, SystemClock.elapsedRealtime() - this.f14511a.f14505a, null);
        this.f14511a.f14508d.f14503b.add(new cv(new C2510q(this.f14511a.f14508d.f14504c.f14501b.a, this.f14511a.f14508d.f14504c.f14501b.b, this.f14511a.f14508d.f14504c.f14501b.c, this.f14511a.f14508d.f14504c.f14501b.d, SystemClock.elapsedRealtime(), this.f14511a.f14508d.f14504c.f14501b.f, this.f14511a.f14508d.f14504c.f14501b.g, this.f14511a.f14508d.f14504c.f14501b.h, this.f14511a.f14508d.f14504c.f14501b.i, this.f14511a.f14508d.f14504c.f14501b.j, UUID.randomUUID().toString(), this.f14511a.interstitialAd, this.f14511a.runnables)));
        this.f14511a.f14508d.f14502a.countDown();
    }
}
