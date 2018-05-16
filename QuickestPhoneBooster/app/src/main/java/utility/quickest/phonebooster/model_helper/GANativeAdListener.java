package utility.quickest.phonebooster.model_helper;

import com.google.android.gms.ads.AdListener;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class GANativeAdListener extends AdListener {
    final /* synthetic */ long f13910a;
    final /* synthetic */ Runnable[] f13911b;
    final /* synthetic */ ad f13912c;

    GANativeAdListener(ad adVar, long j, Runnable[] runnableArr) {
        this.f13912c = adVar;
        this.f13910a = j;
        this.f13911b = runnableArr;
    }

    @Override
    public void onAdFailedToLoad(int i) {
        ThreadUtil.m19099a(false, new af(this, i));
    }

    @Override
    public void onAdClosed() {
        ThreadUtil.m19099a(false, new ag(this));
    }

}
