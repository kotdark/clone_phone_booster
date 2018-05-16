package utility.quickest.phonebooster.push;

import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.hq;

/* compiled from: MyFirebaseInstanceIdService */
class C2529a implements Runnable {
    final /* synthetic */ String f14523a;
    final /* synthetic */ WakeLock f14524b;
    final /* synthetic */ MyFirebaseInstanceIdService f14525c;

    C2529a(MyFirebaseInstanceIdService myFirebaseInstanceIdService, String str, WakeLock wakeLock) {
        this.f14525c = myFirebaseInstanceIdService;
        this.f14523a = str;
        this.f14524b = wakeLock;
    }

    public void run() {
        try {
            if (!TextUtils.isEmpty(this.f14523a)) {
                AppsFlyerLib.getInstance().updateServerUninstallToken(MyApplicationLike.getApplication(), this.f14523a);
            }
        } catch (Throwable th) {
        }
        hq.m18670a().m18675a(this.f14523a, this.f14524b);
    }
}
