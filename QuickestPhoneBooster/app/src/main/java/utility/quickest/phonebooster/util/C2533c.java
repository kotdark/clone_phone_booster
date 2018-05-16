package utility.quickest.phonebooster.util;

import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* compiled from: AppUtil */
class C2533c implements AppsFlyerConversionListener {
    final /* synthetic */ long f14673a;
    final /* synthetic */ C2532b f14674b;

    C2533c(C2532b c2532b, long j) {
        this.f14674b = c2532b;
        this.f14673a = j;
    }

    public void onInstallConversionDataLoaded(Map<String, String> map) {
        if (map != null) {
            ThreadUtil.m19099a(false, new C2534d(this, map));
        }
    }

    public void onInstallConversionFailure(String str) {
    }

    public void onAppOpenAttribution(Map<String, String> map) {
    }

    public void onAttributionFailure(String str) {
    }
}
