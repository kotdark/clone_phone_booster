package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.facebook.ads.C0945h;
import java.util.ArrayList;

/* compiled from: AdvertisementModel */
class bm implements Runnable {
    final /* synthetic */ C0945h f13993a;
    final /* synthetic */ bk f13994b;

    bm(bk bkVar, C0945h c0945h) {
        this.f13994b = bkVar;
        this.f13993a = c0945h;
    }

    public void run() {
        this.f13994b.f13991c.f13988b.m18248a(false, SystemClock.elapsedRealtime() - this.f13994b.f13989a, this.f13993a == null ? null : this.f13993a.m4181b());
        this.f13994b.f13991c.f13987a.offer(new ArrayList());
    }
}
