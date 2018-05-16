package utility.quickest.phonebooster.model_helper;

import com.google.android.gms.ads.formats.NativeContentAd;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class GANativeContentListener implements NativeContentAd.OnContentAdLoadedListener {
    final /* synthetic */ long f13916a;
    final /* synthetic */ Runnable[] f13917b;
    final /* synthetic */ ad f13918c;

    GANativeContentListener(ad adVar, long j, Runnable[] runnableArr) {
        this.f13918c = adVar;
        this.f13916a = j;
        this.f13917b = runnableArr;
    }

    @Override
    public void onContentAdLoaded(NativeContentAd nativeContentAd) {
        ThreadUtil.m19099a(false, new ai(this, nativeContentAd));
    }

}
