package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2449g;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: BatteryModel */
class fg implements Runnable {
    final /* synthetic */ BatteryModel f14196a;

    fg(BatteryModel batteryModel) {
        this.f14196a = batteryModel;
    }

    public void run() {
        C2449g c2449g;
        try {
            c2449g = new C2449g(BatteryModel.m18207i(), BatteryModel.m18208j(), BatteryModel.m18209k(), BatteryModel.m18210l());
        } catch (Throwable th) {
            c2449g = null;
        }
        ThreadUtil.m19099a(false, new fh(this, c2449g));
    }
}
