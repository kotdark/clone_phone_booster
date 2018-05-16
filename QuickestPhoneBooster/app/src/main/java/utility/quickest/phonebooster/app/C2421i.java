package utility.quickest.phonebooster.app;

import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: MyApplicationLike */
class C2421i implements Runnable {
    final /* synthetic */ MyApplicationLike f12990a;

    C2421i(MyApplicationLike c2416d) {
        this.f12990a = c2416d;
    }

    public void run() {
        this.f12990a.m17427l();
        ThreadUtil.m19098a(this.f12990a.f12984j, 86400000);
    }
}
