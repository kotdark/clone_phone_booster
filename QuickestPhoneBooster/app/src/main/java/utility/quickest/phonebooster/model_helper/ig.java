package utility.quickest.phonebooster.model_helper;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.request_data.SubmitFeedbackRequest;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.R;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p022b.as;

/* compiled from: SettingModel */
public final class ig {
    private static final Set<String> f14400a = new HashSet();
    private static volatile ig f14401b;

    static {
        f14400a.add("us");
    }

    public static ig m18707a() {
        if (f14401b == null) {
            synchronized (ig.class) {
                if (f14401b == null) {
                    f14401b = new ig();
                }
            }
        }
        return f14401b;
    }

    public void m18712a(boolean z) {
        ThreadUtil.m19102b();
         SharedPrefHelper.m17454a().m17485a(z);
    }

    public boolean m18714b() {
        ThreadUtil.m19102b();
        return  SharedPrefHelper.m17454a().m17526j();
    }

    public void m18713b(boolean z) {
        ThreadUtil.m19102b();
         SharedPrefHelper.m17454a().m17490b(z);
    }

    public boolean m18716c() {
        ThreadUtil.m19102b();
        return  SharedPrefHelper.m17454a().m17529k();
    }

    public void m18715c(boolean z) {
        ThreadUtil.m19102b();
        if (!hh.m18640e()) {
             SharedPrefHelper a =  SharedPrefHelper.m17454a();
            a.m17495c(z);
            a.m17493c(System.currentTimeMillis());
            if (gz.m18604a() && z && !gz.m18606b()) {
                gz.m18607c();
            }
        }
    }

    public boolean m18717d() {
        ThreadUtil.m19102b();
        if (hh.m18640e()) {
            return false;
        }
        if (!gz.m18604a()) {
            return  SharedPrefHelper.m17454a().m17532l();
        }
        if ( SharedPrefHelper.m17454a().m17532l() && gz.m18606b()) {
            return true;
        }
        return false;
    }

    public void m18718e() {
        ThreadUtil.m19102b();
        try {
            Context a = MyApplicationLike.getApplication();
            Parcelable intent = new Intent(a, MainActivity.class);
            intent.setFlags(335544320);
            intent.putExtra("desktop_quick_clean", "desktop_quick_clean");
            Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            intent2.putExtra("duplicate", false);
            intent2.putExtra("android.intent.extra.shortcut.NAME", a.getString(R.string.quick_clean));
            intent2.putExtra("android.intent.extra.shortcut.ICON", BitmapFactory.decodeResource(a.getResources(), R.drawable.ic_quick_clean));
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
            a.sendBroadcast(intent2);
        } catch (Throwable th) {
        }
         SharedPrefHelper.m17454a().m17505e(false);
    }

    public void m18719f() {
        ThreadUtil.m19102b();
        hh.m18643h();
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=utility.quickest.phonebooster"));
            intent.setFlags(268435456);
            for (ResolveInfo resolveInfo : MyApplicationLike.getApplication().getPackageManager().queryIntentActivities(intent, 0)) {
                try {
                    if (resolveInfo.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
                        intent.addFlags(69206016);
                        break;
                    }
                } catch (Throwable th) {
                }
            }
            MyApplicationLike.getApplication().startActivity(intent);
        } catch (Throwable th2) {
        }
    }

    public void m18711a(String str, String str2, boolean z, ij ijVar) {
        ThreadUtil.m19102b();
        ThreadUtil.m19103c(new ih(this, C2490a.m18243a().m18244b(), (str == null ? "" : str.trim()) + "\n\n" + Build.MANUFACTURER + "," + Build.MODEL, str2, z, ijVar));
    }

    public il m18720g() {
        ThreadUtil.m19102b();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        il a2 = il.m18726b(a.m17463I());
        if (a2 == null) {
            a2 = il.Celsius;
            try {
                if (f14400a.contains(Locale.getDefault().getCountry().trim().toLowerCase())) {
                    a2 = il.Fahrenheit;
                }
            } catch (Throwable th) {
            }
            a.m17502e(a2.m18723a());
        }
        return a2;
    }

    public void m18710a(il ilVar) {
        ThreadUtil.m19102b();
        if (ilVar != null) {
             SharedPrefHelper.m17454a().m17502e(ilVar.m18723a());
            AlwaysNotiHelper.m18175c();
        }
    }

    private ig() {
    }

    private static void m18709b(C2443a c2443a, String str, String str2, boolean z, ik ikVar) {
        try {
            SubmitFeedbackRequest submitFeedbackRequest = new SubmitFeedbackRequest();
            submitFeedbackRequest.content = str;
            submitFeedbackRequest.email = str2;
            submitFeedbackRequest.fromSetting = Boolean.valueOf(z);
            as a = C2522c.m18847a().m18839a(C2542m.m19076a(c2443a.m17612b()), submitFeedbackRequest).mo1131a();
            if (a == null || !a.m2658a()) {
                ikVar.f14410a = -3;
            } else {
                ikVar.f14410a = 0;
            }
        } catch (IOException e) {
            ikVar.f14410a = -2;
        }
    }
}
