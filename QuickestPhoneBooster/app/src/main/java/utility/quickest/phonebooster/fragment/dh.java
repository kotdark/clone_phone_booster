package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragment_ViewBinding */
class dh extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragment f13644b;
    final /* synthetic */ LockedScreenFragment_ViewBinding f13645c;

    dh(LockedScreenFragment_ViewBinding lockedScreenFragment_ViewBinding, LockedScreenFragment lockedScreenFragment) {
        this.f13645c = lockedScreenFragment_ViewBinding;
        this.f13644b = lockedScreenFragment;
    }

    public void doClick(View view) {
        this.f13644b.closeChoiceDialog();
    }
}
