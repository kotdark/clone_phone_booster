package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: StatisticsHelper */
public final class is {
    public static void m18737a(String str, String str2, long j, String str3) {
        m18738a(str, str2, j, str3, null, null);
    }

    public static void m18738a(String str, String str2, long j, String str3, Runnable runnable, Runnable runnable2) {
        ThreadUtil.m19102b();
        if (str != null) {
            Object trim = str.trim();
        } else {
            String str4 = str;
        }
        if (!TextUtils.isEmpty(trim)) {
            ThreadUtil.m19103c(new it(C2490a.m18243a().m18244b(), trim, str2, j, str3, runnable, runnable2));
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }
}
