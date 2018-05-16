package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisementModel */
class bv implements Runnable {
    final /* synthetic */ LinkedBlockingQueue f14008a;
    final /* synthetic */ bs f14009b;

    bv(bs bsVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f14009b = bsVar;
        this.f14008a = linkedBlockingQueue;
    }

    public void run() {
        long j = 0;
        long j2 = (this.f14009b.c / ((long) this.f14009b.d)) - 1;
        if (j2 >= 0) {
            if (j2 > 2) {
                j = 2;
            } else {
                j = j2;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.f14009b.d);
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f14009b.d; i++) {
            ThreadUtil.m19098a(new bw(this, countDownLatch, arrayList), (((long) i) * j) * 1000);
        }
        ThreadUtil.m19097a("MoPubNative", new ca(this, countDownLatch, arrayList));
    }
}
