package utility.quickest.phonebooster.view;

import android.content.Intent;
import android.view.View;
import utility.quickest.phonebooster.util.C2542m;

/* compiled from: ShareDialogTarget */
class cf extends cj {
    final /* synthetic */ Intent f15199a;
    final /* synthetic */ ShareDialogTarget f15200b;

    cf(ShareDialogTarget shareDialogTarget, int i, Intent intent) {
        this.f15200b = shareDialogTarget;
        this.f15199a = intent;
        super(i);
    }

    public void onClick(View view) {
        try {
            this.f15200b.f14988a.startActivity(this.f15199a);
        } catch (Throwable th) {
        }
        C2542m.m19082a("share_dialog_target", "line", null);
        this.f15200b.dismiss();
    }
}
