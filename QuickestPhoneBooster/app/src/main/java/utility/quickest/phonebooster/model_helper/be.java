package utility.quickest.phonebooster.model_helper;

/* compiled from: AdvertisementModel */
class be implements Runnable {
    final /* synthetic */ FBInterstitialAdListener f13978a;

    be(FBInterstitialAdListener FBInterstitialAdListenerVar) {
        this.f13978a = FBInterstitialAdListenerVar;
    }

    public void run() {
        if (this.f13978a.f13973c != null && this.f13978a.f13973c.length > 0 && this.f13978a.f13973c[0] != null) {
            this.f13978a.f13973c[0].run();
        }
    }
}
