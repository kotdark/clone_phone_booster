package utility.quickest.phonebooster.view;

import android.content.Intent;
import android.view.View;
import utility.quickest.phonebooster.util.C2542m;

/* compiled from: ShareDialogTarget */
class cd extends cj {
    final /* synthetic */ Intent f15195a;
    final /* synthetic */ ShareDialogTarget f15196b;

    cd(ShareDialogTarget shareDialogTarget, int i, Intent intent) {
        this.f15196b = shareDialogTarget;
        this.f15195a = intent;
        super(i);
    }

    public void onClick(View view) {
        try {
            this.f15196b.f14988a.startActivity(this.f15195a);
        } catch (Throwable th) {
        }
        C2542m.m19082a("share_dialog_target", "messenger", null);
        this.f15196b.dismiss();
    }
}
