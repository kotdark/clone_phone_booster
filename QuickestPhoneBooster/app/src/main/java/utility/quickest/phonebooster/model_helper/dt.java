package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: ApkFileScanningModel */
class dt implements Runnable {
    final /* synthetic */ ec f14118a;
    final /* synthetic */ dr f14119b;

    dt(dr drVar, ec ecVar) {
        this.f14119b = drVar;
        this.f14118a = ecVar;
    }

    public void run() {
        Throwable th = null;
        try {
            Collection c = dr.m18463g();
        } catch (Throwable th2) {
            th = th2;
            Object obj = null;
        }
        List arrayList = new ArrayList();
        if (c != null) {
            arrayList.addAll(c);
        }
        Collections.sort(arrayList, new du(this));
        ThreadUtil.m19099a(false, new dv(this, arrayList));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
