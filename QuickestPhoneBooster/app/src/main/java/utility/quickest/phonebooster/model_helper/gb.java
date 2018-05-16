package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2451i;

/* compiled from: DeepJunkHelper */
class gb implements Runnable {
    final /* synthetic */ C2451i f14257a;
    final /* synthetic */ int f14258b;
    final /* synthetic */ fz f14259c;

    gb(fz fzVar, C2451i c2451i, int i) {
        this.f14259c = fzVar;
        this.f14257a = c2451i;
        this.f14258b = i;
    }

    public void run() {
        if (this.f14259c.f14251d.f14244i != null) {
            this.f14259c.f14251d.f14244i.mo3113b(this.f14259c.f14251d.f14240e, this.f14257a.m17675a().getAbsolutePath(), this.f14258b);
        }
    }
}
