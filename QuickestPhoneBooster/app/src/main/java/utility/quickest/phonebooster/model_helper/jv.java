package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;

/* compiled from: WhiteListModel */
class jv implements Runnable {
    final /* synthetic */ jt f14476a;

    jv(jt jtVar) {
        this.f14476a = jtVar;
    }

    public void run() {
        List d;
        Throwable th = null;
        try {
            d = jt.m18804i();
        } catch (Throwable th2) {
            th = th2;
            Object obj = null;
        }
        ThreadUtil.m19099a(false, new jw(this, d));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
