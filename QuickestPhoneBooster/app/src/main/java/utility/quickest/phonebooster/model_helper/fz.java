package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import utility.quickest.phonebooster.p114d.C2445c;
import utility.quickest.phonebooster.p114d.C2451i;
import utility.quickest.phonebooster.util.C2541l;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;

/* compiled from: DeepJunkHelper */
class fz implements Runnable {
    final /* synthetic */ List f14248a;
    final /* synthetic */ long f14249b;
    final /* synthetic */ long f14250c;
    final /* synthetic */ fw f14251d;

    fz(fw fwVar, List list, long j, long j2) {
        this.f14251d = fwVar;
        this.f14248a = list;
        this.f14249b = j;
        this.f14250c = j2;
    }

    public void run() {
        Throwable th;
        try {
            long j;
            long j2;
            if (this.f14248a.isEmpty()) {
                j = 0;
            } else {
                if (this.f14249b < 0) {
                    j2 = 0;
                } else {
                    j2 = this.f14249b;
                }
                j = Math.max(j2 / ((long) this.f14248a.size()), this.f14250c);
            }
            long[] jArr = new long[]{0};
            int i = 0;
            for (C2445c c2445c : this.f14248a) {
                int i2;
                int i3 = i + 1;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                i = (int) ((((float) i3) * 100.0f) / ((float) this.f14248a.size()));
                if (i < 0) {
                    i2 = 0;
                } else if (i > 100) {
                    i2 = 100;
                } else {
                    i2 = i;
                }
                for (C2451i c2451i : c2445c.m17625b()) {
                    C2541l.m19070b(c2451i.m17675a());
                    ThreadUtil.m19099a(false, new ga(this, c2445c, c2451i));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 - jArr[0] >= 100) {
                        jArr[0] = elapsedRealtime2;
                        ThreadUtil.m19099a(false, new gb(this, c2451i, i2));
                    }
                }
                ThreadUtil.m19099a(false, new gc(this, c2445c));
                j2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (j2 < 0) {
                    j2 = 0;
                }
                if (j2 < j) {
                    try {
                        Thread.sleep(j - j2);
                    } catch (Throwable th2) {
                    }
                }
                i = i3;
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        ThreadUtil.m19099a(false, new gd(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
