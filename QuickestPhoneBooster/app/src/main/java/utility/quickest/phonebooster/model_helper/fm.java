package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: CleanNotificationModel */
class fm implements Runnable {
    final /* synthetic */ fl f14206a;

    fm(fl flVar) {
        this.f14206a = flVar;
    }

    public void run() {
        this.f14206a.m18532a(false, false, false, !hz.m18683a().m18693a(id.NewCpuNoti));
        this.f14206a.m18536c();
        ThreadUtil.m19098a(this.f14206a.f14205c, 3600000);
    }
}
