package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.request_data.SubmitLogRequest;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.C2554z;
import p022b.as;

/* compiled from: StatisticsHelper */
final class it implements Runnable {
    final /* synthetic */ C2443a f14424a;
    final /* synthetic */ String f14425b;
    final /* synthetic */ String f14426c;
    final /* synthetic */ long f14427d;
    final /* synthetic */ String f14428e;
    final /* synthetic */ Runnable f14429f;
    final /* synthetic */ Runnable f14430g;

    it(C2443a c2443a, String str, String str2, long j, String str3, Runnable runnable, Runnable runnable2) {
        this.f14424a = c2443a;
        this.f14425b = str;
        this.f14426c = str2;
        this.f14427d = j;
        this.f14428e = str3;
        this.f14429f = runnable;
        this.f14430g = runnable2;
    }

    public void run() {
        try {
            SubmitLogRequest submitLogRequest = new SubmitLogRequest();
            submitLogRequest.user_id = this.f14424a.m17612b();
            submitLogRequest.imei = C2535e.m19043h();
            submitLogRequest.platform = "Android";
            submitLogRequest.google_ad_id = C2535e.m19046k();
            submitLogRequest.google_ad_status = C2535e.m19047l();
            submitLogRequest.app_id = "utility.quickest.phonebooster";
            submitLogRequest.app_version = Integer.valueOf(10223);
            submitLogRequest.channel = AppUtil.m19020e();
            submitLogRequest.event_type = this.f14425b;
            submitLogRequest.event_sub_type = this.f14426c;
            submitLogRequest.event_time = C2554z.m19114a(this.f14427d);
            submitLogRequest.event_value = this.f14428e;
            as a = C2522c.m18851b().m18837a(C2542m.m19076a(this.f14424a.m17612b()), this.f14425b, submitLogRequest).mo1131a();
            if (a == null || !a.m2658a()) {
                ThreadUtil.m19099a(false, new iv(this));
            } else {
                ThreadUtil.m19099a(false, new iu(this));
            }
        } catch (Throwable th) {
            ThreadUtil.m19099a(false, new iw(this));
        }
    }
}
