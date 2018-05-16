package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import utility.quickest.phonebooster.network.response_data.JunkDirServiceExpression;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: DeepJunkHelper */
final class go implements Runnable {
    final /* synthetic */ C2443a f14280a;

    go(C2443a c2443a) {
        this.f14280a = c2443a;
    }

    public void run() {
        Throwable th;
        try {
            List<JunkDirServiceExpression> a = fw.m18573b(this.f14280a);
            if (a != null) {
                Map hashMap = new HashMap();
                for (JunkDirServiceExpression junkDirServiceExpression : a) {
                    if (junkDirServiceExpression != null) {
                        if (junkDirServiceExpression.packageName != null) {
                            junkDirServiceExpression.packageName = junkDirServiceExpression.packageName.trim();
                        }
                        if (!(TextUtils.isEmpty(junkDirServiceExpression.packageName) || junkDirServiceExpression.junkDirs == null)) {
                            Set hashSet = new HashSet();
                            for (CharSequence charSequence : junkDirServiceExpression.junkDirs) {
                                CharSequence charSequence2;
                                if (charSequence2 != null) {
                                    charSequence2 = charSequence2.trim();
                                }
                                if (!TextUtils.isEmpty(charSequence2)) {
                                    hashSet.add(charSequence2);
                                }
                            }
                            hashMap.put(junkDirServiceExpression.packageName, hashSet);
                        }
                    }
                }
                fw.m18585c(C2429a.m17452a(), hashMap);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ThreadUtil.m19099a(false, new gp(this));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
