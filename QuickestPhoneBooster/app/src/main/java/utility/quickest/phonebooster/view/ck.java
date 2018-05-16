package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: ShareDialogTarget_ViewBinding */
class ck extends DebouncingOnClickListener {
    final /* synthetic */ ShareDialogTarget f15206b;
    final /* synthetic */ ShareDialogTarget_ViewBinding f15207c;

    ck(ShareDialogTarget_ViewBinding shareDialogTarget_ViewBinding, ShareDialogTarget shareDialogTarget) {
        this.f15207c = shareDialogTarget_ViewBinding;
        this.f15206b = shareDialogTarget;
    }

    public void doClick(View view) {
        this.f15206b.cancel();
    }
}
