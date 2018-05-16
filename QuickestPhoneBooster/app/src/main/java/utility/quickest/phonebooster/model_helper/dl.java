package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import android.text.TextUtils;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.C2538h;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AntivirusHelper */
class dl implements Runnable {
    final /* synthetic */ Set f14098a;
    final /* synthetic */ Map f14099b;
    final /* synthetic */ long f14100c;
    final /* synthetic */ dh f14101d;

    dl(dh dhVar, Set set, Map map, long j) {
        this.f14101d = dhVar;
        this.f14098a = set;
        this.f14099b = map;
        this.f14100c = j;
    }

    public void run() {
        Throwable th;
        try {
            Map a =  AppVirusInfo.m17654a(C2429a.m17452a(), this.f14098a);
            int i = 0;
            for (String str : this.f14098a) {
                String trim;
                int i2 = i + 1;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (str != null) {
                    trim = str.trim();
                } else {
                    trim = str;
                }
                if (TextUtils.isEmpty(trim)) {
                    i = i2;
                } else if (trim.equals("utility.quickest.phonebooster")) {
                    i = i2;
                } else {
                     AppVirusInfo c2448f;
                    ThreadUtil.m19099a(false, new dm(this, i2, trim));
                    if (a.containsKey(trim)) {
                         AppVirusInfo c2448f2 = null;
                        for ( AppVirusInfo c2448f3 : (List) a.get(trim)) {
                            if (c2448f3.m17661c() != ((Integer) this.f14099b.get(trim)).intValue()) {
                                c2448f3 = c2448f2;
                            }
                            c2448f2 = c2448f3;
                        }
                        c2448f3 = c2448f2;
                    } else {
                        c2448f3 = null;
                    }
                    String a2 = C2538h.m19060a(trim);
                    if (!TextUtils.isEmpty(a2)) {
                        if (c2448f3 != null) {
                            c2448f3 =  AppVirusInfo.m17653a(c2448f3.m17659a(), c2448f3.m17660b() + "\n" + a2, c2448f3.m17661c());
                        } else {
                            c2448f3 =  AppVirusInfo.m17653a(trim, a2, ((Integer) this.f14099b.get(trim)).intValue());
                        }
                    }
                    if (c2448f3 != null) {
                        ThreadUtil.m19099a(false, new dn(this, c2448f3));
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (this.f14100c <= 0) {
                        try {
                            SystemClock.sleep(100);
                        } catch (Throwable th2) {
                        }
                    } else if (elapsedRealtime2 <= 0) {
                        try {
                            SystemClock.sleep(this.f14100c);
                        } catch (Throwable th3) {
                        }
                    } else if (elapsedRealtime2 < this.f14100c) {
                        try {
                            SystemClock.sleep(this.f14100c - elapsedRealtime2);
                        } catch (Throwable th4) {
                        }
                    }
                    i = i2;
                }
            }
            ThreadUtil.m19099a(false, new C2496do(this));
            th = null;
        } catch (Throwable th5) {
            th = th5;
        }
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
