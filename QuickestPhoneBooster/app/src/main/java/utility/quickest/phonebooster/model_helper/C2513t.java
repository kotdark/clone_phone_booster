package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import utility.quickest.phonebooster.app.MyApplicationLike;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: AdvertisementModel */
class C2513t implements Runnable {
    final /* synthetic */ CountDownLatch f14502a;
    final /* synthetic */ List f14503b;
    final /* synthetic */ C2512s f14504c;

    C2513t(C2512s c2512s, CountDownLatch countDownLatch, List list) {
        this.f14504c = c2512s;
        this.f14502a = countDownLatch;
        this.f14503b = list;
    }

    public void run() {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Runnable[] runnableArr = new Runnable[]{null};
            InterstitialAd interstitialAd = new InterstitialAd(MyApplicationLike.getApplication());
            interstitialAd.setAdUnitId(this.f14504c.f14501b.adId);
            interstitialAd.setAdListener(new GAInterstitialAdListener(this, elapsedRealtime, interstitialAd, runnableArr));
            interstitialAd.loadAd(new AdRequest.Builder().build());
        } catch (Throwable th) {
            this.f14502a.countDown();
        }
    }
}
