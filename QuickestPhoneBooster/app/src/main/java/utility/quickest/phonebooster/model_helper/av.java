package utility.quickest.phonebooster.model_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
class av implements Runnable {
    final /* synthetic */ CountDownLatch f13945a;
    final /* synthetic */ List f13946b;
    final /* synthetic */ aq f13947c;

    av(aq aqVar, CountDownLatch countDownLatch, List list) {
        this.f13947c = aqVar;
        this.f13945a = countDownLatch;
        this.f13946b = list;
    }

    public void run() {
        try {
            if (this.f13945a.await(this.f13947c.f13935b.c, TimeUnit.SECONDS)) {
                this.f13947c.f13934a.offer(this.f13946b);
            } else {
                this.f13947c.f13934a.offer(new ArrayList());
            }
        } catch (InterruptedException e) {
            this.f13947c.f13934a.offer(new ArrayList());
        }
    }
}
