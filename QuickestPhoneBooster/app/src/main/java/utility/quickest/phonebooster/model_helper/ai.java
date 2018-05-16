package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.google.android.gms.ads.formats.NativeContentAd;
import java.util.UUID;

/* compiled from: AdvertisementModel */
class ai implements Runnable {
    final /* synthetic */ NativeContentAd f13919a;
    final /* synthetic */ GANativeContentListener f13920b;

    ai(GANativeContentListener GANativeContentListenerVar, NativeContentAd c1861k) {
        this.f13920b = GANativeContentListenerVar;
        this.f13919a = c1861k;
    }

    public void run() {
        this.f13920b.f13918c.f13909c.f13906b.m18248a(true, SystemClock.elapsedRealtime() - this.f13920b.f13916a, null);
        if (this.f13919a != null) {
            this.f13920b.f13918c.f13907a.add(new cv(new GANativeAdModel(this.f13920b.f13918c.f13909c.f13906b.a, this.f13920b.f13918c.f13909c.f13906b.b, this.f13920b.f13918c.f13909c.f13906b.c, this.f13920b.f13918c.f13909c.f13906b.d, SystemClock.elapsedRealtime(), this.f13920b.f13918c.f13909c.f13906b.f, this.f13920b.f13918c.f13909c.f13906b.g, this.f13920b.f13918c.f13909c.f13906b.h, this.f13920b.f13918c.f13909c.f13906b.i, this.f13920b.f13918c.f13909c.f13906b.j, UUID.randomUUID().toString(), this.f13919a, this.f13920b.f13917b)));
        }
        this.f13920b.f13918c.f13908b.countDown();
    }
}
