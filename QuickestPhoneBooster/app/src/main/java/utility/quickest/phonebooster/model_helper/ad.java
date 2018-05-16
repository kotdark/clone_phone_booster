package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import utility.quickest.phonebooster.app.MyApplicationLike;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: AdvertisementModel */
class ad implements Runnable {
    final /* synthetic */ List f13907a;
    final /* synthetic */ CountDownLatch f13908b;
    final /* synthetic */ ac f13909c;

    ad(ac acVar, List list, CountDownLatch countDownLatch) {
        this.f13909c = acVar;
        this.f13907a = list;
        this.f13908b = countDownLatch;
    }

    public void run() {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Runnable[] runnableArr = new Runnable[]{null};
            new AdLoader.Builder(MyApplicationLike.getApplication(), this.f13909c.f13906b.adId)
                    .forAppInstallAd(new GANativeAppInstallListener(this, elapsedRealtime, runnableArr))
                    .forContentAd(new GANativeContentListener(this, elapsedRealtime, runnableArr))
                    .withAdListener(new GANativeAdListener(this, elapsedRealtime, runnableArr))
                    .withNativeAdOptions(new NativeAdOptions.Builder()
                            .setReturnUrlsForImageAssets(true)
                            .setImageOrientation(2)
                            .setRequestMultipleImages(false)
                            .setAdChoicesPlacement(1)
                            .setVideoOptions(new VideoOptions.Builder()
                                    .setStartMuted(true)
                                    .build())
                            .build())
                    .build()
                    .loadAd(new AdRequest.Builder().build());
        } catch (Throwable th) {
            this.f13908b.countDown();
        }
    }
}
