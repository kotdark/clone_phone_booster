package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;

/* compiled from: VirusWhiteListModel */
class jo implements Runnable {
    final /* synthetic */ jm f14463a;

    jo(jm jmVar) {
        this.f14463a = jmVar;
    }

    public void run() {
        List c;
        Throwable th = null;
        try {
            c = jm.m18778h();
        } catch (Throwable th2) {
            th = th2;
            Object obj = null;
        }
        ThreadUtil.m19099a(false, new jp(this, c));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
