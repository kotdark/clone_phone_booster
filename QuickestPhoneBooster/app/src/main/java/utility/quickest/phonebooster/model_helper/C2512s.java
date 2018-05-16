package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisementModel */
class C2512s implements Runnable {
    final /* synthetic */ LinkedBlockingQueue f14500a;
    final /* synthetic */ C2510q f14501b;

    C2512s(C2510q c2510q, LinkedBlockingQueue linkedBlockingQueue) {
        this.f14501b = c2510q;
        this.f14500a = linkedBlockingQueue;
    }

    public void run() {
        long j = 0;
        long j2 = (this.f14501b.c / ((long) this.f14501b.f13890d)) - 1;
        if (j2 >= 0) {
            if (j2 > 2) {
                j = 2;
            } else {
                j = j2;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.f14501b.f13890d);
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f14501b.f13890d; i++) {
            ThreadUtil.m19098a(new C2513t(this, countDownLatch, arrayList), (((long) i) * j) * 1000);
        }
        ThreadUtil.m19097a("AdmobInterAd", new C2518y(this, countDownLatch, arrayList));
    }
}
