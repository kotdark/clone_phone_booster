package utility.quickest.phonebooster.model_helper;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.C2212b;
import com.google.firebase.remoteconfig.C2289a;
import com.google.firebase.remoteconfig.C2291c;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: RuntimeRemoteConfigModel */
public final class hz {
    private static final long f14368a = (C2542m.m19090b() ? 30 : 21600);
    private static volatile hz f14369b = null;
    private static final Handler f14370e = new Handler(Looper.getMainLooper());
    private static final List<Pair<C2503if, C2503if>> f14371h = new ArrayList();
    private final C2289a f14372c = m18689g();
    private long f14373d = 0;
    private final C2212b<Void> f14374f = new ia(this);
    private final Runnable f14375g = new ic(this);
    private Pair<C2503if, C2503if> f14376i = null;
    private String f14377j = null;
    private Boolean f14378k = null;
    private Boolean f14379l = null;

    static {
        f14371h.add(new Pair(C2503if.Junk, C2503if.AntiVirus));
        f14371h.add(new Pair(C2503if.Junk, C2503if.Process));
        f14371h.add(new Pair(C2503if.Junk, C2503if.CpuCool));
        f14371h.add(new Pair(C2503if.Junk, C2503if.SavePower));
        f14371h.add(new Pair(C2503if.AntiVirus, C2503if.Process));
        f14371h.add(new Pair(C2503if.Process, C2503if.CpuCool));
        f14371h.add(new Pair(C2503if.Process, C2503if.SavePower));
        f14371h.add(new Pair(C2503if.CpuCool, C2503if.AntiVirus));
        f14371h.add(new Pair(C2503if.SavePower, C2503if.CpuCool));
        f14371h.add(new Pair(C2503if.AntiVirus, C2503if.SavePower));
    }

    public static hz m18683a() {
        if (f14369b == null) {
            synchronized (hz.class) {
                if (f14369b == null) {
                    f14369b = new hz();
                }
            }
        }
        return f14369b;
    }

    public boolean m18693a(id idVar) {
        ThreadUtil.m19102b();
        if (idVar == null) {
            return false;
        }
        if (!idVar.mIsEnabled || TextUtils.isEmpty(idVar.mKey)) {
            return idVar.mDefaultValue;
        }
        if (C2542m.m19090b()) {
            String[] split;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(Environment.getExternalStorageDirectory(), "QueenOfLiaoHan.txt")));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        try {
                            split = readLine.split("=");
                            if (idVar.mKey.equals(split[0].trim())) {
                                break;
                            }
                        } catch (Throwable th) {
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                }
            }
            try {
                String trim = split[1].trim();
                boolean z = true;
                switch (trim.hashCode()) {
                    case 48:
                        if (trim.equals("0")) {
                            z = false;
                            break;
                        }
                        break;
                    case 49:
                        if (trim.equals("1")) {
                            z = true;
                            break;
                        }
                        break;
                }
                switch (z) {
                    case false:
                        bufferedReader.close();
                        return false;
                    case true:
                        bufferedReader.close();
                        return true;
                    default:
                        break;
                }
            } catch (Throwable th3) {
            }
            bufferedReader.close();
        }
        if (id.JunkScanQuick.equals(idVar)) {
            return m18690h();
        }
        if (id.AlwaysNoti.equals(idVar)) {
            return m18691i();
        }
        try {
            return this.f14372c.m16834b(idVar.mKey);
        } catch (Throwable th4) {
            return idVar.mDefaultValue;
        }
    }

    public long m18692a(ie ieVar) {
        ThreadUtil.m19102b();
        if (ieVar == null) {
            return 0;
        }
        long c;
        if (!ieVar.mIsEnabled || TextUtils.isEmpty(ieVar.mKey)) {
            c = ieVar.mDefaultValue;
        } else {
            try {
                c = this.f14372c.m16826a(ieVar.mKey);
            } catch (Throwable th) {
                c = ieVar.mDefaultValue;
            }
        }
        if (c < ieVar.mMinValue) {
            return ieVar.mMinValue;
        }
        if (c > ieVar.mMaxValue) {
            return ieVar.mMaxValue;
        }
        return c;
    }

    public Map<String, String> m18694b() {
        int i = 0;
        ThreadUtil.m19102b();
        Map<String, String> hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            for (id idVar : id.values()) {
                jSONObject.put(idVar.mKey, m18693a(idVar));
            }
            for (ie ieVar : ie.values()) {
                jSONObject.put(ieVar.mKey, m18692a(ieVar));
            }
            jSONObject.put("ls_quick_fun", m18696d());
            String jSONObject2 = jSONObject.toString();
            while (i < 100) {
                if (jSONObject2.length() >= 90) {
                    hashMap.put("ab_status_" + i, jSONObject2.substring(0, 90));
                    jSONObject2 = jSONObject2.substring(90);
                    i++;
                } else {
                    if (jSONObject2.length() > 0) {
                        hashMap.put("ab_status_" + i, jSONObject2);
                    }
                    return hashMap;
                }
            }
        } catch (Throwable th) {
        }
        return hashMap;
    }

    public Pair<C2503if, C2503if> m18695c() {
        ThreadUtil.m19102b();
        return null;
    }

    public String m18696d() {
        ThreadUtil.m19102b();
        if (this.f14377j != null) {
            return this.f14377j;
        }
        Pair c = m18695c();
        if (c == null) {
            this.f14377j = "";
        } else {
            this.f14377j = ((C2503if) c.first).mId + "-" + ((C2503if) c.second).mId;
        }
        return this.f14377j;
    }

    private hz() {
        f14370e.removeCallbacks(this.f14375g);
        this.f14375g.run();
    }

    private C2289a m18689g() {
        int i = 0;
        Map hashMap = new HashMap();
        for (id idVar : id.values()) {
            if (!(idVar == null || !idVar.mIsEnabled || TextUtils.isEmpty(idVar.mKey))) {
                hashMap.put(idVar.mKey, Boolean.valueOf(idVar.mDefaultValue));
            }
        }
        ie[] values = ie.values();
        int length = values.length;
        while (i < length) {
            ie ieVar = values[i];
            if (!(ieVar == null || !ieVar.mIsEnabled || TextUtils.isEmpty(ieVar.mKey))) {
                hashMap.put(ieVar.mKey, Long.valueOf(ieVar.mDefaultValue));
            }
            i++;
        }
        C2289a c2289a = null;
        try {
            c2289a = C2289a.m16820a();
            try {
                if (C2542m.m19090b()) {
                    c2289a.m16830a(new C2291c().m16839a(true).m16838a());
                }
            } catch (Throwable th) {
            }
            c2289a.m16831a(hashMap);
        } catch (Throwable th2) {
        }
        return c2289a;
    }

    private boolean m18690h() {
        boolean z = false;
        ThreadUtil.m19102b();
        if (this.f14378k == null) {
            try {
                String b = C2490a.m18243a().m18244b().m17612b();
                if (Integer.parseInt(b.substring(b.length() - 1)) < 8) {
                    z = true;
                }
            } catch (Throwable th) {
            }
            this.f14378k = Boolean.valueOf(z);
        }
        return this.f14378k.booleanValue();
    }

    private boolean m18691i() {
        boolean z = false;
        ThreadUtil.m19102b();
        if (this.f14379l == null) {
            try {
                String b = C2490a.m18243a().m18244b().m17612b();
                if (Integer.parseInt(b.substring(b.length() - 2, b.length() - 1)) < 8) {
                    z = true;
                }
            } catch (Throwable th) {
            }
            this.f14379l = Boolean.valueOf(z);
        }
        return this.f14379l.booleanValue();
    }
}
