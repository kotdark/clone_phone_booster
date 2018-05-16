package utility.quickest.phonebooster.model_helper;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import utility.quickest.phonebooster.p114d.C2453k;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.Set;

/* compiled from: AppRunningHelper */
class ej implements Runnable {
    final /* synthetic */ boolean f14146a;
    final /* synthetic */ eh f14147b;

    ej(eh ehVar, boolean z) {
        this.f14147b = ehVar;
        this.f14146a = z;
    }

    public void run() {
        Throwable th;
        try {
            long[] jArr = new long[]{0};
            Set keySet = C2535e.m19030a(this.f14146a).keySet();
            for (RunningAppProcessInfo runningAppProcessInfo : C2535e.m19050o()) {
                if (runningAppProcessInfo.pkgList != null) {
                    for (String str : runningAppProcessInfo.pkgList) {
                        String str2;
                        if (str2 != null) {
                            str2 = str2.trim();
                        }
                        if (!(TextUtils.isEmpty(str2) || str2.equals("utility.quickest.phonebooster") || !keySet.contains(str2))) {
                            C2453k a = C2453k.m17689a(runningAppProcessInfo.pid, runningAppProcessInfo.processName, C2535e.m19028a(runningAppProcessInfo.pid));
                            if (a != null) {
                                ThreadUtil.m19099a(false, new ek(this, str2, a));
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (elapsedRealtime - jArr[0] >= 100) {
                                    jArr[0] = elapsedRealtime;
                                    ThreadUtil.m19099a(false, new el(this, str2));
                                }
                            }
                        }
                    }
                }
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ThreadUtil.m19099a(false, new em(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
