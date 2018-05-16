package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: RateDialog_ViewBinding */
class ca extends DebouncingOnClickListener {
    final /* synthetic */ RateDialog f15189b;
    final /* synthetic */ RateDialog_ViewBinding f15190c;

    ca(RateDialog_ViewBinding rateDialog_ViewBinding, RateDialog rateDialog) {
        this.f15190c = rateDialog_ViewBinding;
        this.f15189b = rateDialog;
    }

    public void doClick(View view) {
        this.f15189b.doClose();
    }
}
