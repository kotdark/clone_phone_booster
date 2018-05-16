package utility.quickest.phonebooster.model_helper;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class FBInterstitialAdListener implements InterstitialAdListener {
    final /* synthetic */ long f13971a;
    final /* synthetic */ InterstitialAd f13972b;
    final /* synthetic */ Runnable[] f13973c;
    final /* synthetic */ ba f13974d;

    FBInterstitialAdListener(ba baVar, long j, InterstitialAd interstitialAd, Runnable[] runnableArr) {
        this.f13974d = baVar;
        this.f13971a = j;
        this.f13972b = interstitialAd;
        this.f13973c = runnableArr;
    }

    public void onInterstitialDisplayed(Ad ad) {
    }

    public void onInterstitialDismissed(Ad ad) {
    }

    @Override
    public void onError(Ad ad, AdError adError) {
        ThreadUtil.m19099a(false, new bc(this, adError));
    }

    public void onAdLoaded(Ad ad) {
        ThreadUtil.m19099a(false, new bd(this));
    }

    public void onAdClicked(Ad ad) {
        ThreadUtil.m19099a(false, new be(this));
    }

    public void onLoggingImpression(Ad ad) {
    }
}
