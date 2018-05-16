package utility.quickest.phonebooster.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenView_ViewBinding */
class bu extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenView f15176b;
    final /* synthetic */ LockedScreenView_ViewBinding f15177c;

    bu(LockedScreenView_ViewBinding lockedScreenView_ViewBinding, LockedScreenView lockedScreenView) {
        this.f15177c = lockedScreenView_ViewBinding;
        this.f15176b = lockedScreenView;
    }

    public void doClick(View view) {
        this.f15176b.doSetting();
    }
}
