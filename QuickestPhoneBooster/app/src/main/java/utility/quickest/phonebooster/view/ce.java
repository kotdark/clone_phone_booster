package utility.quickest.phonebooster.view;

import android.content.Intent;
import android.view.View;
import utility.quickest.phonebooster.util.C2542m;

/* compiled from: ShareDialogTarget */
class ce extends cj {
    final /* synthetic */ Intent f15197a;
    final /* synthetic */ ShareDialogTarget f15198b;

    ce(ShareDialogTarget shareDialogTarget, int i, Intent intent) {
        this.f15198b = shareDialogTarget;
        this.f15197a = intent;
        super(i);
    }

    public void onClick(View view) {
        try {
            this.f15198b.f14988a.startActivity(this.f15197a);
        } catch (Throwable th) {
        }
        C2542m.m19082a("share_dialog_target", "whatsapp", null);
        this.f15198b.dismiss();
    }
}
