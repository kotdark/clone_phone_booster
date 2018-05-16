package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import android.view.View;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;
import com.mopub.nativeads.NativeAd;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
final class bs extends AdvertisementModel {
    private final NativeAd nativeAd;

    private static void m18353g() {
    }

    private bs(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2) {
        this(dbVar, str, j, i, j2, j3, f, f2, j4, str2, null, null);
    }

    private bs(db dbVar, String adID, long j, int i, long j2, long j3, float f, float f2, long j4, String str2, String str3, NativeAd nativeAd) {
        super(dbVar, adID, j, i, j2, j3, f, f2, j4, str2, str3);
        if (TextUtils.isEmpty(adID)) {
            throw new IllegalArgumentException("unitId is empty!");
        }
        this.nativeAd = nativeAd;
    }

    public NativeAd getNativeAd() {
        ThreadUtil.m19102b();
        return this.nativeAd;
    }

    protected boolean mo3118a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        boolean a = super.mo3118a(view, list, cxVar, objArr);
        if (!(this.nativeAd == null || view == null)) {
            try {
                this.nativeAd.setMoPubNativeEventListener(new bt(this));
                this.nativeAd.prepare(view);
                this.nativeAd.renderAdView(view);
            } catch (Throwable th) {
            }
        }
        return a;
    }

    protected boolean mo3119d() {
        ThreadUtil.m19102b();
        if (this.nativeAd == null) {
            return false;
        }
        return super.mo3119d();
    }

    protected List<cv> mo3117a(C2443a c2443a) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadUtil.m19099a(false, new bv(this, linkedBlockingQueue));
        List<cv> list = null;
        try {
            list = (List) linkedBlockingQueue.poll(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        ThreadUtil.m19099a(false, new cb(this, list == null));
        return list;
    }

    protected void mo3120e() {
    }
}
