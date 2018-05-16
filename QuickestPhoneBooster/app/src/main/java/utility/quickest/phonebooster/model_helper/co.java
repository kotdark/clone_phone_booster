package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.response_data.AdvertisementListServiceExpression;
import utility.quickest.phonebooster.network.response_data.AdvertisementServiceExpression;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.p114d.OwnCampaignInfo;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisementModel */
class co implements Runnable {
    final /* synthetic */ C2443a f14045a;
    final /* synthetic */ LinkedBlockingQueue f14046b;
    final /* synthetic */ cm f14047c;

    co(cm cmVar, C2443a c2443a, LinkedBlockingQueue linkedBlockingQueue) {
        this.f14047c = cmVar;
        this.f14045a = c2443a;
        this.f14046b = linkedBlockingQueue;
    }

    public void run() {
        String str;
        boolean z;
        String str2;
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            AdvertisementListServiceExpression advertisementListServiceExpression = (AdvertisementListServiceExpression) C2522c.m18847a().m18842a(C2542m.m19076a(this.f14045a.m17612b()), this.f14047c.a.m18427b(), Integer.valueOf(this.f14047c.d), this.f14047c.j).mo1131a().m2659b();
            if (!(advertisementListServiceExpression == null || advertisementListServiceExpression.List == null)) {
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                for (AdvertisementServiceExpression a : advertisementListServiceExpression.List) {
                    OwnCampaignInfo a2 = OwnCampaignInfo.m17677a(a);
                    if (a2 != null) {
                        arrayList.add(new cv(new cm(this.f14047c.a, this.f14047c.b, this.f14047c.c, this.f14047c.d, elapsedRealtime3, Math.min(this.f14047c.f, (a2.m17686i() - elapsedRealtime3) / 1000), this.f14047c.g, this.f14047c.h, this.f14047c.i, this.f14047c.j, UUID.randomUUID().toString(), a2)));
                    }
                }
            }
            if (SystemClock.elapsedRealtime() - elapsedRealtime2 > 1500) {
                str = "OK>1.5s";
            } else {
                str = "OK<=1.5s";
            }
            z = true;
            str2 = null;
        } catch (Throwable th) {
            str2 = th.getClass().getSimpleName();
            z = false;
            str = str2;
        }
        ThreadUtil.m19099a(false, new cp(this, z, SystemClock.elapsedRealtime() - elapsedRealtime, str2));
        ThreadUtil.m19099a(false, new cq(this, str));
        this.f14046b.offer(arrayList);
    }
}
