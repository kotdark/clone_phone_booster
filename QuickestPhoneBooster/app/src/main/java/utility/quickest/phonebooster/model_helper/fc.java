package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.p114d.C2443a;
import java.io.IOException;

/* compiled from: AppUpdateModel */
final class fc implements Runnable {
    final /* synthetic */ String f14192a;
    final /* synthetic */ C2443a f14193b;

    fc(String str, C2443a c2443a) {
        this.f14192a = str;
        this.f14193b = c2443a;
    }

    public void run() {
        try {
            C2522c.m18850a(this.f14192a, null, this.f14193b);
        } catch (IOException e) {
        }
    }
}
