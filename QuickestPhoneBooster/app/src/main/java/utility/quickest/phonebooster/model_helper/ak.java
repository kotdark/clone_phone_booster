package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import java.util.UUID;

/* compiled from: AdvertisementModel */
class ak implements Runnable {
    final /* synthetic */ NativeAppInstallAd f13924a;
    final /* synthetic */ GANativeAppInstallListener f13925b;

    ak(GANativeAppInstallListener GANativeAppInstallListenerVar, NativeAppInstallAd c1860i) {
        this.f13925b = GANativeAppInstallListenerVar;
        this.f13924a = c1860i;
    }

    public void run() {
        this.f13925b.f13923c.f13909c.f13906b.m18248a(true, SystemClock.elapsedRealtime() - this.f13925b.f13921a, null);
        if (this.f13924a != null) {
            this.f13925b.f13923c.f13907a.add(new
                    cv(new GANativeAdModel(this.f13925b.f13923c.f13909c.f13906b.f13887a, this.f13925b.f13923c.f13909c.f13906b.adId, this.f13925b.f13923c.f13909c.f13906b.f13889c, this.f13925b.f13923c.f13909c.f13906b.f13890d, SystemClock.elapsedRealtime(), this.f13925b.f13923c.f13909c.f13906b.f13892f, this.f13925b.f13923c.f13909c.f13906b.f13893g, this.f13925b.f13923c.f13909c.f13906b.f13894h, this.f13925b.f13923c.f13909c.f13906b.f13895i, this.f13925b.f13923c.f13909c.f13906b.f13896j, UUID.randomUUID().toString(), this.f13924a, this.f13925b.f13922b)));
        }
        this.f13925b.f13923c.f13908b.countDown();
    }
}
