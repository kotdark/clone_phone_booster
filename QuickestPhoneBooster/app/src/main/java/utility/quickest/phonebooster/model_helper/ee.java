package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import utility.quickest.phonebooster.p112b.C2429a;
import utility.quickest.phonebooster.util.C2535e;

/* compiled from: AppModificationHelper */
final class ee implements Runnable {
    final /* synthetic */ String f14138a;

    ee(String str) {
        this.f14138a = str;
    }

    public void run() {
        String b = C2535e.m19033b(this.f14138a);
        if (!TextUtils.isEmpty(b)) {
            AppModificationHelper.m18191b(C2429a.m17452a(), this.f14138a, b);
        }
    }
}
