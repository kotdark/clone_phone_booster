package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.facebook.ads.InterstitialAd;
import utility.quickest.phonebooster.app.MyApplicationLike;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: AdvertisementModel */
class ba implements Runnable {
    final /* synthetic */ CountDownLatch f13968a;
    final /* synthetic */ List f13969b;
    final /* synthetic */ az f13970c;

    ba(az azVar, CountDownLatch countDownLatch, List list) {
        this.f13970c = azVar;
        this.f13968a = countDownLatch;
        this.f13969b = list;
    }

    public void run() {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Runnable[] runnableArr = new Runnable[]{null};
            InterstitialAd interstitialAd = new InterstitialAd(MyApplicationLike.getApplication(), this.f13970c.f13954b.adId);
            interstitialAd.setAdListener(new FBInterstitialAdListener(this, elapsedRealtime, interstitialAd, runnableArr));
            interstitialAd.show();
        } catch (Throwable th) {
            this.f13968a.countDown();
        }
    }
}
