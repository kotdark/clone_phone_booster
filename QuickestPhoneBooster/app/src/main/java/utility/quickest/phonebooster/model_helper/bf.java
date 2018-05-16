package utility.quickest.phonebooster.model_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
class bf implements Runnable {
    final /* synthetic */ CountDownLatch f13979a;
    final /* synthetic */ List f13980b;
    final /* synthetic */ az f13981c;

    bf(az azVar, CountDownLatch countDownLatch, List list) {
        this.f13981c = azVar;
        this.f13979a = countDownLatch;
        this.f13980b = list;
    }

    public void run() {
        try {
            if (this.f13979a.await(this.f13981c.f13954b.c, TimeUnit.SECONDS)) {
                this.f13981c.f13953a.offer(this.f13980b);
            } else {
                this.f13981c.f13953a.offer(new ArrayList());
            }
        } catch (InterruptedException e) {
            this.f13981c.f13953a.offer(new ArrayList());
        }
    }
}
