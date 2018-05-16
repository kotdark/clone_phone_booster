package utility.quickest.phonebooster.util;

import com.crashlytics.android.Crashlytics;

/* compiled from: ThreadUtil */
class C2553y implements Runnable {
    final /* synthetic */ RuntimeException f14731a;
    final /* synthetic */ C2552x f14732b;

    C2553y(C2552x c2552x, RuntimeException runtimeException) {
        this.f14732b = c2552x;
        this.f14731a = runtimeException;
    }

    public void run() {
        try {
            Crashlytics.logException(this.f14731a);
        } catch (Throwable th) {
        }
    }
}
