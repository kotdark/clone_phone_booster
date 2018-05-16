package utility.quickest.phonebooster.util;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: AppUtil */
class C2534d implements Runnable {
    final /* synthetic */ Map f14675a;
    final /* synthetic */ C2533c f14676b;

    C2534d(C2533c c2533c, Map map) {
        this.f14676b = c2533c;
        this.f14675a = map;
    }

    public void run() {
        try {
            if (Boolean.parseBoolean((String) this.f14675a.get("is_first_launch"))) {
                String str = (String) this.f14675a.get("media_source");
                String str2 = (String) this.f14675a.get("campaign");
                str = str == null ? "" : str.trim();
                str2 = str2 == null ? "" : str2.trim();
                if (TextUtils.isEmpty(str)) {
                    str = (String) this.f14675a.get("agency");
                }
                str = str == null ? "" : str.trim();
                 SharedPrefHelper a =  SharedPrefHelper.m17454a();
                a.m17499d(str);
                a.m17504e(str2);
                MyApplicationLike.m17418b().m17430a(str2, SystemClock.elapsedRealtime() - this.f14676b.f14673a);
                Bundle bundle = new Bundle();
                bundle.putString("campaign", str2);
                bundle.putString("source", str);
                bundle.putString("medium", "CPA");
                for (Entry entry : hz.m18683a().m18694b().entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
                FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent("campaign_details", bundle);
            }
        } catch (Throwable th) {
        }
    }
}
