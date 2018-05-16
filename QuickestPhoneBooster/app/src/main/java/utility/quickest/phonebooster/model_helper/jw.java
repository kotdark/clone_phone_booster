package utility.quickest.phonebooster.model_helper;

import java.util.List;

/* compiled from: WhiteListModel */
class jw implements Runnable {
    final /* synthetic */ List f14477a;
    final /* synthetic */ jv f14478b;

    jw(jv jvVar, List list) {
        this.f14478b = jvVar;
        this.f14477a = list;
    }

    public void run() {
        if (!this.f14478b.f14476a.m18809b()) {
            this.f14478b.f14476a.f14472d = true;
            if (this.f14477a != null) {
                this.f14478b.f14476a.f14471c.addAll(this.f14477a);
            }
            if (!this.f14478b.f14476a.f14470b.isEmpty()) {
                this.f14478b.f14476a.f14471c.addAll(this.f14478b.f14476a.f14470b);
                this.f14478b.f14476a.m18800f();
                this.f14478b.f14476a.f14470b.clear();
            }
            this.f14478b.f14476a.m18802g();
            this.f14478b.f14476a.m18803h();
        }
    }
}
