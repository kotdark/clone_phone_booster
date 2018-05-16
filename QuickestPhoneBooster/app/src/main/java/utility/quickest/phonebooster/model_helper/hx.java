package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: RemoteConfigurationModel */
class hx implements Runnable {
    final /* synthetic */ hw f14364a;

    hx(hw hwVar) {
        this.f14364a = hwVar;
    }

    public void run() {
        ThreadUtil.m19097a("RemoteConfig", new hy(this, C2490a.m18243a().m18244b(), String.valueOf(hh.m18641f())));
    }
}
