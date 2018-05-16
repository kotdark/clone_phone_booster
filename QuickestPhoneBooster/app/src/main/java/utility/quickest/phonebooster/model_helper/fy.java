package utility.quickest.phonebooster.model_helper;

/* compiled from: DeepJunkHelper */
class fy implements Runnable {
    final /* synthetic */ String f14245a;
    final /* synthetic */ int f14246b;
    final /* synthetic */ fw f14247c;

    fy(fw fwVar, String str, int i) {
        this.f14247c = fwVar;
        this.f14245a = str;
        this.f14246b = i;
    }

    public void run() {
        if (this.f14247c.f14244i != null) {
            this.f14247c.f14244i.mo3112a(this.f14247c.f14240e, this.f14245a, this.f14246b);
        }
    }
}
