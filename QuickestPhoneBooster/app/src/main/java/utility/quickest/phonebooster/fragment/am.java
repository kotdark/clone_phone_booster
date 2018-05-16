package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.db;

/* compiled from: CPUCoolingFinishFragment */
class am implements Runnable {
    final /* synthetic */ al f13523a;

    am(al alVar) {
        this.f13523a = alVar;
    }

    public void run() {
        this.f13523a.f13522a.m17749a(this.f13523a.f13522a.f13197a.m18329c(db.CPU_COOL));
    }
}
