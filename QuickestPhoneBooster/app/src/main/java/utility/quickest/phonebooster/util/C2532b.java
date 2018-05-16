package utility.quickest.phonebooster.util;

import android.os.SystemClock;
import com.appsflyer.AppsFlyerLib;
import utility.quickest.phonebooster.app.MyApplicationLike;

/* compiled from: AppUtil */
final class C2532b implements Runnable {
    C2532b() {
    }

    public void run() {
        try {
            AppsFlyerLib.getInstance().registerConversionListener(MyApplicationLike.getApplication(), new C2533c(this, SystemClock.elapsedRealtime()));
        } catch (Throwable th) {
        }
    }
}
