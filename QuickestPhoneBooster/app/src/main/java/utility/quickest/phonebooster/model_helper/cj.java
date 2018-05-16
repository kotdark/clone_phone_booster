package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.mobpower.p116a.C2601a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: AdvertisementModel */
class cj implements Runnable {
    final /* synthetic */ List f14037a;
    final /* synthetic */ ch f14038b;

    cj(ch chVar, List list) {
        this.f14038b = chVar;
        this.f14037a = list;
    }

    public void run() {
        this.f14038b.f14034c.f14031b.m18248a(true, SystemClock.elapsedRealtime() - this.f14038b.f14032a, null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        if (this.f14037a != null) {
            for (C2601a c2601a : this.f14037a) {
                if (c2601a != null) {
                    Object obj = new Runnable[]{null};
                    arrayList.add(new cv(new cc(this.f14038b.f14034c.f14031b.a, this.f14038b.f14034c.f14031b.b, this.f14038b.f14034c.f14031b.c, this.f14038b.f14034c.f14031b.d, elapsedRealtime, this.f14038b.f14034c.f14031b.f, this.f14038b.f14034c.f14031b.g, this.f14038b.f14034c.f14031b.h, this.f14038b.f14034c.f14031b.i, this.f14038b.f14034c.f14031b.j, UUID.randomUUID().toString(), c2601a, obj)));
                    this.f14038b.f14033b.put(c2601a, obj);
                }
            }
        }
        this.f14038b.f14034c.f14030a.offer(arrayList);
    }
}
