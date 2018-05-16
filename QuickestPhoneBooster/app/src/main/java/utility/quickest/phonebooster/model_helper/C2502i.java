package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;

/* compiled from: AdvertisementModel */
class C2502i implements Runnable {
    final /* synthetic */ C2509p f14380a;
    final /* synthetic */ C2501h f14381b;

    C2502i(C2501h c2501h, C2509p c2509p) {
        this.f14381b = c2501h;
        this.f14380a = c2509p;
    }

    public void run() {
        this.f14381b.f14310a.f13958b = true;
        if (this.f14380a != null) {
            if (this.f14380a.f14491b == null) {
                this.f14380a.f14491b = "";
            } else {
                this.f14380a.f14491b = this.f14380a.f14491b.trim();
                if ("utility.quickest.phonebooster".equals(this.f14380a.f14491b)) {
                    this.f14380a.f14491b = "";
                }
            }
            if (!TextUtils.isEmpty(this.f14380a.f14491b)) {
                C2492b.m18304b(this.f14380a.f14491b, this.f14380a.f14492c, this.f14380a.f14493d, this.f14380a.f14494e, this.f14380a.f14495f, this.f14380a.f14496g);
            }
            this.f14381b.f14310a.f13961e = this.f14380a.f14491b;
            this.f14381b.f14310a.f13960d = this.f14380a.f14490a;
        }
        this.f14381b.f14310a.m18317f();
        this.f14381b.f14310a.m18314e();
    }
}
