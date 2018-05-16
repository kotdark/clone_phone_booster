package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: TemperatureModel */
final class jg implements Runnable {
    final /* synthetic */ jj f14451a;

    jg(jj jjVar) {
        this.f14451a = jjVar;
    }

    public void run() {
        Integer num = null;
        try {
            num = jd.m18751d();
        } catch (Throwable th) {
        }
        ThreadUtil.m19099a(false, new jh(this, num));
    }
}
