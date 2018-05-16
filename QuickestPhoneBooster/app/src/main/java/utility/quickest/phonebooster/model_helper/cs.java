package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.network.C2522c;
import utility.quickest.phonebooster.p114d.C2443a;
import java.io.IOException;

/* compiled from: AdvertisementModel */
class cs implements Runnable {
    final /* synthetic */ String f14056a;
    final /* synthetic */ C2443a f14057b;
    final /* synthetic */ cm f14058c;

    cs(cm cmVar, String str, C2443a c2443a) {
        this.f14058c = cmVar;
        this.f14056a = str;
        this.f14057b = c2443a;
    }

    public void run() {
        try {
            C2522c.m18850a(this.f14056a, null, this.f14057b);
        } catch (IOException e) {
        }
    }
}
