package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.InterstitialAd;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
final class C2510q extends AdvertisementModel {
    private final InterstitialAd interstitialAd;
    private final Runnable[] f14498m;

    private static void m18828g() {
    }

    private C2510q(db dbVar, String adID, long j, int i, long j2, long j3, float f, float f2, long j4, String str2) {
        this(dbVar, adID, j, i, j2, j3, f, f2, j4, str2, null, null, null);
    }

    private C2510q(db dbVar, String adID, long j, int i, long j2, long j3, float f, float f2, long j4, String str2, String str3, InterstitialAd c1970j, Runnable[] runnableArr) {
        super(dbVar, adID, j, i, j2, j3, f, f2, j4, str2, str3);
        if (TextUtils.isEmpty(adID)) {
            throw new IllegalArgumentException("unitId is empty!");
        }
        this.interstitialAd = c1970j;
        this.f14498m = runnableArr;
    }

    public InterstitialAd getInterstitialAd() {
        ThreadUtil.m19102b();
        return this.interstitialAd;
    }

    protected boolean mo3118a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        boolean a = super.mo3118a(view, list, cxVar, objArr);
        if (this.interstitialAd != null) {
            if (this.f14498m != null && this.f14498m.length > 0) {
                this.f14498m[0] = new C2511r(this);
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
        ThreadUtil.m19099a(false, new C2512s(this, linkedBlockingQueue));
        List<cv> list = null;
        try {
            list = (List) linkedBlockingQueue.poll(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        ThreadUtil.m19099a(false, new C2519z(this, list == null));
        return list;
    }

    protected void mo3120e() {
    }
}
