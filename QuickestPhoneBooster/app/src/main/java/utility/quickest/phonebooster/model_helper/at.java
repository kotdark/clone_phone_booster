package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;

/* compiled from: AdvertisementModel */
class at implements Runnable {
    final /* synthetic */ int f13942a;
    final /* synthetic */ as f13943b;

    at(as asVar, int i) {
        this.f13943b = asVar;
        this.f13942a = i;
    }

    public void run() {
        this.f13943b.f13941c.f13938c.f13935b.m18248a(false, SystemClock.elapsedRealtime() - this.f13943b.f13939a, String.valueOf(this.f13942a));
        this.f13943b.f13941c.f13936a.countDown();
    }
}
