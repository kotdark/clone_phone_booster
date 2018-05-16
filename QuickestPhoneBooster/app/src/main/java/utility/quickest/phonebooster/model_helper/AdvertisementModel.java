package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import android.support.v4.os.EnvironmentCompat;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerLib;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AdvertisementModel */
abstract class AdvertisementModel {
    protected final db f13887a;
    protected final String adId;
    protected final long f13889c;
    protected final int f13890d;
    protected final long f13891e;
    protected final long f13892f;
    protected final float f13893g;
    protected final float f13894h;
    protected final long f13895i;
    protected final String f13896j;
    protected final String f13897k;
    private im f13898l = null;
    private boolean f13899m = false;
    private boolean f13900n = false;
    private cx f13901o = null;

    protected abstract List<cv> mo3117a(C2443a c2443a);

    protected abstract void mo3120e();

    protected AdvertisementModel(db dbVar, String adId, long j, int i, long j2, long j3, float f, float f2, long j4, String str2, String str3) {
        if (dbVar == null) {
            throw new IllegalArgumentException("target is null!");
        }
        this.f13887a = dbVar;
        this.adId = adId == null ? "" : adId.trim();
        if (j <= 0) {
            j = 10;
        }
        this.f13889c = j;
        if (i < 1) {
            i = 1;
        }
        this.f13890d = i;
        if (j2 < 0) {
            j2 = 0;
        }
        this.f13891e = j2;
        if (j3 <= 0) {
            j3 = 3600;
        }
        this.f13892f = j3;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f13893g = f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        this.f13894h = f2;
        this.f13895i = j4;
        this.f13896j = str2 == null ? "" : str2.trim();
        this.f13897k = str3 == null ? "" : str3.trim();
    }

    protected boolean mo3118a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        this.f13901o = cxVar;
        boolean z = !this.f13899m;
        if (!this.f13899m) {
            this.f13899m = true;
            try {
                Answers.getInstance().logCustom(new CustomEvent("AdSourceShow-" + this.f13887a.getType() + "-" + this.adId));
            } catch (Throwable th) {
            }
            try {
                Map hashMap = new HashMap();
                hashMap.put("pId", this.f13896j);
                hashMap.put("customId", this.f13897k);
                AppsFlyerLib.getInstance().trackEvent(MyApplicationLike.getApplication(), "AdSourceShow-" + this.adId, hashMap);
            } catch (Throwable th2) {
            }
            String str = "ad_" + this.f13887a.getType();
            C2542m.m19086a(str, "ad_show", str, null, null, null, this.f13897k);
        }
        if (this.f13887a.equals(db.SPLASH) && objArr != null && objArr.length > 0 && objArr[0] != null && (objArr[0] instanceof im)) {
            this.f13898l = (im) objArr[0];
        }
        return z;
    }

    protected final void m18246a() {
        ThreadUtil.m19102b();
        if (this.f13887a.equals(db.SPLASH) && this.f13898l != null) {
            this.f13898l.m18734a();
        }
    }

    protected final void m18250b() {
        ThreadUtil.m19102b();
        if (!this.f13900n) {
            Map hashMap;
            this.f13900n = true;
            try {
                Answers.getInstance().logCustom(new CustomEvent("AdSourceClick-" + (this.f13887a.getType() + "-" + this.adId)));
            } catch (Throwable th) {
            }
            try {
                hashMap = new HashMap();
                hashMap.put("pId", this.f13896j);
                hashMap.put("customId", this.f13897k);
                AppsFlyerLib.getInstance().trackEvent(MyApplicationLike.getApplication(), "AdSourceClick-" + this.adId, hashMap);
            } catch (Throwable th2) {
            }
            String str = "ad_" + this.f13887a.getType();
            C2542m.m19086a(str, "ad", str, null, null, null, this.f13897k);
            if (this.f13893g > 0.0f) {
                try {
                    hashMap = new HashMap();
                    hashMap.put(AFInAppEventParameterName.REVENUE, this.f13893g);
                    hashMap.put(AFInAppEventParameterName.CONTENT_TYPE, this.adId);
                    hashMap.put("pId", this.f13896j);
                    hashMap.put("customId", this.f13897k);
                    AppsFlyerLib.getInstance().trackEvent(MyApplicationLike.getApplication(), AFInAppEventType.PURCHASE, hashMap);
                } catch (Throwable th3) {
                }
            }
        }
    }

    protected final void m18251c() {
        ThreadUtil.m19102b();
        if (this.f13901o != null) {
            try {
                this.f13901o.mo3108a();
            } catch (Throwable th) {
            }
        }
    }

    protected final void m18247a(boolean z) {
        ThreadUtil.m19102b();
        try {
            Answers.getInstance().logCustom((CustomEvent) new CustomEvent("AdSourceTimeout-" + this.f13887a.getType() + "-" + this.adId).putCustomAttribute("value", String.valueOf(z)));
        } catch (Throwable th) {
        }
    }

    protected final void m18248a(boolean z, long j, String str) {
        ThreadUtil.m19102b();
        String str2 = "AdSourceRequest" + (z ? "Ok" : "Fail") + "Time-" + this.f13887a.getType() + "-" + this.adId;
        if (!z) {
            if (str != null) {
                str = str.trim();
            }
            if (TextUtils.isEmpty(str)) {
                str = EnvironmentCompat.MEDIA_UNKNOWN;
            }
        }
        try {
            CustomEvent customEvent = (CustomEvent) new CustomEvent(str2).putCustomAttribute("value", j);
            if (!z) {
                customEvent.putCustomAttribute("reason", str);
            }
            Answers.getInstance().logCustom(customEvent);
        } catch (Throwable th) {
        }
    }

    protected boolean mo3119d() {
        ThreadUtil.m19102b();
        if (this.f13891e > 0 && SystemClock.elapsedRealtime() - this.f13891e <= this.f13892f * 1000) {
            return true;
        }
        return false;
    }
}
