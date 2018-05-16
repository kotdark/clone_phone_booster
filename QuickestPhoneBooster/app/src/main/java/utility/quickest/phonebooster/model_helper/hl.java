package utility.quickest.phonebooster.model_helper;

import java.util.Map;

/* compiled from: MiscHelper */
class hl implements Runnable {
    final /* synthetic */ Map f14331a;
    final /* synthetic */ Map f14332b;
    final /* synthetic */ hk f14333c;

    hl(hk hkVar, Map map, Map map2) {
        this.f14333c = hkVar;
        this.f14331a = map;
        this.f14332b = map2;
    }

    public void run() {
        if (hh.f14324e == null) {
            hh.f14324e = this.f14331a;
        }
        if (hh.f14325f == null) {
            hh.f14325f = this.f14332b;
        }
    }
}
