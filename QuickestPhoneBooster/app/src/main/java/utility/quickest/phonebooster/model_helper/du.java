package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2444b;
import java.util.Comparator;

/* compiled from: ApkFileScanningModel */
class du implements Comparator<C2444b> {
    final /* synthetic */ dt f14120a;

    du(dt dtVar) {
        this.f14120a = dtVar;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m18468a((C2444b) obj, (C2444b) obj2);
    }

    public int m18468a(C2444b c2444b, C2444b c2444b2) {
        if (c2444b.m17615b() > c2444b2.m17615b()) {
            return -1;
        }
        if (c2444b.m17615b() < c2444b2.m17615b()) {
            return 1;
        }
        return 0;
    }
}
