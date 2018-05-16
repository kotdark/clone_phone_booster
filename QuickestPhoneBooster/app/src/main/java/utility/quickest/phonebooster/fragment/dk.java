package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragment_ViewBinding */
class dk extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragment f13650b;
    final /* synthetic */ LockedScreenFragment_ViewBinding f13651c;

    dk(LockedScreenFragment_ViewBinding lockedScreenFragment_ViewBinding, LockedScreenFragment lockedScreenFragment) {
        this.f13651c = lockedScreenFragment_ViewBinding;
        this.f13650b = lockedScreenFragment;
    }

    public void doClick(View view) {
        this.f13650b.onNo();
    }
}
