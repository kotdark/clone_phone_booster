package utility.quickest.phonebooster.model_helper;

/* compiled from: AdvertisementModel */
class C2517x implements Runnable {
    final /* synthetic */ GAInterstitialAdListener f14512a;

    C2517x(GAInterstitialAdListener c2514u) {
        this.f14512a = c2514u;
    }

    public void run() {
        if (this.f14512a.runnables != null && this.f14512a.runnables.length > 0 && this.f14512a.runnables[0] != null) {
            this.f14512a.runnables[0].run();
        }
    }
}
