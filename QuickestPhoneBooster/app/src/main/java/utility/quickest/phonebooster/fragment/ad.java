package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.view.C2459k;
import java.util.List;

/* compiled from: AntivirusFragment */
class ad implements C2459k {
    final /* synthetic */  AppVirusInfo f13511a;
    final /* synthetic */ AntivirusFragment f13512b;

    ad(AntivirusFragment antivirusFragment,  AppVirusInfo c2448f) {
        this.f13512b = antivirusFragment;
        this.f13511a = c2448f;
    }

    public void mo3086a() {
        C2542m.m19082a("antivirus_warning_dialog_ignore", "yes", null);
        try {
            this.f13512b.f13179d.m18780b(this.f13511a);
            this.f13512b.f13191p.add(this.f13511a);
            List f = this.f13512b.m17737h();
            this.f13512b.f13180e.m17335a(f);
            this.f13512b.mAntivirusIgnore.setVisibility(f.size() == 1 ? 0 : 8);
            if (f.size() == 0) {
                this.f13512b.m17739i();
            }
        } catch (Throwable th) {
        }
    }

    public void mo3087b() {
        C2542m.m19082a("antivirus_warning_dialog_ignore", "no", null);
    }
}
