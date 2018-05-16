package utility.quickest.phonebooster.model_helper;

/* compiled from: AdvertisementModel */
class am implements Runnable {
    final /* synthetic */ boolean f13929a;
    final /* synthetic */ GANativeAdModel f13930b;

    am(GANativeAdModel GANativeAdModelVar, boolean z) {
        this.f13930b = GANativeAdModelVar;
        this.f13929a = z;
    }

    public void run() {
        this.f13930b.m18247a(this.f13929a);
    }
}
