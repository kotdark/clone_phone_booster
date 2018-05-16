package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;
import com.mopub.nativeads.MoPubNative.MoPubNativeNetworkListener;
import com.mopub.nativeads.NativeAd;
import com.mopub.nativeads.NativeErrorCode;

/* compiled from: AdvertisementModel */
class bx implements MoPubNativeNetworkListener {
    final /* synthetic */ long f14013a;
    final /* synthetic */ bw f14014b;

    bx(bw bwVar, long j) {
        this.f14014b = bwVar;
        this.f14013a = j;
    }

    public void onNativeLoad(NativeAd nativeAd) {
        ThreadUtil.m19099a(false, new by(this, nativeAd));
    }

    public void onNativeFail(NativeErrorCode nativeErrorCode) {
        ThreadUtil.m19099a(false, new bz(this, nativeErrorCode));
    }
}
