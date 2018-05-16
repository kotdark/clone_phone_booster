package utility.quickest.phonebooster.app;

import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: MyApplicationLike */
class C2420h implements Runnable {
    final /* synthetic */ MyApplicationLike f12989a;

    C2420h(MyApplicationLike c2416d) {
        this.f12989a = c2416d;
    }

    public void run() {
        this.f12989a.m17426k();
        ThreadUtil.m19098a(this.f12989a.f12983i, 86400000);
    }
}
