package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: RateDialog_ViewBinding */
class cb extends DebouncingOnClickListener {
    final /* synthetic */ RateDialog f15191b;
    final /* synthetic */ RateDialog_ViewBinding f15192c;

    cb(RateDialog_ViewBinding rateDialog_ViewBinding, RateDialog rateDialog) {
        this.f15192c = rateDialog_ViewBinding;
        this.f15191b = rateDialog;
    }

    public void doClick(View view) {
        this.f15191b.doClose();
    }
}
