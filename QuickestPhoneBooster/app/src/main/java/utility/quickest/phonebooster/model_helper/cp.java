package utility.quickest.phonebooster.model_helper;

/* compiled from: AdvertisementModel */
class cp implements Runnable {
    final /* synthetic */ boolean f14048a;
    final /* synthetic */ long f14049b;
    final /* synthetic */ String f14050c;
    final /* synthetic */ co f14051d;

    cp(co coVar, boolean z, long j, String str) {
        this.f14051d = coVar;
        this.f14048a = z;
        this.f14049b = j;
        this.f14050c = str;
    }

    public void run() {
        this.f14051d.f14047c.m18248a(this.f14048a, this.f14049b, this.f14050c);
    }
}
