package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.mopub.nativeads.NativeErrorCode;

/* compiled from: AdvertisementModel */
class bz implements Runnable {
    final /* synthetic */ NativeErrorCode f14017a;
    final /* synthetic */ bx f14018b;

    bz(bx bxVar, NativeErrorCode nativeErrorCode) {
        this.f14018b = bxVar;
        this.f14017a = nativeErrorCode;
    }

    public void run() {
        this.f14018b.f14014b.f14012c.f14009b.m18248a(false, SystemClock.elapsedRealtime() - this.f14018b.f14013a, this.f14017a == null ? null : this.f14017a.toString());
        this.f14018b.f14014b.f14010a.countDown();
    }
}
