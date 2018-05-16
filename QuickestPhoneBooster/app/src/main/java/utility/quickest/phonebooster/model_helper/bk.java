package utility.quickest.phonebooster.model_helper;

import com.facebook.ads.C0945h;
import com.facebook.ads.au;
import com.facebook.ads.ax;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class bk implements ax {
    final /* synthetic */ long f13989a;
    final /* synthetic */ au f13990b;
    final /* synthetic */ bj f13991c;

    bk(bj bjVar, long j, au auVar) {
        this.f13991c = bjVar;
        this.f13989a = j;
        this.f13990b = auVar;
    }

    public void mo3127a() {
        ThreadUtil.m19099a(false, new bl(this));
    }

    public void mo3128a(C0945h c0945h) {
        ThreadUtil.m19099a(false, new bm(this, c0945h));
    }
}
