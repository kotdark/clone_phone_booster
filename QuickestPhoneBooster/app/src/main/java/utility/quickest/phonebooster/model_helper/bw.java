package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import utility.quickest.phonebooster.app.MyApplicationLike;
import com.mopub.nativeads.MoPubNative;
import com.mopub.nativeads.MoPubStaticNativeAdRenderer;
import com.mopub.nativeads.RequestParameters.Builder;
import com.mopub.nativeads.RequestParameters.NativeAdAsset;
import com.mopub.nativeads.ViewBinder;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: AdvertisementModel */
class bw implements Runnable {
    final /* synthetic */ CountDownLatch f14010a;
    final /* synthetic */ List f14011b;
    final /* synthetic */ bv f14012c;

    bw(bv bvVar, CountDownLatch countDownLatch, List list) {
        this.f14012c = bvVar;
        this.f14010a = countDownLatch;
        this.f14011b = list;
    }

    public void run() {
        ViewBinder viewBinder = null;
        C2492b a = C2492b.m18285a();
        if (a.f13965i != null) {
            try {
                viewBinder = a.f13965i.mo3078a(this.f14012c.f14009b.a);
            } catch (Throwable th) {
            }
        }
        if (viewBinder == null) {
            this.f14010a.countDown();
            return;
        }
        try {
            MoPubNative moPubNative = new MoPubNative(MyApplicationLike.getApplication(), this.f14012c.f14009b.j, new bx(this, SystemClock.elapsedRealtime()));
            moPubNative.registerAdRenderer(new MoPubStaticNativeAdRenderer(viewBinder));
            moPubNative.makeRequest(new Builder().desiredAssets(EnumSet.of(NativeAdAsset.TITLE, NativeAdAsset.TEXT, NativeAdAsset.ICON_IMAGE, NativeAdAsset.MAIN_IMAGE, NativeAdAsset.CALL_TO_ACTION_TEXT)).build());
        } catch (Throwable th2) {
            this.f14010a.countDown();
        }
    }
}
