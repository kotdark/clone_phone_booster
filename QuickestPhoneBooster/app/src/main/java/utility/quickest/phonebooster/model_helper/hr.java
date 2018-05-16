package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C2268a;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;

/* compiled from: PushModel */
class hr implements Runnable {
    final /* synthetic */ hq f14352a;

    hr(hq hqVar) {
        this.f14352a = hqVar;
    }

    public void run() {
        try {
            C2268a.m16680a().m16681a("KeepTick");
        } catch (Throwable th) {
        }
        String str = null;
        try {
            str = FirebaseInstanceId.getInstance().getToken();
        } catch (Throwable th2) {
        }
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        if (!TextUtils.isEmpty(str) && !str.equals(a.m17543r())) {
            a.m17494c(str);
            is.m18737a("PushRegister", "GCM", System.currentTimeMillis(), str);
        }
    }
}
