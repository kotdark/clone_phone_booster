package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2444b;

/* compiled from: ApkFileScanningModel */
class dx implements Runnable {
    final /* synthetic */ C2444b f14128a;
    final /* synthetic */ int f14129b;
    final /* synthetic */ dw f14130c;

    dx(dw dwVar, C2444b c2444b, int i) {
        this.f14130c = dwVar;
        this.f14128a = c2444b;
        this.f14129b = i;
    }

    public void run() {
        if (this.f14130c.f14126d != null) {
            this.f14130c.f14126d.mo3115a(this.f14128a.m17614a().getAbsolutePath(), this.f14129b);
        }
    }
}
