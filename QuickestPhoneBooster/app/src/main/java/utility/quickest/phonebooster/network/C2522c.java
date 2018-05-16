package utility.quickest.phonebooster.network;

import android.text.TextUtils;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import utility.quickest.phonebooster.model_helper.PatchModel;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.C2554z;
import utility.quickest.phonebooster.util.NetworkUtil;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.au;
import okhttp3.aw;
import p022b.av;
import p022b.p023a.p024a.C0431a;

/* compiled from: ServiceAccessor */
public final class C2522c {
    private static volatile C2521b f14518a = null;
    private static final Object f14519b = new Object();
    private static volatile C2520a f14520c = null;
    private static final Object f14521d = new Object();

    public static Map<String, String> m18849a(C2443a c2443a) {
        Map<String, String> hashMap = new HashMap();
         SharedPrefHelper a =  SharedPrefHelper.m17454a();
        if (c2443a != null) {
            hashMap.put("X-User-Id", C2542m.m19076a(c2443a.m17612b()));
        }
        hashMap.put("X-Device-Type", C2542m.m19076a(C2535e.m19032b()));
        hashMap.put("X-Device-Platform", C2542m.m19076a(C2535e.m19035c()));
        hashMap.put("X-Os-Api", C2542m.m19076a(C2535e.m19036d()));
        hashMap.put("X-Os-Version", C2542m.m19076a(C2535e.m19038e()));
        hashMap.put("X-Imei", C2542m.m19076a(C2535e.m19043h()));
        hashMap.put("X-Imsi", C2542m.m19076a(C2535e.m19044i()));
        hashMap.put("X-Android-Id", C2542m.m19076a(C2535e.m19045j()));
        hashMap.put("X-Dpi", C2542m.m19076a(C2535e.m19040f()));
        hashMap.put("X-Resolution", C2542m.m19076a(C2535e.m19042g()));
        hashMap.put("X-App-Package-Id", C2542m.m19076a("utility.quickest.phonebooster"));
        hashMap.put("X-App-Name", C2542m.m19076a(AppUtil.m19015a()));
        hashMap.put("X-APP-VERSION", C2542m.m19076a(AppUtil.m19017b()));
        hashMap.put("X-Net-Type", C2542m.m19076a(NetworkUtil.m18867a().m19095a()));
        hashMap.put("X-Operator-Desc", C2542m.m19076a(C2535e.m19056u()));
        hashMap.put("X-Location", C2542m.m19076a(C2535e.m19048m()));
        hashMap.put("X-TimeZone", C2542m.m19076a(C2554z.m19113a()));
        hashMap.put("X-Locale-Desc", C2542m.m19076a(C2535e.m19049n()));
        hashMap.put("X-Update-Version-code", C2542m.m19076a(AppUtil.m19018c()));
        hashMap.put("X-Init-Version", C2542m.m19076a(AppUtil.m19019d()));
        hashMap.put("X-Channel", C2542m.m19076a(AppUtil.m19020e()));
        hashMap.put("X-Google-AD-ID", C2542m.m19076a(C2535e.m19046k()));
        hashMap.put("X-Google-AD-Status", C2542m.m19076a(C2535e.m19047l()));
        hashMap.put("X-Fcm-Token", C2542m.m19076a(a.m17543r()));
        hashMap.put("X-Web-User-Agent", C2542m.m19076a(C2535e.m19055t()));
        hashMap.put("X-AF-MediaSource", C2542m.m19076a(a.m17457C()));
        hashMap.put("X-AF-Campaign", C2542m.m19076a(a.m17458D()));
        PatchModel.m18666a(hashMap);
        Set<String> hashSet = new HashSet();
        for (Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            CharSequence charSequence = (String) entry.getValue();
            if (charSequence != null) {
                charSequence = charSequence.trim();
            }
            if (TextUtils.isEmpty(charSequence)) {
                hashSet.add(str);
            }
        }
        for (String remove : hashSet) {
            hashMap.remove(remove);
        }
        return hashMap;
    }

    public static void m18850a(String str, String str2, C2443a c2443a) throws IOException {
        String b = C2522c.m18852b(str);
        if (!TextUtils.isEmpty(b)) {
            Object obj;
            Object obj2 = null;
            if (c2443a != null) {
                try {
                    if (new URL(b).getHost().toLowerCase().endsWith("goclean.tech".toLowerCase())) {
                        obj2 = 1;
                    }
                    obj = obj2;
                } catch (Throwable th) {
                    obj = null;
                }
            } else {
                obj = null;
            }
            ((C2525f) new av().m2676a(new aw().m22050a(new C2527g()).m22053b(new C2528h(str2)).m22051a(new PersistentCookieJar(new SetCookieCache(), new C2524e())).m22049a(15, TimeUnit.SECONDS).m22052b(15, TimeUnit.SECONDS).m22054c(15, TimeUnit.SECONDS).m22048a()).m2674a("https://api.goclean.tech").m2673a(C0431a.m2594a()).m2672a().m2667a(C2525f.class)).m18857a(b, obj != null ? C2542m.m19076a(c2443a.m17612b()) : null).mo1131a().m2659b();
        }
    }

    public static C2521b m18847a() {
        if (f14518a == null) {
            synchronized (f14519b) {
                if (f14518a == null) {
                    f14518a = (C2521b) new av().m2676a(new aw().m22050a(new C2526i()).m22049a(15, TimeUnit.SECONDS).m22052b(15, TimeUnit.SECONDS).m22054c(15, TimeUnit.SECONDS).m22048a()).m2674a("https://api.goclean.tech").m2673a(C0431a.m2594a()).m2672a().m2667a(C2521b.class);
                }
            }
        }
        return f14518a;
    }

    public static C2520a m18851b() {
        if (f14520c == null) {
            synchronized (f14521d) {
                if (f14520c == null) {
                    f14520c = (C2520a) new av().m2676a(new aw().m22050a(new C2526i()).m22049a(15, TimeUnit.SECONDS).m22052b(15, TimeUnit.SECONDS).m22054c(15, TimeUnit.SECONDS).m22048a()).m2674a("https://logging.goclean.tech").m2673a(C0431a.m2594a()).m2672a().m2667a(C2520a.class);
                }
            }
        }
        return f14520c;
    }

    public static au m18853c() {
        return new aw().m22049a(15, TimeUnit.SECONDS).m22052b(15, TimeUnit.SECONDS).m22054c(15, TimeUnit.SECONDS).m22048a();
    }

    private static String m18852b(String str) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (str.toLowerCase().startsWith("market://")) {
                return "https://play.google.com/store/apps/" + str.substring("market://".length());
            }
            return str;
        } catch (Throwable th) {
            return str;
        }
    }
}
