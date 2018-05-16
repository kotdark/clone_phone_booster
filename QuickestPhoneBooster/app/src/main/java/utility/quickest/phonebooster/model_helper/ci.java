package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.mobpower.p116a.C2602b;
import java.util.ArrayList;

/* compiled from: AdvertisementModel */
class ci implements Runnable {
    final /* synthetic */ C2602b f14035a;
    final /* synthetic */ ch f14036b;

    ci(ch chVar, C2602b c2602b) {
        this.f14036b = chVar;
        this.f14035a = c2602b;
    }

    public void run() {
        this.f14036b.f14034c.f14031b.m18248a(false, SystemClock.elapsedRealtime() - this.f14036b.f14032a, this.f14035a == null ? null : this.f14035a.m19415a());
        this.f14036b.f14034c.f14030a.offer(new ArrayList());
    }
}
