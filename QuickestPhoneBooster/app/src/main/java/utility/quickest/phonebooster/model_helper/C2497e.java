package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class C2497e implements Runnable {
    final /* synthetic */ db f14134a;
    final /* synthetic */ C2492b f14135b;

    C2497e(C2492b c2492b, db dbVar) {
        this.f14135b = c2492b;
        this.f14134a = dbVar;
    }

    public void run() {
        ThreadUtil.m19097a("MainFetchAdTask", new C2499f(this, C2490a.m18243a().m18244b(), this.f14135b.m18307c()));
    }
}
