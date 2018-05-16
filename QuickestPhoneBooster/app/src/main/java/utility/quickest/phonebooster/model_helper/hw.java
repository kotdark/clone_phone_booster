package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import com.google.gson.C2365j;
import utility.quickest.phonebooster.network.response_data.ConfigurationServiceExpression;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.HashMap;
import java.util.Map;

/* compiled from: RemoteConfigurationModel */
public final class hw {
    private static volatile hw f14362a = null;
    private final Map<String, Object> f14363b = m18678b();

    public static hw m18677a() {
        if (f14362a == null) {
            synchronized (hw.class) {
                if (f14362a == null) {
                    f14362a = new hw();
                }
            }
        }
        return f14362a;
    }

    public boolean m18680a(String str, boolean z) {
        ThreadUtil.m19102b();
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        Object obj = this.f14363b.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public int m18679a(String str, int i) {
        ThreadUtil.m19102b();
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        Object obj = this.f14363b.get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return i;
    }

    private hw() {
        ThreadUtil.m19099a(true, new hx(this));
    }

    private Map<String, Object> m18678b() {
        Map<String, Object> hashMap = new HashMap();
        try {
            ConfigurationServiceExpression configurationServiceExpression = (ConfigurationServiceExpression) new C2365j().m17179a( SharedPrefHelper.m17454a().m17461G(), ConfigurationServiceExpression.class);
            if (configurationServiceExpression != null) {
                if (configurationServiceExpression.nolockedscreenversion >= 0) {
                    hashMap.put("key_no_ls_version", Integer.valueOf(configurationServiceExpression.nolockedscreenversion));
                }
                if (configurationServiceExpression.displayads != null) {
                    hashMap.put("key_display_ads", configurationServiceExpression.displayads);
                }
                if (configurationServiceExpression.windowmodelsversion >= 0) {
                    hashMap.put("key_window_mode_ls_version", Integer.valueOf(configurationServiceExpression.windowmodelsversion));
                }
            }
        } catch (Throwable th) {
        }
        return hashMap;
    }
}
