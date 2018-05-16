package utility.quickest.phonebooster.model_helper;

import com.google.android.gms.ads.formats.NativeAppInstallAd;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class GANativeAppInstallListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener {
    final /* synthetic */ long f13921a;
    final /* synthetic */ Runnable[] f13922b;
    final /* synthetic */ ad f13923c;

    GANativeAppInstallListener(ad adVar, long j, Runnable[] runnableArr) {
        this.f13923c = adVar;
        this.f13921a = j;
        this.f13922b = runnableArr;
    }

    @Override
    public void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
        ThreadUtil.m19099a(false, new ak(this, nativeAppInstallAd));
    }

}
