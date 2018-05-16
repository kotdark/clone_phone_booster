package utility.quickest.phonebooster.model_helper;

import android.os.Handler;
import android.os.Looper;
import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.response_data.VirusInfoServiceExpression;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AntivirusHelper */
public final class dh {
    private static boolean f14090a = false;
    private static final Handler f14091b = new Handler(Looper.getMainLooper());
    private static final Runnable f14092c = new di();
    private dq f14093d = dq.ReadyToScan;
    private dp f14094e = null;
    private final List< AppVirusInfo> f14095f = new ArrayList();

    public static void m18433a() {
        ThreadUtil.m19102b();
        f14091b.removeCallbacks(f14092c);
        f14092c.run();
    }

    public void m18444a(dp dpVar) {
        ThreadUtil.m19102b();
        this.f14094e = dpVar;
    }

    public List< AppVirusInfo> m18446b() {
        ThreadUtil.m19102b();
        return new ArrayList(this.f14095f);
    }

    public boolean m18445a(long j, long j2) {
        ThreadUtil.m19102b();
        if (this.f14093d.equals(dq.Scanning)) {
            return true;
        }
        if (!this.f14093d.equals(dq.ReadyToScan) && !this.f14093d.equals(dq.ReadyToScanAndKill)) {
            return false;
        }
        m18439b(j, j2);
        return true;
    }

    private static void m18443f() {
        ThreadUtil.m19102b();
        if (!f14090a) {
            f14090a = true;
            ThreadUtil.m19103c(new dj(C2490a.m18243a().m18244b()));
        }
    }

    private void m18439b(long j, long j2) {
        ThreadUtil.m19102b();
        this.f14095f.clear();
        m18435a(dq.Scanning);
        Map a = C2535e.m19030a(false);
        Set keySet = a.keySet();
        if (keySet.isEmpty()) {
            m18435a(dq.ReadyToScanAndKill);
            return;
        }
        if (j2 < 0) {
            j2 = 0;
        }
        if (j < 0) {
            j = 0;
        }
        ThreadUtil.m19105d(new dl(this, keySet, a, Math.max(j, j2 / ((long) keySet.size()))));
    }

    private void m18435a(dq dqVar) {
        ThreadUtil.m19102b();
        if (dqVar != null && !this.f14093d.equals(dqVar)) {
            this.f14093d = dqVar;
            if (this.f14094e != null) {
                this.f14094e.mo3088a(this.f14093d);
            }
        }
    }

    private static List<VirusInfoServiceExpression> m18437b(C2443a c2443a) {
        try {
             SharedPrefHelper.m17454a().m17552v(System.currentTimeMillis());
            return (List) C2522c.m18847a().m18845b(C2542m.m19076a(c2443a.m17612b())).mo1131a().m2659b();
        } catch (IOException e) {
            return null;
        }
    }
}
