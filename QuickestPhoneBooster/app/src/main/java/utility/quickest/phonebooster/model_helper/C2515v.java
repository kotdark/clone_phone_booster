package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;

/* compiled from: AdvertisementModel */
class C2515v implements Runnable {
    final /* synthetic */ int f14509a;
    final /* synthetic */ GAInterstitialAdListener f14510b;

    C2515v(GAInterstitialAdListener c2514u, int i) {
        this.f14510b = c2514u;
        this.f14509a = i;
    }

    public void run() {
        this.f14510b.f14508d.f14504c.f14501b.m18248a(false, SystemClock.elapsedRealtime() - this.f14510b.f14505a, String.valueOf(this.f14509a));
        this.f14510b.f14508d.f14502a.countDown();
    }
}
