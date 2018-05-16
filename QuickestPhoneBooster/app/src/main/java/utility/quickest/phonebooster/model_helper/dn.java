package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d. AppVirusInfo;

/* compiled from: AntivirusHelper */
class dn implements Runnable {
    final /* synthetic */  AppVirusInfo f14105a;
    final /* synthetic */ dl f14106b;

    dn(dl dlVar,  AppVirusInfo c2448f) {
        this.f14106b = dlVar;
        this.f14105a = c2448f;
    }

    public void run() {
        this.f14106b.f14101d.f14095f.add(this.f14105a);
    }
}
