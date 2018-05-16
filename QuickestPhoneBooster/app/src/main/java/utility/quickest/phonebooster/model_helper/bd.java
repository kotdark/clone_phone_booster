package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import java.util.UUID;

/* compiled from: AdvertisementModel */
class bd implements Runnable {
    final /* synthetic */ FBInterstitialAdListener f13977a;

    bd(FBInterstitialAdListener FBInterstitialAdListenerVar) {
        this.f13977a = FBInterstitialAdListenerVar;
    }

    public void run() {
        this.f13977a.f13974d.f13970c.f13954b.m18248a(true, SystemClock.elapsedRealtime() - this.f13977a.f13971a, null);
        this.f13977a.f13974d.f13969b.add(new cv(new ax(this.f13977a.f13974d.f13970c.f13954b.a, this.f13977a.f13974d.f13970c.f13954b.b, this.f13977a.f13974d.f13970c.f13954b.c, this.f13977a.f13974d.f13970c.f13954b.d, SystemClock.elapsedRealtime(), this.f13977a.f13974d.f13970c.f13954b.f, this.f13977a.f13974d.f13970c.f13954b.g, this.f13977a.f13974d.f13970c.f13954b.h, this.f13977a.f13974d.f13970c.f13954b.i, this.f13977a.f13974d.f13970c.f13954b.j, UUID.randomUUID().toString(), this.f13977a.f13972b, this.f13977a.f13973c)));
        this.f13977a.f13974d.f13968a.countDown();
    }
}
