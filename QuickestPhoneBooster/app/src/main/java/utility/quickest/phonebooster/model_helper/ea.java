package utility.quickest.phonebooster.model_helper;

import android.os.SystemClock;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;

/* compiled from: ApkFileScanningModel */
class ea implements Runnable {
    final /* synthetic */ boolean f14136a;
    final /* synthetic */ dz f14137b;

    ea(dz dzVar, boolean z) {
        this.f14137b = dzVar;
        this.f14136a = z;
    }

    public void run() {
        this.f14137b.f14133b.f14116c = false;
        dr.f14112a.removeCallbacks(this.f14137b.f14133b.f14115b);
        dr.f14112a.postDelayed(this.f14137b.f14133b.f14115b, this.f14136a ? 3600000 : 300000);
        if (this.f14136a) {
            try {
                Answers.getInstance().logCustom((CustomEvent) new CustomEvent("ScanApkTime").putCustomAttribute("second", Long.valueOf((SystemClock.elapsedRealtime() - this.f14137b.f14132a) / 1000)));
            } catch (Throwable th) {
            }
        }
    }
}
