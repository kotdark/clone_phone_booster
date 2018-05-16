package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: ShareDialog_ViewBinding */
class cn extends DebouncingOnClickListener {
    final /* synthetic */ ShareDialog f15212b;
    final /* synthetic */ ShareDialog_ViewBinding f15213c;

    cn(ShareDialog_ViewBinding shareDialog_ViewBinding, ShareDialog shareDialog) {
        this.f15213c = shareDialog_ViewBinding;
        this.f15212b = shareDialog;
    }

    public void doClick(View view) {
        this.f15212b.doClose();
    }
}
