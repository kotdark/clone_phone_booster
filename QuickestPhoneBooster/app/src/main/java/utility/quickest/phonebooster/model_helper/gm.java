package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2445c;
import java.util.Comparator;

/* compiled from: DeepJunkHelper */
class gm implements Comparator<C2445c> {
    final /* synthetic */ fw f14278a;

    gm(fw fwVar) {
        this.f14278a = fwVar;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m18601a((C2445c) obj, (C2445c) obj2);
    }

    public int m18601a(C2445c c2445c, C2445c c2445c2) {
        if (c2445c.m17626c() > c2445c2.m17626c()) {
            return -1;
        }
        if (c2445c.m17626c() < c2445c2.m17626c()) {
            return 1;
        }
        return 0;
    }
}
