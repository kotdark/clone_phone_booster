package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import utility.quickest.phonebooster.app.MyApplicationLike;
import com.mobpower.nativeads.p128b.C2736b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisementModel */
class cg implements Runnable {
    final /* synthetic */ LinkedBlockingQueue f14030a;
    final /* synthetic */ cc f14031b;

    cg(cc ccVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f14031b = ccVar;
        this.f14030a = linkedBlockingQueue;
    }

    public void run() {
        Map hashMap = new HashMap();
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C2736b c2736b = new C2736b(MyApplicationLike.getApplication(), this.f14031b.j, this.f14031b.d);
            c2736b.m20255a(new ch(this, elapsedRealtime, hashMap));
            c2736b.m20252a();
        } catch (Throwable th) {
            this.f14030a.offer(new ArrayList());
        }
    }
}
