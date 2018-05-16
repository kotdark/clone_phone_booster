package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: ShareDialogTarget_ViewBinding */
class cl extends DebouncingOnClickListener {
    final /* synthetic */ ShareDialogTarget f15208b;
    final /* synthetic */ ShareDialogTarget_ViewBinding f15209c;

    cl(ShareDialogTarget_ViewBinding shareDialogTarget_ViewBinding, ShareDialogTarget shareDialogTarget) {
        this.f15209c = shareDialogTarget_ViewBinding;
        this.f15208b = shareDialogTarget;
    }

    public void doClick(View view) {
        this.f15208b.cancel();
    }
}
