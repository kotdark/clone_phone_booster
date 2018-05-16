package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import java.util.List;

/* compiled from: CPUCoolingFinishFragment */
class al implements Runnable {
    final /* synthetic */ CPUCoolingFinishFragment f13522a;

    al(CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13522a = cPUCoolingFinishFragment;
    }

    public void run() {
        if (ViewUtil.m18937a(this.f13522a)) {
            List c = this.f13522a.f13197a.m18329c(db.CPU_COOL);
            if (c.size() <= 0) {
                ThreadUtil.m19098a(new am(this), 2000);
            } else {
                this.f13522a.m17749a(c);
            }
        }
    }
}
