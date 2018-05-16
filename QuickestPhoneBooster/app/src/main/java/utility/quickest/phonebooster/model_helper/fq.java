package utility.quickest.phonebooster.model_helper;

import android.app.Notification;
import android.app.NotificationManager;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.C2542m;
import java.util.LinkedHashSet;

/* compiled from: CleanNotificationModel */
class fq implements er {
    final /* synthetic */ eh f14214a;
    final /* synthetic */ ft f14215b;
    final /* synthetic */ long f14216c;
    final /* synthetic */ fp f14217d;

    fq(fp fpVar, eh ehVar, ft ftVar, long j) {
        this.f14217d = fpVar;
        this.f14214a = ehVar;
        this.f14215b = ftVar;
        this.f14216c = j;
    }

    public void mo3094a(es esVar) {
        er erVar = null;
        if (esVar.equals(es.ReadyToScanAndKill)) {
            this.f14214a.m18476a(erVar);
            if (this.f14217d.f14213e.f14204b != null) {
                Notification a;
                try {
                    a = this.f14217d.f14213e.f14204b.mo3075a(this.f14215b, this.f14216c + this.f14214a.m18479b(), new LinkedHashSet());
                } catch (Throwable th) {
                    Object obj = erVar;
                }
                if (a != null) {
                    try {
                        C2542m.m19081a(a);
                        NotificationManager notificationManager = (NotificationManager) MyApplicationLike.getApplication().getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.notify(4001, a);
                            long currentTimeMillis = System.currentTimeMillis();
                             SharedPrefHelper a2 =  SharedPrefHelper.m17454a();
                            a2.m17508f(currentTimeMillis);
                            a2.m17523j(currentTimeMillis);
                            this.f14215b.m18551b();
                        }
                    } catch (Throwable th2) {
                    }
                }
            }
        }
    }

    public void mo3095a(String str) {
    }

    public void mo3096b(String str) {
    }
}
