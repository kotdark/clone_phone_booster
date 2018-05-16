package utility.quickest.phonebooster.model_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
class ca implements Runnable {
    final /* synthetic */ CountDownLatch f14020a;
    final /* synthetic */ List f14021b;
    final /* synthetic */ bv f14022c;

    ca(bv bvVar, CountDownLatch countDownLatch, List list) {
        this.f14022c = bvVar;
        this.f14020a = countDownLatch;
        this.f14021b = list;
    }

    public void run() {
        try {
            if (this.f14020a.await(this.f14022c.f14009b.c, TimeUnit.SECONDS)) {
                this.f14022c.f14008a.offer(this.f14021b);
            } else {
                this.f14022c.f14008a.offer(new ArrayList());
            }
        } catch (InterruptedException e) {
            this.f14022c.f14008a.offer(new ArrayList());
        }
    }
}
