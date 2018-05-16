package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisementModel */
class az implements Runnable {
    final /* synthetic */ LinkedBlockingQueue f13953a;
    final /* synthetic */ ax f13954b;

    az(ax axVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f13954b = axVar;
        this.f13953a = linkedBlockingQueue;
    }

    public void run() {
        long j = 0;
        long j2 = (this.f13954b.c / ((long) this.f13954b.f13890d)) - 1;
        if (j2 >= 0) {
            if (j2 > 2) {
                j = 2;
            } else {
                j = j2;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.f13954b.f13890d);
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f13954b.f13890d; i++) {
            ThreadUtil.m19098a(new ba(this, countDownLatch, arrayList), (((long) i) * j) * 1000);
        }
        ThreadUtil.m19097a("FbInterAd", new bf(this, countDownLatch, arrayList));
    }
}
