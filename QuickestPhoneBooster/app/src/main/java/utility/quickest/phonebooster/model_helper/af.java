package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;

/* compiled from: AdvertisementModel */
class af implements Runnable {
    final /* synthetic */ int f13913a;
    final /* synthetic */ GANativeAdListener f13914b;

    af(GANativeAdListener GANativeAdListenerVar, int i) {
        this.f13914b = GANativeAdListenerVar;
        this.f13913a = i;
    }

    public void run() {
        this.f13914b.f13912c.f13909c.f13906b.m18248a(false, SystemClock.elapsedRealtime() - this.f13914b.f13910a, String.valueOf(this.f13913a));
        this.f13914b.f13912c.f13908b.countDown();
    }
}
