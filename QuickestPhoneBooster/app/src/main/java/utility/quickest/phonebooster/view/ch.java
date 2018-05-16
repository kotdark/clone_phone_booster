package utility.quickest.phonebooster.view;

import android.content.Intent;
import android.view.View;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

/* compiled from: ShareDialogTarget */
class ch extends cj {
    final /* synthetic */ ShareDialogTarget f15202a;

    ch(ShareDialogTarget shareDialogTarget, int i) {
        this.f15202a = shareDialogTarget;
        super(i);
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f15202a.m19240b("http://m.onelink.me/dd544b2b"));
        try {
            intent = Intent.createChooser(intent, MyApplicationLike.getApplication().getString(R.string.share_chooser_title));
            intent.setFlags(335544320);
            MyApplicationLike.getApplication().startActivity(intent);
        } catch (Throwable th) {
        }
        C2542m.m19082a("share_dialog_target", "more", null);
        this.f15202a.dismiss();
    }
}
