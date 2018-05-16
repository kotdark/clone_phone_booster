package utility.quickest.phonebooster.model_helper;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.ThreadUtil;

public final class AlwaysNotiHelper {
    private static dg f13865a = null;
    private static final Handler f13866b = new Handler(Looper.getMainLooper());
    private static final Runnable f13867c = new dc();
    private static final jc f13868d = new dd();

    public final class AlwaysNotiService extends Service {
        public int onStartCommand(Intent intent, int i, int i2) {
            super.onStartCommand(intent, i, i2);
            AlwaysNotiHelper.m18173b(this);
            return 1;
        }

        public IBinder onBind(Intent intent) {
            return null;
        }
    }

    public static void m18170a(dg dgVar) {
        ThreadUtil.m19102b();
        f13865a = dgVar;
    }

    public static boolean m18172a() {
        ThreadUtil.m19102b();
        if (!hz.m18683a().m18693a(id.AlwaysNoti)) {
            return false;
        }
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        if (a.m17479Y()) {
            return false;
        }
        boolean Z = a.m17480Z();
        if (Z) {
            a.m17531l(false);
        }
        return Z;
    }

    public static boolean m18174b() {
        ThreadUtil.m19102b();
        if (hz.m18683a().m18693a(id.AlwaysNoti)) {
            return  SharedPrefHelper.m17454a().m17479Y();
        }
        return false;
    }

    public static void m18171a(boolean z) {
        ThreadUtil.m19102b();
        if (hz.m18683a().m18693a(id.AlwaysNoti)) {
             SharedPrefHelper.m17454a().m17528k(z);
            m18175c();
        }
    }

    public static void m18175c() {
        ThreadUtil.m19102b();
        if (hz.m18683a().m18693a(id.AlwaysNoti)) {
            try {
                Context a = MyApplicationLike.getApplication();
                a.startService(new Intent(a, AlwaysNotiService.class));
            } catch (Throwable th) {
            }
        }
    }

    private static void m18173b(Service service) {
        ThreadUtil.m19102b();
        Runnable deVar = new de(service);
        if (!m18174b() || f13865a == null) {
            deVar.run();
        } else {
            jd.m18744a(new df(service, deVar));
        }
    }
}
