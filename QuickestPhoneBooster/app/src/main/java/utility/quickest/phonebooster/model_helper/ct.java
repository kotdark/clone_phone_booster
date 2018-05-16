package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.p114d.C2443a;
import java.io.IOException;

/* compiled from: AdvertisementModel */
class ct implements Runnable {
    final /* synthetic */ String f14059a;
    final /* synthetic */ C2443a f14060b;
    final /* synthetic */ cm f14061c;

    ct(cm cmVar, String str, C2443a c2443a) {
        this.f14061c = cmVar;
        this.f14059a = str;
        this.f14060b = c2443a;
    }

    public void run() {
        try {
            C2522c.m18850a(this.f14059a, null, this.f14060b);
        } catch (IOException e) {
        }
    }
}
