package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;

/* compiled from: AppRunningHelper */
class en implements Runnable {
    final /* synthetic */ List f14154a;
    final /* synthetic */ long f14155b;
    final /* synthetic */ eh f14156c;

    en(eh ehVar, List list, long j) {
        this.f14156c = ehVar;
        this.f14154a = list;
        this.f14155b = j;
    }

    public void run() {
        Throwable th;
        try {
            long[] jArr = new long[]{0};
            for (C2446d c2446d : this.f14154a) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C2535e.m19037d(c2446d.m17629a());
                ThreadUtil.m19099a(false, new eo(this, c2446d));
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (elapsedRealtime2 - jArr[0] >= 100) {
                    jArr[0] = elapsedRealtime2;
                    ThreadUtil.m19099a(false, new ep(this, c2446d));
                }
                elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime < 0) {
                    elapsedRealtime = 0;
                }
                if (elapsedRealtime < this.f14155b) {
                    try {
                        SystemClock.sleep(this.f14155b - elapsedRealtime);
                    } catch (Throwable th2) {
                    }
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        ThreadUtil.m19099a(false, new eq(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
