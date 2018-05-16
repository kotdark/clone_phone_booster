package utility.quickest.phonebooster.model_helper;

import android.app.NotificationManager;
import android.app.Service;
import android.support.v4.view.PointerIconCompat;
import utility.quickest.phonebooster.app.MyApplicationLike;

/* compiled from: AlwaysNotiHelper */
final class de implements Runnable {
    final /* synthetic */ Service f14087a;

    de(Service service) {
        this.f14087a = service;
    }

    public void run() {
        AlwaysNotiHelper.f13866b.removeCallbacks(AlwaysNotiHelper.f13867c);
        SwitchModel.m18216a().m18238b(AlwaysNotiHelper.f13868d);
        try {
            this.f14087a.stopForeground(true);
        } catch (Throwable th) {
        }
        try {
            ((NotificationManager) MyApplicationLike.getApplication().getSystemService("notification")).cancel(PointerIconCompat.TYPE_ALIAS);
        } catch (Throwable th2) {
        }
        try {
            this.f14087a.stopSelf();
        } catch (Throwable th3) {
        }
    }
}
