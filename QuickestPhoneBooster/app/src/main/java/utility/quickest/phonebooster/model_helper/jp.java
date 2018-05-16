package utility.quickest.phonebooster.model_helper;

import java.util.List;

/* compiled from: VirusWhiteListModel */
class jp implements Runnable {
    final /* synthetic */ List f14464a;
    final /* synthetic */ jo f14465b;

    jp(jo joVar, List list) {
        this.f14465b = joVar;
        this.f14464a = list;
    }

    public void run() {
        if (!this.f14465b.f14463a.m18781b()) {
            this.f14465b.f14463a.f14459d = true;
            if (this.f14464a != null) {
                this.f14465b.f14463a.f14458c.addAll(this.f14464a);
            }
            if (!this.f14465b.f14463a.f14457b.isEmpty()) {
                this.f14465b.f14463a.f14458c.addAll(this.f14465b.f14463a.f14457b);
                this.f14465b.f14463a.m18773e();
                this.f14465b.f14463a.f14457b.clear();
            }
            this.f14465b.f14463a.m18775f();
            this.f14465b.f14463a.m18777g();
        }
    }
}
