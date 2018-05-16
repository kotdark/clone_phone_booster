package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.Set;

/* compiled from: DeepJunkHelper */
class gq implements Runnable {
    final /* synthetic */ long f14282a;
    final /* synthetic */ long f14283b;
    final /* synthetic */ fw f14284c;

    gq(fw fwVar, long j, long j2) {
        this.f14284c = fwVar;
        this.f14282a = j;
        this.f14283b = j2;
    }

    public void run() {
        Throwable th;
        try {
            long j;
            Set<String> keySet = C2535e.m19030a(true).keySet();
            int size = keySet.size();
            if (size == 0) {
                j = 0;
            } else {
                j = Math.max((this.f14282a < 0 ? 0 : this.f14282a) / ((long) size), this.f14283b);
            }
            long[] jArr = new long[]{0};
            int i = 0;
            for (String str : keySet) {
                int i2 = i + 1;
                if (str.equals("utility.quickest.phonebooster")) {
                    i = i2;
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    i = (int) ((((float) i2) * 100.0f) / ((float) size));
                    if (i < 0) {
                        i = 0;
                    } else if (i > 100) {
                        i = 100;
                    }
                    this.f14284c.m18568a(str, null, i, jArr);
                    this.f14284c.m18579b(str, null, i, jArr);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 < 0) {
                        elapsedRealtime2 = 0;
                    }
                    if (elapsedRealtime2 < j) {
                        try {
                            Thread.sleep(j - elapsedRealtime2);
                        } catch (Throwable th2) {
                        }
                    }
                    i = i2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        ThreadUtil.m19099a(false, new gr(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
