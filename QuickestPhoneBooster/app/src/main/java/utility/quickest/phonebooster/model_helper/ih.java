package utility.quickest.phonebooster.model_helper;

import utility.quickest.phonebooster.p114d.C2443a;
import utility.quickest.phonebooster.util.ThreadUtil;

/* compiled from: SettingModel */
class ih implements Runnable {
    final /* synthetic */ C2443a f14402a;
    final /* synthetic */ String f14403b;
    final /* synthetic */ String f14404c;
    final /* synthetic */ boolean f14405d;
    final /* synthetic */ ij f14406e;
    final /* synthetic */ ig f14407f;

    ih(ig igVar, C2443a c2443a, String str, String str2, boolean z, ij ijVar) {
        this.f14407f = igVar;
        this.f14402a = c2443a;
        this.f14403b = str;
        this.f14404c = str2;
        this.f14405d = z;
        this.f14406e = ijVar;
    }

    public void run() {
        Throwable th = null;
        ik ikVar = new ik();
        try {
            ig.m18709b(this.f14402a, this.f14403b, this.f14404c, this.f14405d, ikVar);
        } catch (Throwable th2) {
            th = th2;
            ikVar.f14410a = -1;
        }
        ThreadUtil.m19099a(false, new ii(this, ikVar));
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
