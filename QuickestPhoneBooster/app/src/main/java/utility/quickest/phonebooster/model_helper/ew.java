package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.NetworkUtil;

/* compiled from: AppUpdateModel */
class ew implements Runnable {
    final /* synthetic */ et f14179a;

    ew(et etVar) {
        this.f14179a = etVar;
    }

    public void run() {
        NetworkUtil.m18868a(new ex(this));
        this.f14179a.f14174h.run();
    }
}
