package utility.quickest.phonebooster.model_helper;

import com.google.android.gms.ads.C0970a;
import com.google.android.gms.ads.C1973m;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AdvertisementModel */
class as extends C0970a {
    final /* synthetic */ long f13939a;
    final /* synthetic */ C1973m f13940b;
    final /* synthetic */ ar f13941c;

    as(ar arVar, long j, C1973m c1973m) {
        this.f13941c = arVar;
        this.f13939a = j;
        this.f13940b = c1973m;
    }

    public void mo1460a(int i) {
        ThreadUtil.m19099a(false, new at(this, i));
    }

    public void mo1686b() {
        ThreadUtil.m19099a(false, new au(this));
    }
}
