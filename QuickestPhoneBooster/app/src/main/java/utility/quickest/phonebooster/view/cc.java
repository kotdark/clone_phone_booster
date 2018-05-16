package utility.quickest.phonebooster.view;

import android.net.Uri;
import android.view.View;
import com.facebook.share.model.C1436e;
import com.facebook.share.p086a.C1401a;
import utility.quickest.phonebooster.util.C2542m;

/* compiled from: ShareDialogTarget */
class cc extends cj {
    final /* synthetic */ ShareDialogTarget f15194a;

    cc(ShareDialogTarget shareDialogTarget, int i) {
        this.f15194a = shareDialogTarget;
        super(i);
    }

    public void onClick(View view) {
        try {
            new C1401a(this.f15194a.f14988a).m6323a(((C1436e) new C1436e().m6749a(Uri.parse("http://m.onelink.me/cdd92709"))).m6767a());
        } catch (Throwable th) {
        }
        C2542m.m19082a("share_dialog_target", "facebook", null);
        this.f15194a.dismiss();
    }
}
