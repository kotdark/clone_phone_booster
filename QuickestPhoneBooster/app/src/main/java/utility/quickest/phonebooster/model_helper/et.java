package utility.quickest.phonebooster.model_helper;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.response_data.AppUpdateServiceExpression;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.p114d.C2447e;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.util.C2541l;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.C2543n;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.NetworkUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: AppUpdateModel */
public final class et {
    private static volatile et f14167a = null;
    private static final Handler f14168g = new Handler(Looper.getMainLooper());
    private C2447e f14169b;
    private boolean f14170c;
    private boolean f14171d;
    private final Set<Integer> f14172e;
    private final Runnable f14173f;
    private final Runnable f14174h;
    private fd f14175i;
    private final Set<ff> f14176j;

    public static et m18483a() {
        if (f14167a == null) {
            synchronized (et.class) {
                if (f14167a == null) {
                    f14167a = new et();
                }
            }
        }
        return f14167a;
    }

    public void m18512a(fd fdVar) {
        ThreadUtil.m19102b();
        this.f14175i = fdVar;
    }

    public boolean m18514b() {
        ThreadUtil.m19102b();
        if (this.f14169b == null) {
            return false;
        }
        return this.f14172e.contains(Integer.valueOf(this.f14169b.m17641c()));
    }

    public C2447e m18515c() {
        ThreadUtil.m19102b();
        if (this.f14169b == null || !this.f14169b.m17639a(true)) {
            return null;
        }
        return this.f14169b;
    }

    public void m18516d() {
        ThreadUtil.m19102b();
        if (this.f14169b != null) {
            this.f14169b = this.f14169b.m17636a();
             SharedPrefHelper.m17454a().m17489b(C2447e.m17634b(this.f14169b));
        }
    }

    public void m18517e() {
        ThreadUtil.m19102b();
        if (this.f14169b != null) {
            Intent d = m18500d(this.f14169b);
            if (d != null) {
                try {
                    MyApplicationLike.getApplication().startActivity(d);
                } catch (Throwable th) {
                }
                m18516d();
            }
        }
    }

    public void m18513a(ff ffVar) {
        ThreadUtil.m19102b();
        this.f14170c = true;
        m18494b(ffVar);
    }

    private et() {
        this.f14169b = null;
        this.f14170c = false;
        this.f14171d = false;
        this.f14172e = new HashSet();
        this.f14173f = new eu(this);
        this.f14174h = new ev(this);
        this.f14175i = null;
        this.f14176j = new LinkedHashSet();
        this.f14169b = C2447e.m17632a( SharedPrefHelper.m17454a().m17535n());
        if (!(this.f14169b == null || TextUtils.isEmpty(this.f14169b.m17647i()))) {
            try {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!(externalStorageDirectory == null || this.f14169b.m17647i().startsWith(externalStorageDirectory.getAbsolutePath()))) {
                    this.f14169b = null;
                }
            } catch (Throwable th) {
            }
        }
        ThreadUtil.m19099a(false, new ew(this));
    }

    private void m18494b(ff ffVar) {
        ThreadUtil.m19102b();
        m18499c(ffVar);
        if (!this.f14171d) {
            this.f14171d = true;
            ThreadUtil.m19103c(new ey(this, C2490a.m18243a().m18244b()));
        }
    }

    private void m18507g() {
        ThreadUtil.m19102b();
        if (this.f14169b != null) {
            if (this.f14169b.m17639a(false)) {
                if (this.f14170c) {
                    this.f14170c = false;
                    m18517e();
                } else if (!MyApplicationLike.m17418b().m17433d()) {
                    m18510i();
                }
            } else if (NetworkUtil.m18867a().equals(C2543n.WIFI) || this.f14170c) {
                m18509h();
            }
        }
    }

    private void m18509h() {
        ThreadUtil.m19102b();
        if (this.f14169b != null && !AppUtil.m19016a(true, this.f14169b.m17645g()) && !this.f14172e.contains(Integer.valueOf(this.f14169b.m17641c()))) {
            this.f14172e.add(Integer.valueOf(this.f14169b.m17641c()));
            ThreadUtil.m19103c(new fa(this, this.f14169b));
        }
    }

    private void m18492b(C2447e c2447e) {
        if (c2447e != null) {
            if (this.f14169b == null) {
                this.f14169b = c2447e;
            } else {
                this.f14169b = this.f14169b.m17637a(c2447e);
            }
             SharedPrefHelper.m17454a().m17489b(C2447e.m17634b(this.f14169b));
        }
    }

    private void m18510i() {
        ThreadUtil.m19102b();
        if (this.f14169b != null && this.f14169b.m17639a(true) && !this.f14169b.m17649k()) {
            Intent d = m18500d(this.f14169b);
            if (d != null && this.f14175i != null) {
                Notification a = this.f14175i.mo3076a(this.f14169b, d);
                if (a != null) {
                    try {
                        C2542m.m19081a(a);
                        NotificationManager notificationManager = (NotificationManager) MyApplicationLike.getApplication().getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.notify(3001, a);
                            m18498c(this.f14169b);
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    private void m18498c(C2447e c2447e) {
        ThreadUtil.m19102b();
        if (c2447e != null && this.f14169b != null && this.f14169b.m17641c() == c2447e.m17641c()) {
            this.f14169b = this.f14169b.m17640b();
             SharedPrefHelper.m17454a().m17489b(C2447e.m17634b(this.f14169b));
        }
    }

    private Intent m18500d(C2447e c2447e) {
        if (c2447e != null) {
            try {
                if (AppUtil.m19016a(true, c2447e.m17645g())) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=utility.quickest.phonebooster"));
                        for (ResolveInfo resolveInfo : MyApplicationLike.getApplication().getPackageManager().queryIntentActivities(intent, 0)) {
                            if (resolveInfo.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                                ActivityInfo activityInfo = resolveInfo.activityInfo;
                                intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
                                intent.setFlags(337641472);
                                return intent;
                            }
                        }
                    } catch (Exception e) {
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=utility.quickest.phonebooster"));
                    intent2.setFlags(268435456);
                    return intent2;
                }
            } catch (Throwable th) {
                return null;
            }
        }
        if (c2447e == null || !c2447e.m17650l()) {
            return null;
        }
        intent2 = new Intent("android.intent.action.VIEW");
        File file = new File(c2447e.m17647i());
        if (VERSION.SDK_INT >= 24) {
            intent2.setDataAndType(FileProvider.getUriForFile(MyApplicationLike.getApplication(), "utility.quickest.phonebooster.fileprovider", file), "application/vnd.android.package-archive");
            intent2.setFlags(268435457);
            return intent2;
        }
        intent2.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        intent2.setFlags(268435456);
        return intent2;
    }

    private void m18499c(ff ffVar) {
        ThreadUtil.m19102b();
        if (ffVar != null) {
            this.f14176j.add(ffVar);
        }
    }

    private void m18503e(C2447e c2447e) {
        ThreadUtil.m19102b();
        if (!this.f14176j.isEmpty()) {
            List<ff> arrayList = new ArrayList(this.f14176j);
            this.f14176j.clear();
            for (ff a : arrayList) {
                a.mo3106a(c2447e);
            }
        }
    }

    private static void m18491b(C2443a c2443a, String str, String str2, fe feVar) {
        try {
             SharedPrefHelper.m17454a().m17547t(System.currentTimeMillis());
            AppUpdateServiceExpression appUpdateServiceExpression = (AppUpdateServiceExpression) C2522c.m18847a().m18843a(C2542m.m19076a(c2443a.m17612b()), str, str2).mo1131a().m2659b();
            if (appUpdateServiceExpression == null) {
                feVar.f14194a = -3;
                return;
            }
            try {
                for (String fcVar : C2542m.m19092c(C2542m.m19077a(appUpdateServiceExpression.VerificationToken, true))) {
                    ThreadUtil.m19097a("VerificationTokenTask", new fc(fcVar, c2443a));
                }
            } catch (Throwable th) {
            }
            C2447e a = C2447e.m17631a(appUpdateServiceExpression);
            if (a == null) {
                feVar.f14194a = -3;
                return;
            }
            feVar.f14195b = a;
            feVar.f14194a = 0;
        } catch (IOException e) {
            feVar.f14194a = -2;
        }
    }

    private static File m18505f(C2447e c2447e) {
        if (c2447e == null) {
            return null;
        }
        return C2541l.m19069a(c2447e.m17646h(), m18511j());
    }

    private static String m18511j() {
        String str = null;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                File file = new File(externalStorageDirectory, "cleanApk");
                file.mkdirs();
                str = new File(file, UUID.randomUUID().toString()).getAbsolutePath();
            }
        } catch (Throwable th) {
        }
        return str;
    }
}
