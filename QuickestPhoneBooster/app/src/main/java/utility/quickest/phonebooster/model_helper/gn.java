package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2450h;
import java.util.Comparator;

/* compiled from: DeepJunkHelper */
class gn implements Comparator<C2450h> {
    final /* synthetic */ fw f14279a;

    gn(fw fwVar) {
        this.f14279a = fwVar;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m18602a((C2450h) obj, (C2450h) obj2);
    }

    public int m18602a(C2450h c2450h, C2450h c2450h2) {
        if (c2450h.m17673d() > c2450h2.m17673d()) {
            return -1;
        }
        if (c2450h.m17673d() < c2450h2.m17673d()) {
            return 1;
        }
        return 0;
    }
}
