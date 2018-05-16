package utility.quickest.phonebooster.fragment;

import android.content.Intent;
import android.net.Uri;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.view.C2459k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AntivirusFragment */
class aa implements C2459k {
    final /* synthetic */ AntivirusFragment f13508a;

    aa(AntivirusFragment antivirusFragment) {
        this.f13508a = antivirusFragment;
    }

    public void mo3086a() {
        C2542m.m19082a("antivirus_warning_dialog_uninstall", "yes", null);
        List< AppVirusInfo> b = this.f13508a.f13180e.m17336b();
        this.f13508a.f13190o = b;
        this.f13508a.f13180e.m17335a(new ArrayList());
        for ( AppVirusInfo c2448f : b) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.DELETE");
                intent.setData(Uri.parse("package:" + c2448f.m17659a()));
                this.f13508a.startActivity(intent);
            } catch (Throwable th) {
            }
        }
        this.f13508a.f13189n = true;
    }

    public void mo3087b() {
        C2542m.m19082a("antivirus_warning_dialog_uninstall", "no", null);
        this.f13508a.m17739i();
    }
}
