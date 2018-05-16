package utility.quickest.phonebooster.model_helper;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.provider.Settings.System;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p114d.C2454l;
import utility.quickest.phonebooster.p114d.C2455m;
import utility.quickest.phonebooster.util.C2543n;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.NetworkUtil;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public final class SwitchModel {
    private static volatile SwitchModel f13880a = null;
    private C2454l f13881b = new C2454l(true, C2455m.Normal, -1);
    private final Handler f13882c = ThreadUtil.m19110g();
    private final Runnable f13883d = new ix(this);
    private final Set<jc> f13884e = new LinkedHashSet();

    public final class FetchSwitchReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            SwitchModel.m18216a().m18228j();
        }
    }

    public static SwitchModel m18216a() {
        if (f13880a == null) {
            synchronized (SwitchModel.class) {
                if (f13880a == null) {
                    f13880a = new SwitchModel();
                }
            }
        }
        return f13880a;
    }

    public C2454l m18237b() {
        ThreadUtil.m19102b();
        return this.f13881b;
    }

    public void m18235a(jc jcVar) {
        ThreadUtil.m19102b();
        if (jcVar != null) {
            this.f13884e.add(jcVar);
            m18228j();
        }
    }

    public void m18238b(jc jcVar) {
        ThreadUtil.m19102b();
        if (jcVar != null) {
            this.f13884e.remove(jcVar);
            if (this.f13884e.isEmpty()) {
                this.f13882c.removeCallbacks(this.f13883d);
            }
        }
    }

    public void m18236a(boolean z) {
        ThreadUtil.m19102b();
        try {
            ((WifiManager) MyApplicationLike.getApplication().getApplicationContext().getSystemService("wifi")).setWifiEnabled(z);
            m18228j();
        } catch (Throwable th) {
        }
    }

    public boolean m18239c() {
        ThreadUtil.m19102b();
        try {
            if (VERSION.SDK_INT >= 24) {
                return ((NotificationManager) MyApplicationLike.getApplication().getSystemService("notification")).isNotificationPolicyAccessGranted();
            }
        } catch (Throwable th) {
        }
        return true;
    }

    public void m18240d() {
        ThreadUtil.m19102b();
        m18223c(true);
    }

    public void m18234a(C2455m c2455m, boolean z) {
        ThreadUtil.m19102b();
        if (c2455m != null) {
            m18223c(z);
            try {
                ((AudioManager) MyApplicationLike.getApplication().getSystemService("audio")).setRingerMode(c2455m.m17695a());
                m18228j();
            } catch (Throwable th) {
            }
        }
    }

    public boolean m18241e() {
        ThreadUtil.m19102b();
        try {
            if (VERSION.SDK_INT >= 23) {
                return System.canWrite(MyApplicationLike.getApplication());
            }
        } catch (Throwable th) {
        }
        return true;
    }

    public void m18242f() {
        ThreadUtil.m19102b();
        m18221b(true);
    }

    public void m18233a(int i, boolean z) {
        ThreadUtil.m19102b();
        m18221b(z);
        if (i < 0) {
            try {
                System.putInt(MyApplicationLike.getApplication().getContentResolver(), "screen_brightness_mode", 1);
            } catch (Throwable th) {
                return;
            }
        }
        if (i > 100) {
            i = 100;
        }
        System.putInt(MyApplicationLike.getApplication().getContentResolver(), "screen_brightness", (i * 255) / 100);
        System.putInt(MyApplicationLike.getApplication().getContentResolver(), "screen_brightness_mode", 0);
        m18228j();
    }

    private SwitchModel() {
        ThreadUtil.m19099a(false, new iz(this));
    }

    private void m18218a(C2454l c2454l) {
        ThreadUtil.m19102b();
        if (c2454l != null && !c2454l.equals(this.f13881b)) {
            this.f13881b = c2454l;
            m18229k();
        }
    }

    private void m18228j() {
        ThreadUtil.m19102b();
        this.f13882c.removeCallbacks(this.f13883d);
        this.f13882c.post(this.f13883d);
    }

    private void m18229k() {
        ThreadUtil.m19102b();
        if (!this.f13884e.isEmpty()) {
            for (jc a : new ArrayList(this.f13884e)) {
                a.mo3140a(this.f13881b);
            }
        }
    }

    private static boolean m18230l() {
        return C2543n.WIFI.equals(NetworkUtil.m18867a());
    }

    private static C2455m m18231m() {
        try {
            return C2455m.m17694a(((AudioManager) MyApplicationLike.getApplication().getSystemService("audio")).getRingerMode());
        } catch (Throwable th) {
            return null;
        }
    }

    private static int m18232n() {
        int i = -1;
        try {
            if (System.getInt(MyApplicationLike.getApplication().getContentResolver(), "screen_brightness_mode") != 1) {
                i = (System.getInt(MyApplicationLike.getApplication().getContentResolver(), "screen_brightness") * 100) / 255;
            }
        } catch (Throwable th) {
        }
        return i;
    }

    private static void m18221b(boolean z) {
        ThreadUtil.m19102b();
        if (z) {
            try {
                if (VERSION.SDK_INT >= 23 && !System.canWrite(MyApplicationLike.getApplication())) {
                    Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                    intent.setData(Uri.parse("package:utility.quickest.phonebooster"));
                    intent.setFlags(268435456);
                    MyApplicationLike.getApplication().startActivity(intent);
                }
            } catch (Throwable th) {
            }
        }
    }

    private static void m18223c(boolean z) {
        ThreadUtil.m19102b();
        if (z) {
            try {
                if (VERSION.SDK_INT >= 24 && !((NotificationManager) MyApplicationLike.getApplication().getSystemService("notification")).isNotificationPolicyAccessGranted()) {
                    Intent intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                    intent.setFlags(268435456);
                    MyApplicationLike.getApplication().startActivity(intent);
                }
            } catch (Throwable th) {
            }
        }
    }
}
