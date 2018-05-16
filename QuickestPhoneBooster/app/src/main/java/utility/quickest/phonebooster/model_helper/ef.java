package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import utility.quickest.phonebooster.p112b.C2429a;

/* compiled from: AppModificationHelper */
final class ef implements Runnable {
    final /* synthetic */ String f14139a;

    ef(String str) {
        this.f14139a = str;
    }

    public void run() {
        Object a = AppModificationHelper.m18189b(C2429a.m17452a(), this.f14139a);
        if (TextUtils.isEmpty(a)) {
            a = this.f14139a;
        }
        if (!TextUtils.isEmpty(a)) {
            AppModificationHelper.f13869a.post(new eg(this, a));
        }
    }
}
