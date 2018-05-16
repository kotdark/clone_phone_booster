package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import utility.quickest.phonebooster.p114d.OwnCampaignInfo;
import java.util.List;

/* compiled from: SplashHelper */
class iq implements cz {
    final /* synthetic */ ip f14423a;

    iq(ip ipVar) {
        this.f14423a = ipVar;
    }

    public void mo3073a() {
        if (this.f14423a.f14422b.f14416b) {
            try {
                Answers.getInstance().logCustom((CustomEvent) new CustomEvent("SplashAdResult").putCustomAttribute("result", "Fail"));
                return;
            } catch (Throwable th) {
                return;
            }
        }
        cv cvVar;
        List c = this.f14423a.f14421a.m18329c(db.SPLASH);
        if (c.isEmpty()) {
            cvVar = null;
        } else {
            cvVar = (cv) c.get(0);
        }
        if (cvVar != null) {
            long j;
            try {
                Answers.getInstance().logCustom((CustomEvent) new CustomEvent("SplashAdResult").putCustomAttribute("result", (((SystemClock.elapsedRealtime() - cvVar.m18412j()) > 10000 ? 1 : ((SystemClock.elapsedRealtime() - cvVar.m18412j()) == 10000 ? 0 : -1)) <= 0 ? 1 : 0) != 0 ? "Ok-In10s" : "Ok-Out10s"));
            } catch (Throwable th2) {
            }
            if (this.f14423a.f14422b.f14418e != null) {
                this.f14423a.f14422b.f14418e.mo3101a(cvVar);
            }
            OwnCampaignInfo a = cvVar.m18402a();
            if (a != null) {
                j = a.m17687j();
            } else {
                j = 0;
            }
            if (j <= 0) {
                j = 4000;
            }
            im.f14414d.removeCallbacks(this.f14423a.f14422b.f14417c);
            im.f14414d.postDelayed(this.f14423a.f14422b.f14417c, j);
        }
    }
}
