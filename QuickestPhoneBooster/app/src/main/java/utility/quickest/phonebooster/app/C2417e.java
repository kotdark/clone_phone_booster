package utility.quickest.phonebooster.app;

import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: MyApplicationLike */
class C2417e implements Runnable {
    final /* synthetic */ MyApplicationLike f12985a;

    C2417e(MyApplicationLike c2416d) {
        this.f12985a = c2416d;
    }

    public void run() {
        this.f12985a.m17425j();
        ThreadUtil.m19098a(this.f12985a.f12982h, 86400000);
    }
}
