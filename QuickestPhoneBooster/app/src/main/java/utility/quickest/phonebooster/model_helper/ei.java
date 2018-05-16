package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2446d;
import java.util.Comparator;

/* compiled from: AppRunningHelper */
class ei implements Comparator<C2446d> {
    final /* synthetic */ eh f14145a;

    ei(eh ehVar) {
        this.f14145a = ehVar;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m18482a((C2446d) obj, (C2446d) obj2);
    }

    public int m18482a(C2446d c2446d, C2446d c2446d2) {
        if (c2446d.m17630b() > c2446d2.m17630b()) {
            return -1;
        }
        if (c2446d.m17630b() < c2446d2.m17630b()) {
            return 1;
        }
        return 0;
    }
}
