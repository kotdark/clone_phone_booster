package utility.quickest.phonebooster.util;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;

/* compiled from: DeviceUtil */
final class C2536f implements Runnable {
    C2536f() {
    }

    public void run() {
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(MyApplicationLike.getApplication());
            if (advertisingIdInfo != null) {
                synchronized (C2535e.class) {
                    C2535e.f14690n = advertisingIdInfo.getId() == null ? "" : advertisingIdInfo.getId().trim();
                    C2535e.f14691o = String.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
                }
                 SharedPrefHelper.m17454a().m17484a(C2535e.f14690n, C2535e.f14691o);
            }
        } catch (Throwable th) {
        }
    }
}
