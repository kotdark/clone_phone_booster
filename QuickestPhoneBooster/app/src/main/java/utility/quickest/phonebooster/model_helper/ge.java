package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import utility.quickest.phonebooster.p114d.C2450h;
import utility.quickest.phonebooster.p114d.C2451i;
import utility.quickest.phonebooster.util.C2541l;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;

/* compiled from: DeepJunkHelper */
class ge implements Runnable {
    final /* synthetic */ List f14263a;
    final /* synthetic */ long f14264b;
    final /* synthetic */ long f14265c;
    final /* synthetic */ fw f14266d;

    ge(fw fwVar, List list, long j, long j2) {
        this.f14266d = fwVar;
        this.f14263a = list;
        this.f14264b = j;
        this.f14265c = j2;
    }

    public void run() {
        Throwable th;
        try {
            long j;
            long j2;
            if (this.f14263a.isEmpty()) {
                j = 0;
            } else {
                if (this.f14264b < 0) {
                    j2 = 0;
                } else {
                    j2 = this.f14264b;
                }
                j = Math.max(j2 / ((long) this.f14263a.size()), this.f14265c);
            }
            long[] jArr = new long[]{0};
            int i = 0;
            for (C2450h c2450h : this.f14263a) {
                int i2;
                int i3 = i + 1;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                i = (int) ((((float) i3) * 100.0f) / ((float) this.f14263a.size()));
                if (i < 0) {
                    i2 = 0;
                } else if (i > 100) {
                    i2 = 100;
                } else {
                    i2 = i;
                }
                for (C2451i c2451i : c2450h.m17672c()) {
                    C2541l.m19070b(c2451i.m17675a());
                    ThreadUtil.m19099a(false, new gf(this, c2450h, c2451i));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 - jArr[0] >= 100) {
                        jArr[0] = elapsedRealtime2;
                        ThreadUtil.m19099a(false, new gg(this, c2451i, i2));
                    }
                }
                ThreadUtil.m19099a(false, new gh(this, c2450h));
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
        ThreadUtil.m19099a(false, new gi(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
