package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2445c;

/* compiled from: DeepJunkHelper */
class gc implements Runnable {
    final /* synthetic */ C2445c f14260a;
    final /* synthetic */ fz f14261b;

    gc(fz fzVar, C2445c c2445c) {
        this.f14261b = fzVar;
        this.f14260a = c2445c;
    }

    public void run() {
        this.f14261b.f14251d.f14242g.remove(this.f14260a.m17623a());
    }
}
