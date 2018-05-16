package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2454l;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: SwitchModel */
class ix implements Runnable {
    final /* synthetic */ SwitchModel f14434a;

    ix(SwitchModel switchModel) {
        this.f14434a = switchModel;
    }

    public void run() {
        C2454l c2454l;
        try {
            c2454l = new C2454l(SwitchModel.m18230l(), SwitchModel.m18231m(), SwitchModel.m18232n());
        } catch (Throwable th) {
            c2454l = null;
        }
        ThreadUtil.m19099a(false, new iy(this, c2454l));
    }
}
