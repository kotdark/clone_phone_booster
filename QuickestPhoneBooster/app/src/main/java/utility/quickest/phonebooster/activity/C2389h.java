package utility.quickest.phonebooster.activity;

import utility.quickest.phonebooster.util.ThreadUtil;
import java.lang.ref.WeakReference;

/* compiled from: PopupAfterActivity */
final class C2389h implements Runnable {
    private final WeakReference<BaseActivity> f12844a;

    public C2389h(BaseActivity c2382a) {
        this.f12844a = new WeakReference(c2382a);
    }

    public void run() {
        ThreadUtil.m19102b();
        try {
            BaseActivity c2382a = (BaseActivity) this.f12844a.get();
            if (c2382a != null) {
                c2382a.finish();
            }
        } catch (Throwable th) {
        }
    }
}
