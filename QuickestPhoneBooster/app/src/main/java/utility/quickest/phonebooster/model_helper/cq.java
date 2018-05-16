package utility.quickest.phonebooster.model_helper;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;

/* compiled from: AdvertisementModel */
class cq implements Runnable {
    final /* synthetic */ String f14052a;
    final /* synthetic */ co f14053b;

    cq(co coVar, String str) {
        this.f14053b = coVar;
        this.f14052a = str;
    }

    public void run() {
        try {
            Answers.getInstance().logCustom((CustomEvent) new CustomEvent("RequestOwnAd-" + this.f14053b.f14047c.a.m18427b()).putCustomAttribute("result", this.f14052a));
        } catch (Throwable th) {
        }
    }
}
