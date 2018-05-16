package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.C2535e;

/* compiled from: LockedScreenWindowHelper */
class he implements Runnable {
    final /* synthetic */ hd f14319a;

    he(hd hdVar) {
        this.f14319a = hdVar;
    }

    public void run() {
        hd.f14316a.postDelayed(this, 1000);
        if (!C2535e.m19054s() || !C2535e.m19053r()) {
            this.f14319a.m18621a();
        }
    }
}
