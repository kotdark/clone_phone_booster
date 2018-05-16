package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisementModel */
class ac implements Runnable {
    final /* synthetic */ LinkedBlockingQueue f13905a;
    final /* synthetic */ GANativeAdModel f13906b;

    ac(GANativeAdModel GANativeAdModelVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.f13906b = GANativeAdModelVar;
        this.f13905a = linkedBlockingQueue;
    }

    public void run() {
        long j = 0;
        long j2 = (this.f13906b.c / ((long) this.f13906b.f13890d)) - 1;
        if (j2 >= 0) {
            if (j2 > 2) {
                j = 2;
            } else {
                j = j2;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.f13906b.f13890d);
        List arrayList = new ArrayList();
        for (int i = 0; i < this.f13906b.f13890d; i++) {
            ThreadUtil.m19098a(new ad(this, arrayList, countDownLatch), (((long) i) * j) * 1000);
        }
        ThreadUtil.m19097a("AdmobAd", new al(this, countDownLatch, arrayList));
    }
}
