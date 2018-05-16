package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: EnableLockedScreenTipView_ViewBinding */
class ao extends DebouncingOnClickListener {
    final /* synthetic */ EnableLockedScreenTipView f15127b;
    final /* synthetic */ EnableLockedScreenTipView_ViewBinding f15128c;

    ao(EnableLockedScreenTipView_ViewBinding enableLockedScreenTipView_ViewBinding, EnableLockedScreenTipView enableLockedScreenTipView) {
        this.f15128c = enableLockedScreenTipView_ViewBinding;
        this.f15127b = enableLockedScreenTipView;
    }

    public void doClick(View view) {
        this.f15127b.doTip();
    }
}
