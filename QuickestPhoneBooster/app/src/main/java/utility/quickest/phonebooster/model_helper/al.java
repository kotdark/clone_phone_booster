package utility.quickest.phonebooster.model_helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
class al implements Runnable {
    final /* synthetic */ CountDownLatch f13926a;
    final /* synthetic */ List f13927b;
    final /* synthetic */ ac f13928c;

    al(ac acVar, CountDownLatch countDownLatch, List list) {
        this.f13928c = acVar;
        this.f13926a = countDownLatch;
        this.f13927b = list;
    }

    public void run() {
        try {
            if (this.f13926a.await(this.f13928c.f13906b.c, TimeUnit.SECONDS)) {
                this.f13928c.f13905a.offer(this.f13927b);
            } else {
                this.f13928c.f13905a.offer(new ArrayList());
            }
        } catch (InterruptedException e) {
            this.f13928c.f13905a.offer(new ArrayList());
        }
    }
}
