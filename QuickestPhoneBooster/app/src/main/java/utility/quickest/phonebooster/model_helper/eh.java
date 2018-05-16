package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2446d;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AppRunningHelper */
public final class eh {
    private er f14142a = null;
    private es f14143b = es.ReadyToScan;
    private final Map<String, C2446d> f14144c = new HashMap();

    public void m18476a(er erVar) {
        ThreadUtil.m19102b();
        this.f14142a = erVar;
    }

    public es m18475a() {
        ThreadUtil.m19102b();
        return this.f14143b;
    }

    public long m18479b() {
        ThreadUtil.m19102b();
        long j = 0;
        for (C2446d b : this.f14144c.values()) {
            j = b.m17630b() + j;
        }
        return j;
    }

    public List<C2446d> m18480c() {
        ThreadUtil.m19102b();
        List<C2446d> arrayList = new ArrayList(this.f14144c.values());
        Collections.sort(arrayList, new ei(this));
        return arrayList;
    }

    public boolean m18481d() {
        ThreadUtil.m19102b();
        if (this.f14143b.equals(es.Scanning)) {
            return true;
        }
        if (!this.f14143b.equals(es.ReadyToScan) && !this.f14143b.equals(es.ReadyToScanAndKill)) {
            return false;
        }
        m18474e();
        return true;
    }

    public boolean m18477a(List<C2446d> list) {
        int i = (list == null || list.size() < 40) ? 350 : 170;
        return m18478a((List) list, (long) i);
    }

    public boolean m18478a(List<C2446d> list, long j) {
        ThreadUtil.m19102b();
        if (!this.f14143b.equals(es.ReadyToScanAndKill)) {
            return false;
        }
        m18473b(list, j);
        return true;
    }

    private void m18474e() {
        ThreadUtil.m19102b();
        this.f14144c.clear();
        m18471a(es.Scanning);
        ThreadUtil.m19108e(new ej(this, hz.m18683a().m18693a(id.IncludeSysApp)));
    }

    private void m18473b(List<C2446d> list, long j) {
        ThreadUtil.m19102b();
        m18471a(es.Killing);
        List arrayList = new ArrayList();
        if (list != null) {
            for (C2446d c2446d : list) {
                C2446d c2446d2;
                if (c2446d2 != null) {
                    c2446d2 = (C2446d) this.f14144c.get(c2446d2.m17629a());
                    if (c2446d2 != null) {
                        arrayList.add(c2446d2);
                    }
                }
            }
        }
        if (j < 0) {
            j = 0;
        }
        ThreadUtil.m19108e(new en(this, arrayList, j));
    }

    private void m18471a(es esVar) {
        ThreadUtil.m19102b();
        if (esVar != null && !this.f14143b.equals(esVar)) {
            this.f14143b = esVar;
            if (this.f14142a != null) {
                this.f14142a.mo3094a(this.f14143b);
            }
        }
    }
}
