package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;

import com.facebook.ads.AdError;

/* compiled from: AdvertisementModel */
class bc implements Runnable {
    final /* synthetic */ AdError adError;
    final /* synthetic */ FBInterstitialAdListener f13976b;

    bc(FBInterstitialAdListener FBInterstitialAdListenerVar, AdError c0945h) {
        this.f13976b = FBInterstitialAdListenerVar;
        this.adError = c0945h;
    }

    public void run() {
        this.f13976b.f13974d.f13970c.f13954b.m18248a(false, SystemClock.elapsedRealtime() - this.f13976b.f13971a, this.adError == null ? null : this.adError.getErrorMessage());
        this.f13976b.f13974d.f13968a.countDown();
    }
}
