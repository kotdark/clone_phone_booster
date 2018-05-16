package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import utility.quickest.phonebooster.cache.ImageCache;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
final class GANativeAdModel extends AdvertisementModel {
    private final NativeAd nativeAd;
    private final Runnable[] runnables;

    private static void m18256g() {
    }

    public GANativeAdModel(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2) {
        this(dbVar, str, j, i, j2, j3, f, f2, j4, str2, null, null, null);
    }

    public GANativeAdModel(db dbVar, String adID, long j, int i, long j2, long j3, float f, float f2, long j4, String str2, String str3, NativeAd nativeAd, Runnable[] runnableArr) {
        super(dbVar, adID, j, i, j2, j3, f, f2, j4, str2, str3);
        if (TextUtils.isEmpty(adID)) {
            throw new IllegalArgumentException("unitId is empty!");
        }
        this.nativeAd = nativeAd;
        this.runnables = runnableArr;
    }

    public NativeAd m18257h() {
        ThreadUtil.m19102b();
        return this.nativeAd;
    }

    protected boolean mo3118a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        boolean a = super.mo3118a(view, list, cxVar, objArr);
        if (!(this.nativeAd == null || view == null)) {
            if (this.runnables != null && this.runnables.length > 0) {
                this.runnables[0] = new ab(this);
            }
            try {
                if (view instanceof NativeAdView) {
                    ((NativeAdView) view).setNativeAd(this.nativeAd);
                }
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
        ThreadUtil.m19099a(false, new ac(this, linkedBlockingQueue));
        List<cv> list = null;
        try {
            list = (List) linkedBlockingQueue.poll(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        ThreadUtil.m19099a(false, new am(this, list == null));
        return list;
    }

    protected void mo3120e() {
        String uri;
        String str = null;
        ThreadUtil.m19102b();
        if (this.nativeAd != null) {
            String uri2;
            if (this.nativeAd instanceof NativeAppInstallAd) {
                try {
                    uri = (((NativeAppInstallAd) this.nativeAd).getImages().get(0)).getUri().toString();
                } catch (Throwable th) {
                    uri = null;
                }
                try {
                    uri2 = ((NativeAppInstallAd) this.nativeAd).getIcon().getUri().toString();
                    str = uri;
                } catch (Throwable th2) {
                    uri2 = null;
                    str = uri;
                }
            } else if (this.nativeAd instanceof NativeContentAd) {
                try {
                    uri = (((NativeContentAd) this.nativeAd).getImages().get(0)).getUri().toString();
                } catch (Throwable th3) {
                    uri = null;
                }
                try {
                    uri2 = ((NativeContentAd) this.nativeAd).getLogo().getUri().toString();
                    str = uri;
                } catch (Throwable th4) {
                    uri2 = null;
                    str = uri;
                }
            } else {
                uri2 = null;
            }
            ImageCache.m17570a(str);
            ImageCache.m17570a(uri2);
        }
    }
}
