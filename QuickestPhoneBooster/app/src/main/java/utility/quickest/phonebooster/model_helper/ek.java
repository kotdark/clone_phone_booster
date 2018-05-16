package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.p114d.C2453k;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: AppRunningHelper */
class ek implements Runnable {
    final /* synthetic */ String f14148a;
    final /* synthetic */ C2453k f14149b;
    final /* synthetic */ ej f14150c;

    ek(ej ejVar, String str, C2453k c2453k) {
        this.f14150c = ejVar;
        this.f14148a = str;
        this.f14149b = c2453k;
    }

    public void run() {
        C2446d c2446d = (C2446d) this.f14150c.f14147b.f14144c.get(this.f14148a);
        if (c2446d == null) {
            Collection arrayList = new ArrayList();
            arrayList.add(this.f14149b);
            c2446d = C2446d.m17627a(this.f14148a, arrayList);
        } else {
            c2446d = c2446d.m17628a(this.f14149b);
        }
        if (c2446d != null) {
            this.f14150c.f14147b.f14144c.put(c2446d.m17629a(), c2446d);
        }
    }
}
