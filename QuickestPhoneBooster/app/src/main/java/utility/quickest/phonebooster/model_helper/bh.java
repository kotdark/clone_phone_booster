package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.ad;
import utility.quickest.phonebooster.cache.ImageCache;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
final class bh extends AdvertisementModel {
    private final ad f13984l;
    private final Runnable[] f13985m;

    private static void m18339g() {
    }

    private bh(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2) {
        this(dbVar, str, j, i, j2, j3, f, f2, j4, str2, null, null, null);
    }

    private bh(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2, String str3, ad adVar, Runnable[] runnableArr) {
        super(dbVar, str, j, i, j2, j3, f, f2, j4, str2, str3);
        if (TextUtils.isEmpty(this.j)) {
            throw new IllegalArgumentException("placementId is empty!");
        }
        this.f13984l = adVar;
        this.f13985m = runnableArr;
    }

    public ad m18340h() {
        ThreadUtil.m19102b();
        return this.f13984l;
    }

    protected boolean mo3118a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        boolean a = super.mo3118a(view, list, cxVar, objArr);
        if (this.f13984l == null || view == null) {
            return a;
        }
        if (this.f13985m != null && this.f13985m.length > 0) {
            this.f13985m[0] = new bi(this);
        }
        try {
            List arrayList = new ArrayList();
            if (list != null) {
                for (View view2 : list) {
                    if (view2 != null) {
                        arrayList.add(view2);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                this.f13984l.m4077a(view);
            } else {
                this.f13984l.m4078a(view, arrayList);
            }
        } catch (Throwable th) {
        }
        return a;
    }

    protected boolean mo3119d() {
        ThreadUtil.m19102b();
        if (this.f13984l == null) {
            return false;
        }
        return super.mo3119d();
    }

    protected List<cv> mo3117a(C2443a c2443a) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadUtil.m19099a(false, new bj(this, linkedBlockingQueue));
        List<cv> list = null;
        try {
            list = (List) linkedBlockingQueue.poll(this.c, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        ThreadUtil.m19099a(false, new br(this, list == null));
        return list;
    }

    protected void mo3120e() {
        String str = null;
        ThreadUtil.m19102b();
        if (this.f13984l != null) {
            String a;
            try {
                a = this.f13984l.m4088f().m4148a();
            } catch (Throwable th) {
                a = str;
            }
            try {
                str = this.f13984l.m4087e().m4148a();
            } catch (Throwable th2) {
            }
            ImageCache.m17570a(a);
            ImageCache.m17570a(str);
        }
    }
}
