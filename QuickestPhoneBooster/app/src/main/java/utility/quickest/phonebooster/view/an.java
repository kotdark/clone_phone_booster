package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: EnableLockedScreenTipView_ViewBinding */
class an extends DebouncingOnClickListener {
    final /* synthetic */ EnableLockedScreenTipView f15125b;
    final /* synthetic */ EnableLockedScreenTipView_ViewBinding f15126c;

    an(EnableLockedScreenTipView_ViewBinding enableLockedScreenTipView_ViewBinding, EnableLockedScreenTipView enableLockedScreenTipView) {
        this.f15126c = enableLockedScreenTipView_ViewBinding;
        this.f15125b = enableLockedScreenTipView;
    }

    public void doClick(View view) {
        this.f15125b.doContainerClick();
    }
}
