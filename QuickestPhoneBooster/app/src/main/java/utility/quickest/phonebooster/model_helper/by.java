package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.mopub.nativeads.NativeAd;
import java.util.UUID;

/* compiled from: AdvertisementModel */
class by implements Runnable {
    final /* synthetic */ NativeAd f14015a;
    final /* synthetic */ bx f14016b;

    by(bx bxVar, NativeAd nativeAd) {
        this.f14016b = bxVar;
        this.f14015a = nativeAd;
    }

    public void run() {
        if (this.f14015a == null) {
            this.f14016b.f14014b.f14012c.f14009b.m18248a(false, SystemClock.elapsedRealtime() - this.f14016b.f14013a, "NativeAdIsNull");
        } else {
            this.f14016b.f14014b.f14012c.f14009b.m18248a(true, SystemClock.elapsedRealtime() - this.f14016b.f14013a, null);
            this.f14016b.f14014b.f14011b.add(new cv(new bs(this.f14016b.f14014b.f14012c.f14009b.a, this.f14016b.f14014b.f14012c.f14009b.b, this.f14016b.f14014b.f14012c.f14009b.c, this.f14016b.f14014b.f14012c.f14009b.d, SystemClock.elapsedRealtime(), this.f14016b.f14014b.f14012c.f14009b.f, this.f14016b.f14014b.f14012c.f14009b.g, this.f14016b.f14014b.f14012c.f14009b.h, this.f14016b.f14014b.f14012c.f14009b.i, this.f14016b.f14014b.f14012c.f14009b.j, UUID.randomUUID().toString(), this.f14015a)));
        }
        this.f14016b.f14014b.f14010a.countDown();
    }
}
