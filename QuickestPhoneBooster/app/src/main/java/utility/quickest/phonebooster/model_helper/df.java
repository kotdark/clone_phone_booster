package utility.quickest.phonebooster.model_helper;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.support.v4.view.PointerIconCompat;
import android.util.Pair;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2535e;

/* compiled from: AlwaysNotiHelper */
final class df implements jj {
    final /* synthetic */ Service f14088a;
    final /* synthetic */ Runnable f14089b;

    df(Service service, Runnable runnable) {
        this.f14088a = service;
        this.f14089b = runnable;
    }

    public void mo3090a(int i) {
        Object obj;
        long j = 100;
        Notification notification = null;
        SwitchModel a = SwitchModel.m18216a();
        if (AlwaysNotiHelper.m18174b() && AlwaysNotiHelper.f13865a != null) {
            try {
                Pair p = C2535e.m19051p();
                long longValue = ((((Long) p.second).longValue() - ((Long) p.first).longValue()) * 100) / ((Long) p.second).longValue();
                if (longValue <= 100) {
                    if (longValue < 0) {
                        j = 0;
                    } else {
                        j = longValue;
                    }
                }
                notification = AlwaysNotiHelper.f13865a.mo3074a((int) j, i, a.m18237b());
            } catch (Throwable th) {
            }
            if (notification != null) {
                try {
                    notification.defaults &= -3;
                    notification.vibrate = null;
                    notification.defaults &= -2;
                    notification.sound = null;
                    notification.defaults &= -5;
                    notification.flags &= -2;
                    notification.ledARGB = 0;
                    notification.ledOnMS = 0;
                    notification.ledOffMS = 0;
                    this.f14088a.startForeground(PointerIconCompat.TYPE_ALIAS, notification);
                    ((NotificationManager) MyApplicationLike.getApplication().getSystemService("notification")).notify(PointerIconCompat.TYPE_ALIAS, notification);
                    obj = 1;
                } catch (Throwable th2) {
                    obj = null;
                }
                if (obj == null) {
                    AlwaysNotiHelper.f13866b.removeCallbacks(AlwaysNotiHelper.f13867c);
                    AlwaysNotiHelper.f13866b.postDelayed(AlwaysNotiHelper.f13867c, 30000);
                    a.m18235a(AlwaysNotiHelper.f13868d);
                }
                this.f14089b.run();
                return;
            }
        }
        obj = null;
        if (obj == null) {
            this.f14089b.run();
            return;
        }
        AlwaysNotiHelper.f13866b.removeCallbacks(AlwaysNotiHelper.f13867c);
        AlwaysNotiHelper.f13866b.postDelayed(AlwaysNotiHelper.f13867c, 30000);
        a.m18235a(AlwaysNotiHelper.f13868d);
    }
}
