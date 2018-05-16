package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import android.view.View;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.cache.ImageCache;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;
import com.mobpower.nativeads.p128b.C2736b;
import com.mobpower.p116a.C2601a;
import com.mobpower.p116a.C2603d;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
final class cc extends AdvertisementModel {
    private final C2601a f14025l;
    private final Runnable[] f14026m;

    private static void m18362g() {
        ThreadUtil.m19102b();
        try {
            C2603d.f15274b = true;
            C2603d.f15273a = false;
            C2603d.m19418a(MyApplicationLike.getApplication(), "90944", "6631c442582b35865fec35a625f133a8");
        } catch (Throwable th) {
        }
    }

    private cc(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2) {
        this(dbVar, str, j, i, j2, j3, f, f2, j4, str2, null, null, null);
    }

    private cc(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2, String str3, C2601a c2601a, Runnable[] runnableArr) {
        super(dbVar, str, j, i, j2, j3, f, f2, j4, str2, str3);
        if (TextUtils.isEmpty(this.j)) {
            throw new IllegalArgumentException("placementId is empty!");
        }
        this.f14025l = c2601a;
        this.f14026m = runnableArr;
    }

    public C2601a m18363h() {
        ThreadUtil.m19102b();
        return this.f14025l;
    }

    protected boolean mo3118a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        boolean a = super.mo3118a(view, list, cxVar, objArr);
        if (!(this.f14025l == null || view == null)) {
            try {
                C2736b c2736b = new C2736b(MyApplicationLike.getApplication(), this.j, this.d);
                c2736b.m20255a(new cd(this));
                if (this.f14026m != null && this.f14026m.length > 0) {
                    this.f14026m[0] = new cf(this);
                }
                c2736b.m20253a(this.f14025l, view);
            } catch (Throwable th) {
            }
        }
        return a;
    }

    protected boolean mo3119d() {
        ThreadUtil.m19102b();
        if (this.f14025l == null) {
            return false;
        }
        return super.mo3119d();
    }

    protected List<cv> mo3117a(C2443a c2443a) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadUtil.m19099a(false, new cg(this, linkedBlockingQueue));
        List<cv> list = null;
        try {
            list = (List) linkedBlockingQueue.poll(this.c, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        ThreadUtil.m19099a(false, new cl(this, list == null));
        return list;
    }

    protected void mo3120e() {
        ThreadUtil.m19102b();
        if (this.f14025l != null) {
            ImageCache.m17570a(this.f14025l.m19405g());
            ImageCache.m17570a(this.f14025l.m19403f());
        }
    }
}
