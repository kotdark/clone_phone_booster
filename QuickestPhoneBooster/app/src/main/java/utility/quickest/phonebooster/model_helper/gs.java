package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import android.support.v4.util.Pair;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;

/* compiled from: DeepJunkHelper */
class gs implements Runnable {
    final /* synthetic */ long f14286a;
    final /* synthetic */ long f14287b;
    final /* synthetic */ fw f14288c;

    gs(fw fwVar, long j, long j2) {
        this.f14288c = fwVar;
        this.f14286a = j;
        this.f14287b = j2;
    }

    public void run() {
        Throwable th;
        try {
            long j;
            List<Pair> a = fw.m18572b(C2429a.m17452a(), C2535e.m19030a(true).keySet());
            if (a.isEmpty()) {
                j = 0;
            } else {
                j = Math.max((this.f14286a < 0 ? 0 : this.f14286a) / ((long) a.size()), this.f14287b);
            }
            long[] jArr = new long[]{0};
            int i = 0;
            for (Pair pair : a) {
                int i2 = i + 1;
                if (((String) pair.first).equals("utility.quickest.phonebooster")) {
                    i = i2;
                } else {
                    int i3;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    i = (int) ((((float) i2) * 100.0f) / ((float) a.size()));
                    if (i < 0) {
                        i3 = 0;
                    } else if (i > 100) {
                        i3 = 100;
                    } else {
                        i3 = i;
                    }
                    this.f14288c.m18568a((String) pair.first, (String) pair.second, i3, jArr);
                    this.f14288c.m18579b((String) pair.first, (String) pair.second, i3, jArr);
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
        ThreadUtil.m19099a(false, new gt(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
