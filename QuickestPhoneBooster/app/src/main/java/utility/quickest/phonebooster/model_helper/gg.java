package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2451i;

/* compiled from: DeepJunkHelper */
class gg implements Runnable {
    final /* synthetic */ C2451i f14270a;
    final /* synthetic */ int f14271b;
    final /* synthetic */ ge f14272c;

    gg(ge geVar, C2451i c2451i, int i) {
        this.f14272c = geVar;
        this.f14270a = c2451i;
        this.f14271b = i;
    }

    public void run() {
        if (this.f14272c.f14266d.f14244i != null) {
            this.f14272c.f14266d.f14244i.mo3113b(this.f14272c.f14266d.f14240e, this.f14270a.m17675a().getAbsolutePath(), this.f14271b);
        }
    }
}
