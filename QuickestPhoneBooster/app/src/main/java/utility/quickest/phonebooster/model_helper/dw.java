package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import utility.quickest.phonebooster.p114d.C2444b;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;

/* compiled from: ApkFileScanningModel */
class dw implements Runnable {
    final /* synthetic */ List f14123a;
    final /* synthetic */ long f14124b;
    final /* synthetic */ long f14125c;
    final /* synthetic */ eb f14126d;
    final /* synthetic */ dr f14127e;

    dw(dr drVar, List list, long j, long j2, eb ebVar) {
        this.f14127e = drVar;
        this.f14123a = list;
        this.f14124b = j;
        this.f14125c = j2;
        this.f14126d = ebVar;
    }

    public void run() {
        Throwable th;
        try {
            long j;
            long j2;
            if (this.f14123a.isEmpty()) {
                j = 0;
            } else {
                if (this.f14124b < 0) {
                    j2 = 0;
                } else {
                    j2 = this.f14124b;
                }
                j = Math.max(j2 / ((long) this.f14123a.size()), this.f14125c);
            }
            long[] jArr = new long[]{0};
            int i = 0;
            for (C2444b c2444b : this.f14123a) {
                int i2 = i + 1;
                if (c2444b == null) {
                    i = i2;
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    i = (int) ((((float) i2) * 100.0f) / ((float) this.f14123a.size()));
                    if (i < 0) {
                        i = 0;
                    } else if (i > 100) {
                        i = 100;
                    }
                    try {
                        c2444b.m17614a().delete();
                    } catch (Throwable th2) {
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 - jArr[0] >= 100) {
                        jArr[0] = elapsedRealtime2;
                        ThreadUtil.m19099a(false, new dx(this, c2444b, i));
                    }
                    j2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (j2 < 0) {
                        j2 = 0;
                    }
                    if (j2 < j) {
                        try {
                            Thread.sleep(j - j2);
                        } catch (Throwable th3) {
                        }
                    }
                    i = i2;
                }
            }
            dr.m18464h();
            th = null;
        } catch (Throwable th4) {
            th = th4;
        }
        ThreadUtil.m19099a(false, new dy(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
