package utility.quickest.phonebooster.p114d;

import android.text.TextUtils;
import utility.quickest.phonebooster.network.response_data.AppUpdateServiceExpression;
import utility.quickest.phonebooster.util.AppUtil;
import java.io.File;
import org.json.JSONObject;

/* compiled from: AppUpdateInfo */
public final class C2447e {
    private final int f13085a;
    private final String f13086b;
    private final String f13087c;
    private final String f13088d;
    private final boolean f13089e;
    private final String f13090f;
    private final String f13091g;
    private final long f13092h;
    private final boolean f13093i;

    public static C2447e m17631a(AppUpdateServiceExpression appUpdateServiceExpression) {
        try {
            return new C2447e(appUpdateServiceExpression.VersionCode, appUpdateServiceExpression.VersionName, appUpdateServiceExpression.Title, appUpdateServiceExpression.Description, appUpdateServiceExpression.IgnoreGp, appUpdateServiceExpression.DownloadUrl, null, 0, false);
        } catch (Exception e) {
            return null;
        }
    }

    private C2447e(int i, String str, String str2, String str3, boolean z, String str4, String str5, long j, boolean z2) {
        if (i <= 10223) {
            throw new IllegalArgumentException("versionCode is less or equal than current!");
        }
        this.f13085a = i;
        this.f13086b = str == null ? "" : str.trim();
        this.f13087c = str2 == null ? "" : str2.trim();
        this.f13088d = str3 == null ? "" : str3.trim();
        this.f13089e = z;
        if (str4 != null) {
            str4 = str4.trim();
        }
        if (AppUtil.m19016a(true, this.f13089e) || !TextUtils.isEmpty(str4)) {
            if (str4 == null) {
                str4 = "";
            }
            this.f13090f = str4;
            this.f13091g = str5 == null ? "" : str5.trim();
            if (j < 0) {
                j = 0;
            }
            this.f13092h = j;
            this.f13093i = z2;
            return;
        }
        throw new IllegalArgumentException("downloadUrl is empty when not googleplay!");
    }

    public C2447e m17636a() {
        return new C2447e(this.f13085a, this.f13086b, this.f13087c, this.f13088d, this.f13089e, this.f13090f, this.f13091g, System.currentTimeMillis(), this.f13093i);
    }

    public C2447e m17638a(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return new C2447e(this.f13085a, this.f13086b, this.f13087c, this.f13088d, this.f13089e, this.f13090f, file.getAbsolutePath(), this.f13092h, this.f13093i);
        }
        return this;
    }

    public C2447e m17640b() {
        return new C2447e(this.f13085a, this.f13086b, this.f13087c, this.f13088d, this.f13089e, this.f13090f, this.f13091g, this.f13092h, true);
    }

    public C2447e m17637a(C2447e c2447e) {
        if (c2447e == null || c2447e == this || c2447e.m17641c() < this.f13085a) {
            return this;
        }
        String str;
        long j;
        boolean z;
        Object obj = c2447e.m17641c() == this.f13085a ? 1 : null;
        int c = c2447e.m17641c();
        String d = c2447e.m17642d();
        String e = c2447e.m17643e();
        String f = c2447e.m17644f();
        boolean g = c2447e.m17645g();
        String h = c2447e.m17646h();
        if (obj != null) {
            str = this.f13091g;
        } else {
            str = c2447e.m17647i();
        }
        if (obj != null) {
            j = this.f13092h;
        } else {
            j = c2447e.m17648j();
        }
        if (obj != null) {
            z = this.f13093i;
        } else {
            z = c2447e.m17649k();
        }
        return new C2447e(c, d, e, f, g, h, str, j, z);
    }

    public int m17641c() {
        return this.f13085a;
    }

    public String m17642d() {
        return this.f13086b;
    }

    public String m17643e() {
        return this.f13087c;
    }

    public String m17644f() {
        return this.f13088d;
    }

    public boolean m17645g() {
        return this.f13089e;
    }

    public String m17646h() {
        return this.f13090f;
    }

    public String m17647i() {
        return this.f13091g;
    }

    public long m17648j() {
        return this.f13092h;
    }

    public boolean m17649k() {
        return this.f13093i;
    }

    public boolean m17650l() {
        if (TextUtils.isEmpty(this.f13091g)) {
            return false;
        }
        File file = new File(this.f13091g);
        if (file.exists() && file.isFile()) {
            return true;
        }
        return false;
    }

    public boolean m17639a(boolean z) {
        if (z && System.currentTimeMillis() < this.f13092h + 259200000) {
            return false;
        }
        if (AppUtil.m19016a(true, this.f13089e)) {
            return true;
        }
        return m17650l();
    }

    public static String m17634b(C2447e c2447e) {
        return C2447e.m17635c(c2447e).toString();
    }

    public static C2447e m17632a(String str) {
        try {
            return C2447e.m17633a(new JSONObject(str));
        } catch (Exception e) {
            return null;
        }
    }

    private static JSONObject m17635c(C2447e c2447e) {
        JSONObject jSONObject = new JSONObject();
        if (c2447e != null) {
            try {
                jSONObject.put("vc", c2447e.m17641c());
                jSONObject.put("vn", c2447e.m17642d());
                jSONObject.put("ti", c2447e.m17643e());
                jSONObject.put("desc", c2447e.m17644f());
                jSONObject.put("iggp", c2447e.m17645g());
                jSONObject.put("du", c2447e.m17646h());
                jSONObject.put("ap", c2447e.m17647i());
                jSONObject.put("it", c2447e.m17648j());
                jSONObject.put("hsn", c2447e.m17649k());
            } catch (Exception e) {
            }
        }
        return jSONObject;
    }

    private static C2447e m17633a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C2447e(jSONObject.optInt("vc"), jSONObject.optString("vn"), jSONObject.optString("ti"), jSONObject.optString("desc"), jSONObject.optBoolean("iggp"), jSONObject.optString("du"), jSONObject.optString("ap"), jSONObject.optLong("it"), jSONObject.optBoolean("hsn"));
        } catch (Exception e) {
            return null;
        }
    }
}
