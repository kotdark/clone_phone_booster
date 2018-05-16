package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.db;

/* compiled from: PowerSavingFinishFragment */
class fq implements Runnable {
    final /* synthetic */ fp f13748a;

    fq(fp fpVar) {
        this.f13748a = fpVar;
    }

    public void run() {
        this.f13748a.f13747a.m17868a(this.f13748a.f13747a.f13426a.m18329c(db.SAVE_POWER));
    }
}
