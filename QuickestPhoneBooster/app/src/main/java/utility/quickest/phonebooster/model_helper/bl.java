package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.facebook.ads.ad;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: AdvertisementModel */
class bl implements Runnable {
    final /* synthetic */ bk f13992a;

    bl(bk bkVar) {
        this.f13992a = bkVar;
    }

    public void run() {
        this.f13992a.f13991c.f13988b.m18248a(true, SystemClock.elapsedRealtime() - this.f13992a.f13989a, null);
        List arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ad adVar = null;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            try {
                adVar = this.f13992a.f13990b.m4160a();
                if (adVar != null) {
                    arrayList.add(new cv(new bh(this.f13992a.f13991c.f13988b.a, this.f13992a.f13991c.f13988b.b, this.f13992a.f13991c.f13988b.c, this.f13992a.f13991c.f13988b.d, elapsedRealtime, this.f13992a.f13991c.f13988b.f, this.f13992a.f13991c.f13988b.g, this.f13992a.f13991c.f13988b.h, this.f13992a.f13991c.f13988b.i, this.f13992a.f13991c.f13988b.j, UUID.randomUUID().toString(), adVar, null)));
                }
            } catch (Throwable th) {
            }
            if (adVar == null || i2 >= this.f13992a.f13991c.f13988b.d) {
                this.f13992a.f13991c.f13987a.offer(arrayList);
            } else {
                i = i2;
            }
        }
        this.f13992a.f13991c.f13987a.offer(arrayList);
    }
}
