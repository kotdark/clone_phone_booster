package utility.quickest.phonebooster.model_helper;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.cache.ImageCache;
import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.p114d.OwnCampaignInfo;
import utility.quickest.phonebooster.util.ThreadUtil;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisementModel */
final class cm extends AdvertisementModel {
    private final OwnCampaignInfo f14043l;

    private static void m18390g() {
    }

    private cm(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2) {
        this(dbVar, str, j, i, j2, j3, f, f2, j4, str2, null, null);
    }

    private cm(db dbVar, String str, long j, int i, long j2, long j3, float f, float f2, long j4, String str2, String str3, OwnCampaignInfo c2452j) {
        super(dbVar, str, j, i, j2, j3, f, f2, j4, str2, str3);
        this.f14043l = c2452j;
    }

    public OwnCampaignInfo m18391h() {
        ThreadUtil.m19102b();
        return this.f14043l;
    }

    protected boolean mo3118a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        boolean a = super.mo3118a(view, list, cxVar, objArr);
        if (!(this.f14043l == null || view == null)) {
            view.setClickable(true);
            view.setOnClickListener(new cn(this));
            m18392i();
        }
        return a;
    }

    protected boolean mo3119d() {
        ThreadUtil.m19102b();
        if (this.f14043l == null) {
            return false;
        }
        return super.mo3119d();
    }

    protected List<cv> mo3117a(C2443a c2443a) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadUtil.m19097a("OwnAdTask", new co(this, c2443a, linkedBlockingQueue));
        List<cv> list = null;
        try {
            list = (List) linkedBlockingQueue.poll(1000, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        ThreadUtil.m19099a(false, new cr(this, list == null));
        return list;
    }

    protected void mo3120e() {
        ThreadUtil.m19102b();
        if (this.f14043l != null) {
            ImageCache.m17570a(this.f14043l.m17681d());
        }
    }

    public void m18392i() {
        ThreadUtil.m19102b();
        if (this.f14043l != null) {
            C2443a b = C2490a.m18243a().m18244b();
            for (String csVar : this.f14043l.m17684g()) {
                ThreadUtil.m19097a("AdShowCb", new cs(this, csVar, b));
            }
        }
    }

    public void m18393j() {
        ThreadUtil.m19102b();
        if (this.f14043l != null) {
            C2443a b = C2490a.m18243a().m18244b();
            for (String ctVar : this.f14043l.m17685h()) {
                ThreadUtil.m19097a("AdClickCb", new ct(this, ctVar, b));
            }
        }
    }

    public void m18394k() {
        ThreadUtil.m19102b();
        if (this.f14043l != null && !TextUtils.isEmpty(this.f14043l.m17683f())) {
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(this.f14043l.m17683f()));
                intent.setFlags(268435456);
                MyApplicationLike.getApplication().startActivity(intent);
            } catch (Throwable th) {
            }
        }
    }
}
