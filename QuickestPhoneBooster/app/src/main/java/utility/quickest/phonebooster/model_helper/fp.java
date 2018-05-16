package utility.quickest.phonebooster.model_helper;

/* compiled from: CleanNotificationModel */
class fp implements gw {
    final /* synthetic */ fw f14209a;
    final /* synthetic */ boolean f14210b;
    final /* synthetic */ boolean f14211c;
    final /* synthetic */ boolean f14212d;
    final /* synthetic */ fl f14213e;

    fp(fl flVar, fw fwVar, boolean z, boolean z2, boolean z3) {
        this.f14213e = flVar;
        this.f14209a = fwVar;
        this.f14210b = z;
        this.f14211c = z2;
        this.f14212d = z3;
    }

    public void mo3111a(gy gyVar, gx gxVar) {
        ft ftVar = null;
        if (gxVar.equals(gx.ReadyToScanAndDoAction)) {
            this.f14209a.m18595a(null);
            long c = this.f14209a.m18598c();
            if (c >= 209715200) {
                ftVar = ft.JunkWithSize;
            } else if (c >= 5242880) {
                ftVar = ft.JunkWithoutSize;
            }
            if (ftVar == null) {
                this.f14213e.m18532a(true, this.f14210b, this.f14211c, this.f14212d);
                return;
            }
            eh ehVar = new eh();
            ehVar.m18476a(new fq(this, ehVar, ftVar, c));
            ehVar.m18481d();
        }
    }

    public void mo3112a(gy gyVar, String str, int i) {
    }

    public void mo3113b(gy gyVar, String str, int i) {
    }
}
