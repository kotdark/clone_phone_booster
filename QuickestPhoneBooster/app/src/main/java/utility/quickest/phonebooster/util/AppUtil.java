package utility.quickest.phonebooster.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.R;
import java.util.List;

/* compiled from: AppUtil */
public final class AppUtil {
    private static String f14668a = null;
    private static String f14669b = null;
    private static String f14670c = null;
    private static String f14671d = null;
    private static String f14672e = null;

    public static synchronized String m19015a() {
        String str;
        synchronized (AppUtil.class) {
            if (f14668a == null) {
                try {
                    f14668a = MyApplicationLike.getApplication().getString(R.string.app_name).trim();
                } catch (Throwable th) {
                }
            }
            str = f14668a == null ? "" : f14668a;
        }
        return str;
    }

    public static synchronized String m19017b() {
        String str;
        synchronized (AppUtil.class) {
            if (f14669b == null) {
                try {
                    f14669b = String.valueOf(10223).trim();
                } catch (Throwable th) {
                }
            }
            str = f14669b == null ? "" : f14669b;
        }
        return str;
    }

    public static synchronized String m19018c() {
        String str;
        synchronized (AppUtil.class) {
            if (f14670c == null) {
                try {
                    f14670c = String.valueOf( SharedPrefHelper.m17454a().m17496d()).trim();
                } catch (Throwable th) {
                }
            }
            str = f14670c == null ? "" : f14670c;
        }
        return str;
    }

    public static synchronized String m19019d() {
        String str;
        synchronized (AppUtil.class) {
            if (f14671d == null) {
                try {
                    f14671d = String.valueOf( SharedPrefHelper.m17454a().m17501e()).trim();
                } catch (Throwable th) {
                }
            }
            str = f14671d == null ? "" : f14671d;
        }
        return str;
    }

    public static String m19020e() {
        return "GooglePlay";
    }

    public static String m19021f() {
        return "GooglePlay";
    }

    public static synchronized String m19022g() {
        String str;
        synchronized (AppUtil.class) {
            if (f14672e == null) {
                try {
                    Context a = MyApplicationLike.getApplication();
                    f14672e = a.getPackageManager().getApplicationInfo(a.getPackageName(), PackageManager.GET_META_DATA).metaData.getString("AF_PRE_INSTALL_NAME");
                } catch (Exception e) {
                }
            }
            str = f14672e == null ? "" : f14672e;
        }
        return str;
    }

    public static boolean m19016a(boolean z, boolean z2) {
        if (z2) {
            return false;
        }
        return true;
    }

    public static boolean m19023h() {
        Context a = MyApplicationLike.getApplication();
        int myPid = Process.myPid();
        try {
            List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) a.getSystemService(Context.ACTIVITY_SERVICE)).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && runningAppProcessInfo.pid == myPid) {
                        String str = runningAppProcessInfo.processName;
                        if (str != null) {
                            str = str.trim();
                        }
                        if ("utility.quickest.phonebooster".trim().equalsIgnoreCase(str)) {
                            return true;
                        }
                        return false;
                    }
                }
            }
        } catch (Exception e) {
        }
        return true;
    }

    public static void m19024i() {
        ThreadUtil.m19099a(false, new C2532b());
    }

    public static boolean m19025j() {
        return  SharedPrefHelper.m17454a().m17496d() == 0;
    }

    public static long m19026k() {
        return Math.abs(System.currentTimeMillis() -  SharedPrefHelper.m17454a().m17506f());
    }
}
