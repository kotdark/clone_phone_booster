package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.C1973m;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: AdvertisementModel */
class ar implements Runnable {
    final /* synthetic */ CountDownLatch f13936a;
    final /* synthetic */ List f13937b;
    final /* synthetic */ aq f13938c;

    ar(aq aqVar, CountDownLatch countDownLatch, List list) {
        this.f13938c = aqVar;
        this.f13936a = countDownLatch;
        this.f13937b = list;
    }

    public void run() {
        C1973m c1973m = null;
        C2492b a = C2492b.m18285a();
        if (a.f13964h != null) {
            try {
                c1973m = a.f13964h.mo3077a(this.f13938c.f13935b.a);
            } catch (Throwable th) {
            }
        }
        if (c1973m == null) {
            this.f13936a.countDown();
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c1973m.setAdUnitId(this.f13938c.f13935b.j);
            c1973m.setAdListener(new as(this, elapsedRealtime, c1973m));
            c1973m.mo1947a(new AdRequest().m8847a());
        } catch (Throwable th2) {
            this.f13936a.countDown();
        }
    }
}
