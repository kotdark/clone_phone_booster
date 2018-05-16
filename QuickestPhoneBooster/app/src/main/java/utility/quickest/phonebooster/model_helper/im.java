package utility.quickest.phonebooster.model_helper;

import android.os.Handler;
import android.os.Looper;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: SplashHelper */
public final class im {
    private static final Handler f14414d = new Handler(Looper.getMainLooper());
    private final boolean f14415a =  SharedPrefHelper.m17454a().m17538o();
    private boolean f14416b = false;
    private final Runnable f14417c = new in(this);
    private final ir f14418e;

    public im(ir irVar) {
        this.f14418e = irVar;
        ThreadUtil.m19099a(true, new io(this));
    }

    public void m18734a() {
        ThreadUtil.m19102b();
        if (!this.f14416b) {
            this.f14416b = true;
            if (this.f14418e != null) {
                this.f14418e.mo3100a();
            }
        }
    }

    public void m18735b() {
        ThreadUtil.m19102b();
         SharedPrefHelper.m17454a().m17500d(false);
    }

    private void m18731d() {
        ThreadUtil.m19102b();
        if (!this.f14416b) {
            C2492b a = C2492b.m18285a();
            a.m18328b(db.SPLASH);
            ThreadUtil.m19098a(new ip(this, a), 1500);
        }
    }
}
