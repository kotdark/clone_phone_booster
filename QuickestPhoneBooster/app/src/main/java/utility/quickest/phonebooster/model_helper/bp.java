package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: AdvertisementModel */
class bp implements Runnable {
    final /* synthetic */ bn f14001a;

    bp(bn bnVar) {
        this.f14001a = bnVar;
    }

    public void run() {
        this.f14001a.f13998d.f13988b.m18248a(true, SystemClock.elapsedRealtime() - this.f14001a.f13995a, null);
        List arrayList = new ArrayList();
        arrayList.add(new cv(new bh(this.f14001a.f13998d.f13988b.a, this.f14001a.f13998d.f13988b.b, this.f14001a.f13998d.f13988b.c, this.f14001a.f13998d.f13988b.d, SystemClock.elapsedRealtime(), this.f14001a.f13998d.f13988b.f, this.f14001a.f13998d.f13988b.g, this.f14001a.f13998d.f13988b.h, this.f14001a.f13998d.f13988b.i, this.f14001a.f13998d.f13988b.j, UUID.randomUUID().toString(), this.f14001a.f13996b, this.f14001a.f13997c)));
        this.f14001a.f13998d.f13987a.offer(arrayList);
    }
}
