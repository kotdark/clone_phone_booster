package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: AppUpdateModel */
class ev implements Runnable {
    final /* synthetic */ et f14178a;

    ev(et etVar) {
        this.f14178a = etVar;
    }

    public void run() {
        if (Math.abs(System.currentTimeMillis() -  SharedPrefHelper.m17454a().m17476V()) >= 3600000) {
            this.f14178a.m18494b(null);
        }
        ThreadUtil.m19098a(this.f14178a.f14174h, 3900000);
    }
}
