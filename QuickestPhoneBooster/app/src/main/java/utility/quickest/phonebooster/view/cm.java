package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: ShareDialog_ViewBinding */
class cm extends DebouncingOnClickListener {
    final /* synthetic */ ShareDialog f15210b;
    final /* synthetic */ ShareDialog_ViewBinding f15211c;

    cm(ShareDialog_ViewBinding shareDialog_ViewBinding, ShareDialog shareDialog) {
        this.f15211c = shareDialog_ViewBinding;
        this.f15210b = shareDialog;
    }

    public void doClick(View view) {
        this.f15210b.confirm();
    }
}
