package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import java.util.List;

/* compiled from: PowerSavingFinishFragment */
class fp implements Runnable {
    final /* synthetic */ PowerSavingFinishFragment f13747a;

    fp(PowerSavingFinishFragment powerSavingFinishFragment) {
        this.f13747a = powerSavingFinishFragment;
    }

    public void run() {
        if (ViewUtil.m18937a(this.f13747a)) {
            List c = this.f13747a.f13426a.m18329c(db.SAVE_POWER);
            if (c.size() <= 0) {
                ThreadUtil.m19098a(new fq(this), 2000);
            } else {
                this.f13747a.m17868a(c);
            }
        }
    }
}
