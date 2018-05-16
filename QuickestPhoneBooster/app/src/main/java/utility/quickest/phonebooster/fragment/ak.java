package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.db;

/* compiled from: CPUCoolingFinishFragment */
class ak implements Runnable {
    final /* synthetic */ aj f13521a;

    ak(aj ajVar) {
        this.f13521a = ajVar;
    }

    public void run() {
        this.f13521a.f13520a.m17749a(this.f13521a.f13520a.f13197a.m18329c(db.CPU_COOL));
    }
}
