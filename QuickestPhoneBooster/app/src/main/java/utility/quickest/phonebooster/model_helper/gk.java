package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DeepJunkHelper */
final class gk implements Runnable {
    gk() {
    }

    public void run() {
        Throwable th;
        try {
            Map hashMap = new HashMap();
            for (String str : C2535e.m19030a(true).keySet()) {
                CharSequence b = C2535e.m19033b(str);
                if (!(TextUtils.isEmpty(str) || TextUtils.isEmpty(b))) {
                    hashMap.put(str, b);
                }
            }
            fw.m18589d(C2429a.m17452a(), hashMap);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ThreadUtil.m19099a(false, new gl(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
