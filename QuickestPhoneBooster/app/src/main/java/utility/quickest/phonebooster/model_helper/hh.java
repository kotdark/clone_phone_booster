package utility.quickest.phonebooster.model_helper;

import android.app.Activity;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.network.request_data.UploadInstalledAppRequest;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.C2554z;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.mobileads.VastExtensionXmlManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import org.json.JSONObject;
import p022b.as;

/* compiled from: MiscHelper */
public final class hh {
    private static boolean f14320a = false;
    private static final String[] f14321b = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final EnumMap<hm, Long> f14322c = new EnumMap(hm.class);
    private static final hn f14323d;
    private static Map<String, Long> f14324e = null;
    private static Map<String, Long> f14325f = null;
    private static long f14326g = -1;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r3 = 1;
        r1 = 0;
        r0 = 0;
        f14320a = r0;
        r2 = 2;
        r2 = new java.lang.String[r2];
        r4 = "android.permission.READ_EXTERNAL_STORAGE";
        r2[r0] = r4;
        r4 = "android.permission.WRITE_EXTERNAL_STORAGE";
        r2[r3] = r4;
        f14321b = r2;
        r2 = new java.util.EnumMap;
        r4 = utility.quickest.phonebooster.model_helper.hm.class;
        r2.<init>(r4);
        f14322c = r2;
        r2 = "b";
        r2 = r2.trim();	 Catch:{ Throwable -> 0x005f }
        r4 = r2.toLowerCase();	 Catch:{ Throwable -> 0x005f }
        r2 = -1;
        r5 = r4.hashCode();	 Catch:{ Throwable -> 0x005f }
        switch(r5) {
            case 97: goto L_0x0044;
            case 98: goto L_0x004e;
            default: goto L_0x0030;
        };
    L_0x0030:
        r0 = r2;
    L_0x0031:
        switch(r0) {
            case 0: goto L_0x0059;
            case 1: goto L_0x005c;
            default: goto L_0x0034;
        };
    L_0x0034:
        r0 = r1;
    L_0x0035:
        if (r0 != 0) goto L_0x0039;
    L_0x0037:
        r0 = utility.quickest.phonebooster.model_helper.hn.STYLE_A;
    L_0x0039:
        f14323d = r0;
        f14324e = r1;
        f14325f = r1;
        r0 = -1;
        f14326g = r0;
        return;
    L_0x0044:
        r3 = "a";
        r3 = r4.equals(r3);	 Catch:{ Throwable -> 0x005f }
        if (r3 == 0) goto L_0x0030;
    L_0x004d:
        goto L_0x0031;
    L_0x004e:
        r0 = "b";
        r0 = r4.equals(r0);	 Catch:{ Throwable -> 0x005f }
        if (r0 == 0) goto L_0x0030;
    L_0x0057:
        r0 = r3;
        goto L_0x0031;
    L_0x0059:
        r0 = utility.quickest.phonebooster.model_helper.hn.STYLE_A;	 Catch:{ Throwable -> 0x005f }
        goto L_0x0035;
    L_0x005c:
        r0 = utility.quickest.phonebooster.model_helper.hn.STYLE_B;	 Catch:{ Throwable -> 0x005f }
        goto L_0x0035;
    L_0x005f:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: utility.quickest.phonebooster.model_helper.hh.<clinit>():void");
    }

    public static void m18625a() {
        ThreadUtil.m19102b();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        if (System.currentTimeMillis() - a.m17519i() >= 604800000 && !f14320a) {
            f14320a = true;
            ThreadUtil.m19103c(new hi(C2490a.m18243a().m18244b(), a));
        }
    }

    private static boolean m18636b(C2443a c2443a) {
        try {
            UploadInstalledAppRequest uploadInstalledAppRequest = new UploadInstalledAppRequest();
            uploadInstalledAppRequest.userId = c2443a.m17612b();
            uploadInstalledAppRequest.installed = C2535e.m19030a(false);
            as a = C2522c.m18847a().m18840a(C2542m.m19076a(c2443a.m17612b()), uploadInstalledAppRequest).mo1131a();
            if (a == null || !a.m2658a()) {
                return false;
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static void m18627a(Activity activity) {
        ThreadUtil.m19102b();
        if (ViewUtil.m18936a(activity) && activity != null) {
            List arrayList = new ArrayList();
            for (String str : f14321b) {
                try {
                    if (ContextCompat.checkSelfPermission(activity, str) != 0) {
                        arrayList.add(str);
                    }
                } catch (Throwable th) {
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    ActivityCompat.requestPermissions(activity, (String[]) arrayList.toArray(new String[0]), 0);
                } catch (Throwable th2) {
                }
            }
        }
    }

    public static boolean m18635b() {
        ThreadUtil.m19102b();
        if (m18640e() || !AppUtil.m19016a(true, false)) {
            return false;
        }
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        if (ig.m18707a().m18717d() || !a.m17548t()) {
            return false;
        }
        a.m17510f(false);
        a.m17498d(System.currentTimeMillis());
        a.m17493c(System.currentTimeMillis());
        return true;
    }

    public static boolean m18638c() {
        ThreadUtil.m19102b();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        if (!a.m17540p()) {
            return false;
        }
        if (AppUtil.m19016a(true, false)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (C2554z.m19112a(a.m17541q(), currentTimeMillis) < 6) {
                return false;
            }
            a.m17498d(currentTimeMillis);
            return true;
        }
        a.m17505e(false);
        return true;
    }

    public static boolean m18639d() {
        ThreadUtil.m19102b();
        if (m18640e()) {
            return false;
        }
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        long currentTimeMillis = System.currentTimeMillis();
        if (ig.m18707a().m18717d()) {
            a.m17493c(currentTimeMillis);
            return false;
        } else if (C2554z.m19112a(a.m17533m(), currentTimeMillis) < 6) {
            return false;
        } else {
            a.m17493c(currentTimeMillis);
            return true;
        }
    }

    public static boolean m18640e() {
        ThreadUtil.m19102b();
        return  SharedPrefHelper.m17454a().m17501e() >= hw.m18677a().m18679a("key_no_ls_version", 1000000);
    }

    public static boolean m18641f() {
        ThreadUtil.m19102b();
        return hw.m18677a().m18680a("key_display_ads", false);
    }

    public static boolean m18642g() {
        ThreadUtil.m19102b();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        long currentTimeMillis = System.currentTimeMillis();
        if (a.m17558z()) {
            return false;
        }
        int B = a.m17456B();
        if (B >= 5) {
            return false;
        }
        long A = a.m17455A();
        if (A == 0) {
            a.m17527k(currentTimeMillis);
            A = currentTimeMillis;
        }
        if (C2554z.m19112a(A, currentTimeMillis) < 14) {
            return false;
        }
        a.m17527k(currentTimeMillis);
        a.m17497d(B + 1);
        return true;
    }

    public static void m18643h() {
        ThreadUtil.m19102b();
         SharedPrefHelper.m17454a().m17514g(true);
    }

    public static void m18644i() {
    }

    public static void m18628a(hm hmVar) {
        ThreadUtil.m19102b();
        if (hmVar != null) {
            f14322c.put(hmVar, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public static boolean m18637b(hm hmVar) {
        ThreadUtil.m19102b();
        if (hmVar == null) {
            return true;
        }
        Long l = (Long) f14322c.get(hmVar);
        if (l == null) {
            return true;
        }
        return SystemClock.elapsedRealtime() - l.longValue() >= hmVar.m18662a();
    }

    public static hn m18645j() {
        return f14323d;
    }

    public static boolean m18646k() {
        ThreadUtil.m19102b();
        return  SharedPrefHelper.m17454a().m17462H();
    }

    public static void m18647l() {
        ThreadUtil.m19102b();
         SharedPrefHelper.m17454a().m17522i(true);
    }

    public static void m18648m() {
        ThreadUtil.m19102b();
         SharedPrefHelper.m17454a().m17534m(System.currentTimeMillis());
    }

    public static void m18649n() {
        ThreadUtil.m19102b();
         SharedPrefHelper.m17454a().m17537o(System.currentTimeMillis());
    }

    public static boolean m18650o() {
        ThreadUtil.m19102b();
        return AppUtil.m19025j() && AppUtil.m19026k() <= 259200000;
    }

    public static void m18630a(String str) {
        if (m18650o()) {
            try {
                CustomEvent customEvent = new CustomEvent("main_click_new");
                customEvent.putCustomAttribute(VastExtensionXmlManager.TYPE, str);
                Answers.getInstance().logCustom(customEvent);
                return;
            } catch (Throwable th) {
                return;
            }
        }
        try {
            customEvent = new CustomEvent("main_click_old");
            customEvent.putCustomAttribute(VastExtensionXmlManager.TYPE, str);
            Answers.getInstance().logCustom(customEvent);
        } catch (Throwable th2) {
        }
    }

    public static void m18651p() {
        ThreadUtil.m19102b();
        ThreadUtil.m19096a(new hk());
    }

    public static void m18629a(ho hoVar) {
        ThreadUtil.m19102b();
        if (hoVar != null) {
            if (f14324e == null) {
                f14324e = m18659x();
            }
            f14324e.put(hoVar.name(), Long.valueOf(System.currentTimeMillis()));
            m18661z();
            if (f14325f == null) {
                f14325f = m18660y();
            }
            m18623B();
            Long l = (Long) f14325f.get(hoVar.name());
            if (l == null) {
                f14325f.put(hoVar.name(), Long.valueOf(1));
            } else {
                f14325f.put(hoVar.name(), Long.valueOf(l.longValue() + 1));
            }
            m18622A();
        }
    }

    public static ho m18633b(ho hoVar) {
        Long l;
        ThreadUtil.m19102b();
        if (f14324e == null) {
            f14324e = m18659x();
        }
        if (f14325f == null) {
            f14325f = m18660y();
        }
        if (m18623B()) {
            m18622A();
        }
        long currentTimeMillis = System.currentTimeMillis();
        EnumSet noneOf = EnumSet.noneOf(ho.class);
        for (ho hoVar2 : ho.values()) {
            if (hoVar2.mIsBase && !hoVar2.equals(hoVar)) {
                l = (Long) f14324e.get(hoVar2.name());
                if (l == null) {
                    noneOf.add(hoVar2);
                } else if (Math.abs(currentTimeMillis - l.longValue()) > 300000) {
                    noneOf.add(hoVar2);
                }
            }
        }
        List arrayList;
        long longValue;
        if (noneOf.isEmpty()) {
            List arrayList2 = new ArrayList();
            if ( SharedPrefHelper.m17454a().m17540p()) {
                arrayList2.add(ho.OneKey);
            }
            if (!(m18640e() || ig.m18707a().m18717d())) {
                arrayList2.add(ho.LockedScreen);
            }
            if (hz.m18683a().m18693a(id.AlwaysNoti) && !AlwaysNotiHelper.m18174b()) {
                arrayList2.add(ho.AlwaysNoti);
            }
            if (hoVar != null) {
                arrayList2.remove(hoVar);
            }
            if (!arrayList2.isEmpty()) {
                return (ho) arrayList2.get(new Random().nextInt(arrayList2.size()));
            }
            arrayList = new ArrayList();
            currentTimeMillis = Long.MAX_VALUE;
            ho[] values = ho.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                ho hoVar3 = values[i];
                if (hoVar3.mIsBase && !hoVar3.equals(hoVar)) {
                    l = (Long) f14325f.get(hoVar3.name());
                    if (l == null) {
                        l = Long.valueOf(0);
                    }
                    if (l.longValue() < currentTimeMillis) {
                        longValue = l.longValue();
                        arrayList.clear();
                        arrayList.add(hoVar3);
                        i++;
                        currentTimeMillis = longValue;
                    } else if (l.longValue() == currentTimeMillis) {
                        arrayList.add(hoVar3);
                    }
                }
                longValue = currentTimeMillis;
                i++;
                currentTimeMillis = longValue;
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return (ho) arrayList.get(new Random().nextInt(arrayList.size()));
        }
        arrayList = new ArrayList();
        Iterator it = noneOf.iterator();
        currentTimeMillis = Long.MAX_VALUE;
        while (it.hasNext()) {
            ho hoVar4 = (ho) it.next();
            Long l2 = (Long) f14325f.get(hoVar4.name());
            if (l2 == null) {
                l2 = Long.valueOf(0);
            }
            if (l2.longValue() < currentTimeMillis) {
                currentTimeMillis = l2.longValue();
                arrayList.clear();
                arrayList.add(hoVar4);
                longValue = currentTimeMillis;
            } else {
                if (l2.longValue() == currentTimeMillis) {
                    arrayList.add(hoVar4);
                }
                longValue = currentTimeMillis;
            }
            currentTimeMillis = longValue;
        }
        return (ho) arrayList.get(new Random().nextInt(arrayList.size()));
    }

    private static Map<String, Long> m18659x() {
        Map<String, Long> hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject( SharedPrefHelper.m17454a().m17470P());
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str != null) {
                    hashMap.put(str.trim(), Long.valueOf(jSONObject.optLong(str)));
                }
            }
        } catch (Throwable th) {
        }
        return hashMap;
    }

    private static Map<String, Long> m18660y() {
        Map<String, Long> hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject( SharedPrefHelper.m17454a().m17471Q());
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str != null) {
                    hashMap.put(str.trim(), Long.valueOf(jSONObject.optLong(str)));
                }
            }
        } catch (Throwable th) {
        }
        return hashMap;
    }

    private static void m18661z() {
        String jSONObject;
        ThreadUtil.m19102b();
        try {
            if (f14324e != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Entry entry : f14324e.entrySet()) {
                    if (entry != null) {
                        Object obj = (String) entry.getKey();
                        Long l = (Long) entry.getValue();
                        if (obj != null) {
                            obj = obj.trim();
                        }
                        if (!(TextUtils.isEmpty(obj) || l == null)) {
                            jSONObject2.put(obj, l.longValue());
                        }
                    }
                }
                jSONObject = jSONObject2.toString();
            } else {
                jSONObject = null;
            }
        } catch (Throwable th) {
            jSONObject = null;
        }
         SharedPrefHelper.m17454a().m17521i(jSONObject);
    }

    private static void m18622A() {
        String jSONObject;
        ThreadUtil.m19102b();
        try {
            if (f14325f != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Entry entry : f14325f.entrySet()) {
                    if (entry != null) {
                        Object obj = (String) entry.getKey();
                        Long l = (Long) entry.getValue();
                        if (obj != null) {
                            obj = obj.trim();
                        }
                        if (!(TextUtils.isEmpty(obj) || l == null)) {
                            jSONObject2.put(obj, l.longValue());
                        }
                    }
                }
                jSONObject = jSONObject2.toString();
            } else {
                jSONObject = null;
            }
        } catch (Throwable th) {
            jSONObject = null;
        }
         SharedPrefHelper.m17454a().m17524j(jSONObject);
    }

    private static boolean m18623B() {
        ThreadUtil.m19102b();
        if (f14325f == null) {
            return false;
        }
        Long l = (Long) f14325f.get("func_hint_ct");
        if (l == null) {
            l = Long.valueOf(0);
        }
        long b = C2554z.m19115b(System.currentTimeMillis());
        if (b == C2554z.m19115b(l.longValue())) {
            return false;
        }
        f14325f.clear();
        f14325f.put("func_hint_ct", Long.valueOf(b));
        return true;
    }

    public static void m18626a(long j) {
        ThreadUtil.m19102b();
        f14326g = j;
    }

    public static Long m18652q() {
        ThreadUtil.m19102b();
        long j = f14326g;
        f14326g = -1;
        if (j < 209715200) {
            return null;
        }
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        long currentTimeMillis = System.currentTimeMillis();
        if (a.m17475U() >= 3 || Math.abs(currentTimeMillis - a.m17474T()) < 604800000 || C2554z.m19115b(currentTimeMillis) == C2554z.m19115b(a.m17473S())) {
            return null;
        }
        a.m17544r(currentTimeMillis);
        return Long.valueOf(j);
    }

    public static void m18653r() {
        ThreadUtil.m19102b();
         SharedPrefHelper.m17454a().m17546s(System.currentTimeMillis());
    }

    public static void m18654s() {
        ThreadUtil.m19102b();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        a.m17507f(a.m17475U() + 1);
    }
}
