package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisementModel */
class aq implements Runnable {
    final /* synthetic */ LinkedBlockingQueue f13934a;
    final /* synthetic */ an f13935b;

    aq(an anVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f13935b = anVar;
        this.f13934a = linkedBlockingQueue;
    }

    public void run() {
        long j = 0;
        long j2 = (this.f13935b.c / ((long) this.f13935b.d)) - 1;
        if (j2 >= 0) {
            if (j2 > 2) {
                j = 2;
            } else {
                j = j2;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.f13935b.d);
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f13935b.d; i++) {
            ThreadUtil.m19098a(new ar(this, countDownLatch, arrayList), (((long) i) * j) * 1000);
        }
        ThreadUtil.m19097a("AdmobNativeExpress", new av(this, countDownLatch, arrayList));
    }
}
