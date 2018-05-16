package utility.quickest.phonebooster.model_helper;

import com.appsflyer.AppsFlyerLib;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.C2554z;

/* compiled from: CleanNotificationModel */
class fv implements Runnable {
    final /* synthetic */ ft f14233a;

    fv(ft ftVar) {
        this.f14233a = ftVar;
    }

    public void run() {
        String str = "Noti-1-" + this.f14233a.name() + "-Click";
        C2542m.m19082a("notification", "noticlick", null);
        try {
            Answers.getInstance().logCustom((CustomEvent) new CustomEvent(str).putCustomAttribute("hour", String.valueOf(C2554z.m19116c(System.currentTimeMillis()))));
        } catch (Throwable th) {
        }
        try {
            Answers.getInstance().logCustom(new CustomEvent("Noti-1-TotalClick"));
        } catch (Throwable th2) {
        }
        try {
            AppsFlyerLib.getInstance().trackEvent(MyApplicationLike.getApplication(), str, null);
        } catch (Throwable th3) {
        }
    }
}
