package utility.quickest.phonebooster.app;

import android.util.Log;
import utility.quickest.phonebooster.util.AppUtil;

/* compiled from: MyApplicationLike */
class C2422j implements Runnable {
    final /* synthetic */ MyApplicationLike f12991a;

    C2422j(MyApplicationLike c2416d) {
        this.f12991a = c2416d;
    }

    public void run() {
        Log.i("CleanInfo", "CleanInfo: OwnChannel-" + AppUtil.m19020e() + "|AppsFlyer-" + AppUtil.m19021f() + "|Preinstall-" + AppUtil.m19022g());
    }
}
