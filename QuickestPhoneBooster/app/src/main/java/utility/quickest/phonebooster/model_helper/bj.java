package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.facebook.ads.ad;
import com.facebook.ads.am;
import com.facebook.ads.au;
import utility.quickest.phonebooster.app.MyApplicationLike;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisementModel */
class bj implements Runnable {
    final /* synthetic */ LinkedBlockingQueue f13987a;
    final /* synthetic */ bh f13988b;

    bj(bh bhVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f13988b = bhVar;
        this.f13987a = linkedBlockingQueue;
    }

    public void run() {
        try {
            if (this.f13988b.d > 1) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                au auVar = new au(MyApplicationLike.getApplication(), this.f13988b.j, this.f13988b.d);
                auVar.m4161a(new bk(this, elapsedRealtime, auVar));
                auVar.m4162a(EnumSet.of(am.VIDEO));
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Runnable[] runnableArr = new Runnable[]{null};
            ad adVar = new ad(MyApplicationLike.getApplication(), this.f13988b.j);
            adVar.m4080a(new bn(this, elapsedRealtime2, adVar, runnableArr));
            adVar.m4082a(EnumSet.of(am.VIDEO));
        } catch (Throwable th) {
            this.f13987a.offer(new ArrayList());
        }
    }
}
