package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: TemperatureModel */
class je implements Runnable {
    final /* synthetic */ jd f14448a;

    je(jd jdVar) {
        this.f14448a = jdVar;
    }

    public void run() {
        Integer num = null;
        try {
            num = jd.m18751d();
        } catch (Throwable th) {
        }
        ThreadUtil.m19099a(false, new jf(this, num));
    }
}
