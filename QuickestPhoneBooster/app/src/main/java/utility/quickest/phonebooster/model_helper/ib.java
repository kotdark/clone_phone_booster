package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.google.android.gms.tasks.C2215e;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;

/* compiled from: RuntimeRemoteConfigModel */
class ib implements Runnable {
    final /* synthetic */ C2215e f14383a;
    final /* synthetic */ ia f14384b;

    ib(ia iaVar, C2215e c2215e) {
        this.f14384b = iaVar;
        this.f14383a = c2215e;
    }

    public void run() {
        if ( SharedPrefHelper.m17454a().m17469O()) {
            try {
                if (this.f14384b.f14382a.f14373d > 0 && this.f14383a.mo3006b()) {
                    Answers.getInstance().logCustom((CustomEvent) new CustomEvent("DevFirebaseRC").putCustomAttribute("fetchDuration", Long.valueOf(SystemClock.elapsedRealtime() - this.f14384b.f14382a.f14373d)));
                }
            } catch (Throwable th) {
            }
        }
        this.f14384b.f14382a.f14373d = 0;
        try {
            this.f14384b.f14382a.f14372c.m16833b();
        } catch (Throwable th2) {
        }
        hz.f14370e.removeCallbacks(this.f14384b.f14382a.f14375g);
        hz.f14370e.postDelayed(this.f14384b.f14382a.f14375g, hz.f14368a * 1000);
    }
}
