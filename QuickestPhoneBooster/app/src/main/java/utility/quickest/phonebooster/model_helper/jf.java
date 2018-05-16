package utility.quickest.phonebooster.model_helper;

import android.os.Build;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;

/* compiled from: TemperatureModel */
class jf implements Runnable {
    final /* synthetic */ Integer f14449a;
    final /* synthetic */ je f14450b;

    jf(je jeVar, Integer num) {
        this.f14450b = jeVar;
        this.f14449a = num;
    }

    public void run() {
        if (this.f14450b.f14448a.f14444c && this.f14449a == null) {
            try {
                Answers.getInstance().logCustom((CustomEvent) new CustomEvent("NoTemperature").putCustomAttribute("Device", Build.MANUFACTURER + "|" + Build.MODEL));
            } catch (Throwable th) {
            }
        }
        this.f14450b.f14448a.f14444c = false;
        if (!(this.f14449a == null || this.f14450b.f14448a.f14443b == this.f14449a.intValue())) {
            this.f14450b.f14448a.f14443b = this.f14449a.intValue();
            this.f14450b.f14448a.m18743a(this.f14450b.f14448a.f14443b);
        }
        if (!this.f14450b.f14448a.f14447f.isEmpty()) {
            this.f14450b.f14448a.f14445d.postDelayed(this.f14450b.f14448a.f14446e, 1000);
        }
    }
}
