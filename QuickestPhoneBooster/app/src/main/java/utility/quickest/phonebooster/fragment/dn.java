package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragment_ViewBinding */
class dn extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragment f13656b;
    final /* synthetic */ LockedScreenFragment_ViewBinding f13657c;

    dn(LockedScreenFragment_ViewBinding lockedScreenFragment_ViewBinding, LockedScreenFragment lockedScreenFragment) {
        this.f13657c = lockedScreenFragment_ViewBinding;
        this.f13656b = lockedScreenFragment;
    }

    public void doClick(View view) {
        this.f13656b.openJunkClean();
    }
}
