package utility.quickest.phonebooster.model_helper;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class GAInterstitialAdListener extends AdListener {
    final /* synthetic */ long f14505a;
    final /* synthetic */ InterstitialAd interstitialAd;
    final /* synthetic */ Runnable[] runnables;
    final /* synthetic */ C2513t f14508d;

    GAInterstitialAdListener(C2513t c2513t, long j, InterstitialAd interstitialAd, Runnable[] runnableArr) {
        this.f14508d = c2513t;
        this.f14505a = j;
        this.interstitialAd = interstitialAd;
        this.runnables = runnableArr;
    }

    @Override
    public void onAdFailedToLoad(int i) {
        ThreadUtil.m19099a(false, new C2515v(this, i));
    }

    @Override
    public void onAdLeftApplication() {
        ThreadUtil.m19099a(false, new C2516w(this));
    }

    @Override
    public void onAdLoaded() {
        ThreadUtil.m19099a(false, new C2517x(this));
    }
}
