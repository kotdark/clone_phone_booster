package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2443a;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/* compiled from: AdvertisementModel */
final class C2508n implements Runnable {
    final /* synthetic */ AdvertisementModel f14485a;
    final /* synthetic */ C2443a f14486b;
    final /* synthetic */ List[] f14487c;
    final /* synthetic */ int f14488d;
    final /* synthetic */ CountDownLatch f14489e;

    C2508n(AdvertisementModel c2491o, C2443a c2443a, List[] listArr, int i, CountDownLatch countDownLatch) {
        this.f14485a = c2491o;
        this.f14486b = c2443a;
        this.f14487c = listArr;
        this.f14488d = i;
        this.f14489e = countDownLatch;
    }

    public void run() {
        List list = null;
        try {
            if (!(this.f14485a.f13887a.equals(db.JUNK_INTER) || this.f14485a.f13887a.equals(db.PROCESS_INTER) || this.f14485a.f13887a.equals(db.SAVE_POWER2) || this.f14485a.f13887a.equals(db.CPU_COOL2) || this.f14485a.f13887a.equals(db.ANTI_VIRUS_INTER)) || new Random().nextFloat() < this.f14485a.f13894h) {
                list = this.f14485a.mo3117a(this.f14486b);
            }
        } catch (Throwable th) {
        }
        try {
            this.f14487c[this.f14488d] = list;
        } catch (Throwable th2) {
        }
        this.f14489e.countDown();
    }
}
