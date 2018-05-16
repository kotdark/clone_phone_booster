package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.facebook.ads.C0945h;
import java.util.ArrayList;

/* compiled from: AdvertisementModel */
class bo implements Runnable {
    final /* synthetic */ C0945h f13999a;
    final /* synthetic */ bn f14000b;

    bo(bn bnVar, C0945h c0945h) {
        this.f14000b = bnVar;
        this.f13999a = c0945h;
    }

    public void run() {
        this.f14000b.f13998d.f13988b.m18248a(false, SystemClock.elapsedRealtime() - this.f14000b.f13995a, this.f13999a == null ? null : this.f13999a.m4181b());
        this.f14000b.f13998d.f13987a.offer(new ArrayList());
    }
}
