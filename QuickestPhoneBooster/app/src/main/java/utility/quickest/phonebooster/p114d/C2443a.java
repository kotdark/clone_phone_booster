package utility.quickest.phonebooster.p114d;

import android.text.TextUtils;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: AccountInfo */
public final class C2443a {
    private final String f13071a;

    public static C2443a m17607a() {
        try {
            return new C2443a(UUID.randomUUID().toString());
        } catch (Exception e) {
            return null;
        }
    }

    private C2443a(String str) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id is empty!");
        }
        this.f13071a = str;
    }

    public String m17612b() {
        return this.f13071a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2443a) {
            return this.f13071a.equals(((C2443a) obj).f13071a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13071a.hashCode();
    }

    public static String m17610a(C2443a c2443a) {
        return C2443a.m17611b(c2443a).toString();
    }

    public static C2443a m17608a(String str) {
        try {
            return C2443a.m17609a(new JSONObject(str));
        } catch (Exception e) {
            return null;
        }
    }

    private static JSONObject m17611b(C2443a c2443a) {
        JSONObject jSONObject = new JSONObject();
        if (c2443a != null) {
            try {
                jSONObject.put("a_id", c2443a.m17612b());
            } catch (Exception e) {
            }
        }
        return jSONObject;
    }

    private static C2443a m17609a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C2443a(jSONObject.optString("a_id"));
        } catch (Exception e) {
            return null;
        }
    }
}
