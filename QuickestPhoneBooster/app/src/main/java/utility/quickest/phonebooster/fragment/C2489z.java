package utility.quickest.phonebooster.fragment;

import android.widget.Toast;
import utility.quickest.phonebooster.p114d. AppVirusInfo;
import utility.quickest.phonebooster.util.C2461k;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.R;
import java.util.List;
import java.util.Set;

/* compiled from: AntivirusFragment */
class C2489z implements C2461k {
    final /* synthetic */ AntivirusFragment f13864a;

    C2489z(AntivirusFragment antivirusFragment) {
        this.f13864a = antivirusFragment;
    }

    public void mo3091a(Object obj) {
        if (ViewUtil.m18937a(this.f13864a) && (obj instanceof Set)) {
            try {
                for ( AppVirusInfo c2448f : (Set) obj) {
                    this.f13864a.f13179d.m18780b(c2448f);
                    this.f13864a.f13191p.add(c2448f);
                }
                List f = this.f13864a.m17737h();
                this.f13864a.f13180e.m17335a(f);
                this.f13864a.mAntivirusIgnore.setVisibility(f.size() == 1 ? 0 : 8);
                if (f.size() == 0) {
                    this.f13864a.m17739i();
                }
                Toast.makeText(this.f13864a.getActivity(), this.f13864a.m17696a((int) R.string.antivirus_ignore_tip), 1).show();
            } catch (Throwable th) {
            }
        }
    }
}
