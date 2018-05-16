package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import java.util.UUID;

/* compiled from: AdvertisementModel */
class au implements Runnable {
    final /* synthetic */ as f13944a;

    au(as asVar) {
        this.f13944a = asVar;
    }

    public void run() {
        this.f13944a.f13941c.f13938c.f13935b.m18248a(true, SystemClock.elapsedRealtime() - this.f13944a.f13939a, null);
        this.f13944a.f13941c.f13937b.add(new cv(new an(this.f13944a.f13941c.f13938c.f13935b.a, this.f13944a.f13941c.f13938c.f13935b.b, this.f13944a.f13941c.f13938c.f13935b.c, this.f13944a.f13941c.f13938c.f13935b.d, SystemClock.elapsedRealtime(), this.f13944a.f13941c.f13938c.f13935b.f, this.f13944a.f13941c.f13938c.f13935b.g, this.f13944a.f13941c.f13938c.f13935b.h, this.f13944a.f13941c.f13938c.f13935b.i, this.f13944a.f13941c.f13938c.f13935b.j, UUID.randomUUID().toString(), this.f13944a.f13940b)));
        this.f13944a.f13941c.f13936a.countDown();
    }
}
