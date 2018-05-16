package utility.quickest.phonebooster.model_helper;

/* compiled from: AdvertisementModel */
class ag implements Runnable {
    final /* synthetic */ GANativeAdListener f13915a;

    ag(GANativeAdListener GANativeAdListenerVar) {
        this.f13915a = GANativeAdListenerVar;
    }

    public void run() {
        if (this.f13915a.f13911b != null && this.f13915a.f13911b.length > 0 && this.f13915a.f13911b[0] != null) {
            this.f13915a.f13911b[0].run();
        }
    }
}
