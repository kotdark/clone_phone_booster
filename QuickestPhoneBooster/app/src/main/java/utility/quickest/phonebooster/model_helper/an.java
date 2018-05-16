package utility.quickest.phonebooster.model_helper;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.C1971k;
import com.google.android.gms.ads.C1973m;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
final class an extends AdvertisementModel {
    private final C1973m f13931l;

    private static void m18268g() {
        ThreadUtil.m19102b();
        try {
            C1971k.m9574a(MyApplicationLike.getApplication(), "ca-app-pub-6283280398895935~2971662804");
        } catch (Throwable th) {
        }
    }

    private an(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2) {
        this(dbVar, str, j, i, j2, j3, f, f2, j4, str2, null, null);
    }

    private an(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2, String str3, C1973m c1973m) {
        super(dbVar, str, j, i, j2, j3, f, f2, j4, str2, str3);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("unitId is empty!");
        }
        this.f13931l = c1973m;
    }

    public C1973m m18269h() {
        ThreadUtil.m19102b();
        return this.f13931l;
    }

    protected boolean mo3118a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        boolean a = super.mo3118a(view, list, cxVar, objArr);
        if (this.f13931l != null) {
            try {
                this.f13931l.setAdListener(new ao(this));
            } catch (Throwable th) {
            }
        }
        return a;
    }

    protected boolean mo3119d() {
        ThreadUtil.m19102b();
        if (this.f13931l == null) {
            return false;
        }
        return super.mo3119d();
    }

    protected List<cv> mo3117a(C2443a c2443a) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadUtil.m19099a(false, new aq(this, linkedBlockingQueue));
        List<cv> list = null;
        try {
            list = (List) linkedBlockingQueue.poll(this.c, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        ThreadUtil.m19099a(false, new aw(this, list == null));
        return list;
    }

    protected void mo3120e() {
    }
}
