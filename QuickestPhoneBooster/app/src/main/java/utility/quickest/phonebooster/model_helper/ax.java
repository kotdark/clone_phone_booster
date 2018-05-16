package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.InterstitialAd;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
final class ax extends AdvertisementModel {
    private final InterstitialAd interstitialAd;
    private final Runnable[] f13951m;

    private static void m18279g() {
    }

    private ax(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2) {
        this(dbVar, str, j, i, j2, j3, f, f2, j4, str2, null, null, null);
    }

    private ax(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2, String str3, InterstitialAd interstitialAd, Runnable[] runnableArr) {
        super(dbVar, str, j, i, j2, j3, f, f2, j4, str2, str3);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("placementId is empty!");
        }
        this.interstitialAd = interstitialAd;
        this.f13951m = runnableArr;
    }

    public InterstitialAd interstitialAd() {
        ThreadUtil.m19102b();
        return this.interstitialAd;
    }

    protected boolean mo3118a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        boolean a = super.mo3118a(view, list, cxVar, objArr);
        if (this.interstitialAd != null) {
            if (this.f13951m != null && this.f13951m.length > 0) {
                this.f13951m[0] = new ay(this);
            }
            try {
                this.interstitialAd.show();
            } catch (Throwable th) {
            }
        }
        return a;
    }

    protected boolean mo3119d() {
        ThreadUtil.m19102b();
        if (this.interstitialAd == null) {
            return false;
        }
        return super.mo3119d();
    }

    protected List<cv> mo3117a(C2443a c2443a) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadUtil.m19099a(false, new az(this, linkedBlockingQueue));
        List<cv> list = null;
        try {
            list = (List) linkedBlockingQueue.poll(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        ThreadUtil.m19099a(false, new bg(this, list == null));
        return list;
    }

    protected void mo3120e() {
    }
}
