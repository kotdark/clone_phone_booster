package utility.quickest.phonebooster.model_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
class C2518y implements Runnable {
    final /* synthetic */ CountDownLatch f14513a;
    final /* synthetic */ List f14514b;
    final /* synthetic */ C2512s f14515c;

    C2518y(C2512s c2512s, CountDownLatch countDownLatch, List list) {
        this.f14515c = c2512s;
        this.f14513a = countDownLatch;
        this.f14514b = list;
    }

    public void run() {
        try {
            if (this.f14513a.await(this.f14515c.f14501b.c, TimeUnit.SECONDS)) {
                this.f14515c.f14500a.offer(this.f14514b);
            } else {
                this.f14515c.f14500a.offer(new ArrayList());
            }
        } catch (InterruptedException e) {
            this.f14515c.f14500a.offer(new ArrayList());
        }
    }
}
