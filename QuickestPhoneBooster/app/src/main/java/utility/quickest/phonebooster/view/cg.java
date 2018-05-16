package utility.quickest.phonebooster.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

/* compiled from: ShareDialogTarget */
class cg extends cj {
    final /* synthetic */ ShareDialogTarget f15201a;

    cg(ShareDialogTarget shareDialogTarget, int i) {
        this.f15201a = shareDialogTarget;
        super(i);
    }

    public void onClick(View view) {
        try {
            ((ClipboardManager) MyApplicationLike.getApplication().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", this.f15201a.m19240b("http://m.onelink.me/1b8eea82")));
        } catch (Throwable th) {
        }
        C2542m.m19082a("share_dialog_target", "copy", null);
        Toast.makeText(MyApplicationLike.getApplication(), MyApplicationLike.getApplication().getResources().getString(R.string.copy_success), 1).show();
        this.f15201a.dismiss();
    }
}
