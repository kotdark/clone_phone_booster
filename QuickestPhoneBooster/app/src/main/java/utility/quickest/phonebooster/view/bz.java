package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: RateDialog_ViewBinding */
class bz extends DebouncingOnClickListener {
    final /* synthetic */ RateDialog f15186b;
    final /* synthetic */ RateDialog_ViewBinding f15187c;

    bz(RateDialog_ViewBinding rateDialog_ViewBinding, RateDialog rateDialog) {
        this.f15187c = rateDialog_ViewBinding;
        this.f15186b = rateDialog;
    }

    public void doClick(View view) {
        this.f15186b.confirm();
    }
}
