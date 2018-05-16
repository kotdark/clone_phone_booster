package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2445c;
import utility.quickest.phonebooster.p114d.C2450h;
import utility.quickest.phonebooster.p114d.C2451i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: DeepJunkHelper */
class gu implements Runnable {
    final /* synthetic */ File f14290a;
    final /* synthetic */ long f14291b;
    final /* synthetic */ String f14292c;
    final /* synthetic */ String f14293d;
    final /* synthetic */ fw f14294e;

    gu(fw fwVar, File file, long j, String str, String str2) {
        this.f14294e = fwVar;
        this.f14290a = file;
        this.f14291b = j;
        this.f14292c = str;
        this.f14293d = str2;
    }

    public void run() {
        C2451i a;
        Collection arrayList;
        Object a2;
        if (this.f14294e.f14240e.equals(gy.InstalledApp)) {
            a = C2451i.m17674a(this.f14290a, this.f14291b);
            if (a != null) {
                C2445c c2445c = (C2445c) this.f14294e.f14242g.get(this.f14292c);
                if (c2445c == null) {
                    arrayList = new ArrayList();
                    arrayList.add(a);
                    a2 = C2445c.m17621a(this.f14292c, arrayList);
                } else {
                    a2 = c2445c.m17622a(a);
                }
                if (a2 != null) {
                    this.f14294e.f14242g.put(this.f14292c, a2);
                }
            }
        } else if (this.f14294e.f14240e.equals(gy.DeletedApp)) {
            a = C2451i.m17674a(this.f14290a, this.f14291b);
            if (a != null) {
                C2450h c2450h = (C2450h) this.f14294e.f14243h.get(this.f14292c);
                if (c2450h == null) {
                    arrayList = new ArrayList();
                    arrayList.add(a);
                    a2 = C2450h.m17667a(this.f14292c, this.f14293d, arrayList);
                } else {
                    a2 = c2450h.m17668a(a);
                }
                if (a2 != null) {
                    this.f14294e.f14243h.put(this.f14292c, a2);
                }
            }
        }
    }
}
