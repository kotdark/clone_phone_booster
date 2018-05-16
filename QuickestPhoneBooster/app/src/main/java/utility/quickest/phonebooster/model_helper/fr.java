package utility.quickest.phonebooster.model_helper;

import android.app.Notification;
import android.app.NotificationManager;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.C2542m;
import java.util.LinkedHashSet;

/* compiled from: CleanNotificationModel */
class fr implements jj {
    final /* synthetic */ boolean f14218a;
    final /* synthetic */ boolean f14219b;
    final /* synthetic */ boolean f14220c;
    final /* synthetic */ fl f14221d;

    fr(fl flVar, boolean z, boolean z2, boolean z3) {
        this.f14221d = flVar;
        this.f14218a = z;
        this.f14219b = z2;
        this.f14220c = z3;
    }

    public void mo3090a(int i) {
        ft ftVar = null;
        ft ftVar2 = i > 34 ? ft.Temperature : ftVar;
        if (ftVar2 == null) {
            this.f14221d.m18532a(this.f14218a, this.f14219b, this.f14220c, true);
        } else if (this.f14221d.f14204b != null) {
            Notification a;
            try {
                a = this.f14221d.f14204b.mo3075a(ftVar2, (long) i, new LinkedHashSet());
            } catch (Throwable th) {
                Object obj = ftVar;
            }
            if (a != null) {
                try {
                    C2542m.m19081a(a);
                    NotificationManager notificationManager = (NotificationManager) MyApplicationLike.getApplication().getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.notify(9001, a);
                        long currentTimeMillis = System.currentTimeMillis();
                         SharedPrefHelper a2 =  SharedPrefHelper.m17454a();
                        a2.m17520i(currentTimeMillis);
                        a2.m17523j(currentTimeMillis);
                        ftVar2.m18551b();
                    }
                } catch (Throwable th2) {
                }
            }
        }
    }
}
