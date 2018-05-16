package utility.quickest.phonebooster.fragment;

import android.os.Build.VERSION;
import utility.quickest.phonebooster.model_helper.dp;
import utility.quickest.phonebooster.model_helper.dq;
import utility.quickest.phonebooster.util.C2535e;

/* compiled from: AntivirusFragment */
class ab implements dp {
    final /* synthetic */ AntivirusFragment f13509a;

    ab(AntivirusFragment antivirusFragment) {
        this.f13509a = antivirusFragment;
    }

    public void mo3088a(dq dqVar) {
        switch (ae.f13513a[dqVar.ordinal()]) {
            case 1:
                this.f13509a.f13190o = this.f13509a.m17737h();
                this.f13509a.m17736g();
                this.f13509a.mScanProgress.setProgress(100);
                return;
            default:
                return;
        }
    }

    public void mo3089a(String str, int i) {
        this.f13509a.mScanningAppName.setText(C2535e.m19033b(str));
        if (VERSION.SDK_INT >= 24) {
            this.f13509a.mScanProgress.setProgress(i, true);
        } else {
            this.f13509a.mScanProgress.setProgress(i);
        }
        this.f13509a.m17730d();
    }
}
