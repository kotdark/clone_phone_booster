package utility.quickest.phonebooster.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.multidex.MultiDex;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import io.fabric.sdk.android.Fabric;
import utility.quickest.phonebooster.model_helper.AlwaysNotiHelper;
import utility.quickest.phonebooster.model_helper.AppModificationHelper;
import utility.quickest.phonebooster.model_helper.C2490a;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.dh;
import utility.quickest.phonebooster.model_helper.dr;
import utility.quickest.phonebooster.model_helper.et;
import utility.quickest.phonebooster.model_helper.fl;
import utility.quickest.phonebooster.model_helper.fw;
import utility.quickest.phonebooster.model_helper.gz;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.PatchModel;
import utility.quickest.phonebooster.model_helper.hq;
import utility.quickest.phonebooster.model_helper.hw;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.model_helper.id;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.model_helper.jm;
import utility.quickest.phonebooster.model_helper.jt;
import utility.quickest.phonebooster.p111a.C2381a;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.C2554z;
import com.mopub.mobileads.VastIconXmlManager;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplicationLike */
public final class MyApplicationLike {
    private static volatile MyApplicationLike myApplicationLike = null;
    private final Application application;
    private int f12977c = 0;
    private final AtomicBoolean f12978d = new AtomicBoolean(false);
    private String f12979e = "FromBackground";
    private boolean f12980f = true;
    private C2428p f12981g = null;
    private final Runnable f12982h = new C2417e(this);
    private final Runnable f12983i = new C2420h(this);
    private final Runnable f12984j = new C2421i(this);

    public static Application getApplication() {
        return myApplicationLike.application;
    }

    public static MyApplicationLike m17418b() {
        return myApplicationLike;
    }

    public MyApplicationLike(Application application) {
        myApplicationLike = this;
        this.application = application;
    }

    public void m17432c() {
        ThreadUtil.m19102b();
        try {
            AppsFlyerLib instance = AppsFlyerLib.getInstance();
            if (!AppUtil.m19016a(false, false)) {
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CHANNEL, AppUtil.m19021f());
            }
            instance.setCustomerUserId(C2490a.m18243a().m18244b().m17612b());
            instance.setCollectAndroidID(true);
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_MAC, true);
            instance.init("wMmuvvbJBfh74NAMnNJkFb", null);
            instance.startTracking(MyApplicationLike.getApplication(), "wMmuvvbJBfh74NAMnNJkFb");
            instance.reportTrackSession(MyApplicationLike.getApplication());
        } catch (Throwable th) {
        }
        try {
            Fabric.with(MyApplicationLike.getApplication(), new Answers(), new Crashlytics());
        } catch (Throwable th2) {
        }
        if (AppUtil.m19023h()) {
            C2381a.m17248a();
            m17424i();
            ThreadUtil.m19097a("ChannelLog", new C2422j(this));
            try {
                FacebookSdk.setApplicationId("1394494647308002");
                FacebookSdk.sdkInitialize(MyApplicationLike.getApplication());
                AppEventsLogger.activateApp(MyApplicationLike.getApplication());
            } catch (Throwable th3) {
            }
            try {
                MyApplicationLike.getApplication().startService(new Intent(MyApplicationLike.getApplication(), KeepAliveService.class));
            } catch (Throwable th4) {
            }
            PatchModel.m18667b();
            hq.m18670a();
            hw.m18677a();
            hh.m18625a();
            C2492b.m18285a();
            fw.m18560a();
            jt.m18785a();
            dh.m18433a();
            jm.m18760a();
            fl.m18526a().m18539a(new C2423k(this));
            et.m18483a().m18512a(new C2424l(this));
            C2492b.m18285a().m18322a(new C2425m(this));
            C2492b.m18285a().m18323a(new C2426n(this));
            gz.m18603a(new C2427o(this));
            ThreadUtil.m19098a(this.f12982h, 30000);
            ThreadUtil.m19098a(this.f12984j, 30000);
            ThreadUtil.m19098a(this.f12983i, 60000);
            AppUtil.m19024i();
            dr.m18448a().m18467b();
            hz.m18683a();
            hh.m18651p();
            AppModificationHelper.m18183a();
            AlwaysNotiHelper.m18170a(new C2418f(this));
            AlwaysNotiHelper.m18175c();
        }
    }

    public void m17428a(Context context) {
        ThreadUtil.m19102b();
        MultiDex.install(context);
        PatchModel.m18665a();
    }

    public boolean m17433d() {
        return this.f12978d.get();
    }

    public Pair<String, String> m17434e() {
        String obj;
        String obj2;
        ThreadUtil.m19102b();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        String M = a.m17467M();
        String N = a.m17468N();
        if (M == null) {
            obj = "";
        } else {
            obj = M.trim();
        }
        if (N == null) {
            obj2 = "";
        } else {
            obj2 = N.trim();
        }
        return new Pair(obj, obj2);
    }

    public void m17429a(String str) {
        ThreadUtil.m19102b();
        if (str != null) {
            str = str.trim();
        }
        if (!TextUtils.isEmpty(str)) {
             SharedPrefHelper a =  SharedPrefHelper.m17454a();
            a.m17513g(UUID.randomUUID().toString());
            a.m17517h(str);
            a.m17542q(System.currentTimeMillis());
        }
    }

    public void m17431b(String str) {
        ThreadUtil.m19102b();
        if (str != null) {
            str = str.trim();
        }
        if (!TextUtils.isEmpty(str)) {
            this.f12979e = str;
        }
    }

    public C2428p m17435f() {
        C2428p c2428p;
        ThreadUtil.m19102b();
        if (this.f12980f) {
            c2428p = this.f12981g;
        } else {
            c2428p = null;
        }
        this.f12980f = false;
        this.f12981g = null;
        return c2428p;
    }

    public void m17430a(String str, long j) {
        ThreadUtil.m19102b();
        if (this.f12980f) {
            this.f12981g = C2428p.m17451b(str);
        }
        try {
            String str2;
            if (!this.f12980f) {
                str2 = "expire-" + str;
            } else if (this.f12981g == null) {
                str2 = "invalid-" + str;
            } else {
                str2 = "valid-" + str;
            }
            CustomEvent customEvent = (CustomEvent) new CustomEvent("DevSetAFDeepLink").putCustomAttribute("value", str2);
            if (!TextUtils.isEmpty(str)) {
                customEvent.putCustomAttribute(VastIconXmlManager.DURATION, j);
            }
            Answers.getInstance().logCustom(customEvent);
        } catch (Throwable th) {
        }
    }

    public boolean m17436g() {
        ThreadUtil.m19102b();
        boolean z = false;
        if (this.f12977c == 0) {
            z = true;
        }
        this.f12977c++;
        if (z) {
            this.f12978d.set(true);
             SharedPrefHelper a =  SharedPrefHelper.m17454a();
            long currentTimeMillis = System.currentTimeMillis();
            a.m17465K();
            long L = currentTimeMillis - a.m17466L();
            if (L < 0) {
                L = 0;
            }
            if (L > 30000) {
                a.m17539p(currentTimeMillis);
                a.m17542q(0);
                a.m17513g(UUID.randomUUID().toString());
                a.m17517h(this.f12979e);
                this.f12979e = "FromBackground";
            }
            PatchModel.m18669d();
        }
        return z;
    }

    public boolean m17437h() {
        ThreadUtil.m19102b();
        this.f12977c--;
        boolean z = this.f12977c == 0;
        if (z) {
            this.f12978d.set(false);
             SharedPrefHelper.m17454a().m17542q(System.currentTimeMillis());
            PatchModel.m18668c();
        }
        return z;
    }

    private void m17424i() {
        ThreadUtil.m19102b();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        int c = a.m17491c();
        if (c <= 0) {
            a.m17492c(10223);
        }
        if (c != 10223) {
            a.m17481a(10223);
            a.m17487b(c);
            a.m17482a(System.currentTimeMillis());
        }
    }

    private void m17425j() {
        ThreadUtil.m19102b();
        if (!hh.m18640e()) {
             SharedPrefHelper a =  SharedPrefHelper.m17454a();
            if (C2554z.m19115b(a.m17545s()) != C2554z.m19115b(System.currentTimeMillis())) {
                try {
                    Answers.getInstance().logCustom((CustomEvent) new CustomEvent("LockedScreenEnableState10083").putCustomAttribute("value", ig.m18707a().m18717d() ? "enable" : "disable"));
                } catch (Throwable th) {
                }
                C2542m.m19084a("locked_screen", "enable_state", null, null, ig.m18707a().m18717d());
                a.m17503e(System.currentTimeMillis());
            }
        }
    }

    private void m17426k() {
        ThreadUtil.m19102b();
        if (hz.m18683a().m18693a(id.AlwaysNoti)) {
             SharedPrefHelper a =  SharedPrefHelper.m17454a();
            if (C2554z.m19115b(a.aa()) != C2554z.m19115b(System.currentTimeMillis())) {
                boolean b = AlwaysNotiHelper.m18174b();
                try {
                    Answers.getInstance().logCustom((CustomEvent) new CustomEvent("AlwaysNotiEnableState").putCustomAttribute("value", b ? "enable" : "disable"));
                } catch (Throwable th) {
                }
                if (b) {
                    try {
                        Answers.getInstance().logCustom(new CustomEvent("AlwaysNotiUser"));
                    } catch (Throwable th2) {
                    }
                }
                C2542m.m19084a("always_noti", "enable_state", null, null, b);
                a.m17554w(System.currentTimeMillis());
            }
        }
    }

    private void m17427l() {
        ThreadUtil.m19102b();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        if (C2554z.m19115b(a.ab()) != C2554z.m19115b(System.currentTimeMillis())) {
            try {
                Answers.getInstance().logCustom((CustomEvent) new CustomEvent("CleanNotiEnableState").putCustomAttribute("value", ig.m18707a().m18714b() ? "enable" : "disable"));
            } catch (Throwable th) {
            }
            C2542m.m19084a("clean_noti", "enable_state", null, null, ig.m18707a().m18714b());
            a.m17556x(System.currentTimeMillis());
        }
    }
}
