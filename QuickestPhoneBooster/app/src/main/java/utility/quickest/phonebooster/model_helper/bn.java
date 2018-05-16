package utility.quickest.phonebooster.model_helper;

import com.facebook.ads.C0932a;
import com.facebook.ads.C0933i;
import com.facebook.ads.C0945h;
import com.facebook.ads.ad;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class bn implements C0933i {
    final /* synthetic */ long f13995a;
    final /* synthetic */ ad f13996b;
    final /* synthetic */ Runnable[] f13997c;
    final /* synthetic */ bj f13998d;

    bn(bj bjVar, long j, ad adVar, Runnable[] runnableArr) {
        this.f13998d = bjVar;
        this.f13995a = j;
        this.f13996b = adVar;
        this.f13997c = runnableArr;
    }

    public void mo3122a(C0932a c0932a, C0945h c0945h) {
        ThreadUtil.m19099a(false, new bo(this, c0945h));
    }

    public void mo3121a(C0932a c0932a) {
        ThreadUtil.m19099a(false, new bp(this));
    }

    public void mo3123b(C0932a c0932a) {
        ThreadUtil.m19099a(false, new bq(this));
    }

    public void mo3124c(C0932a c0932a) {
    }
}
