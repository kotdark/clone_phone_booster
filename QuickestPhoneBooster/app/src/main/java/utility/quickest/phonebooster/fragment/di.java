package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragment_ViewBinding */
class di extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragment f13646b;
    final /* synthetic */ LockedScreenFragment_ViewBinding f13647c;

    di(LockedScreenFragment_ViewBinding lockedScreenFragment_ViewBinding, LockedScreenFragment lockedScreenFragment) {
        this.f13647c = lockedScreenFragment_ViewBinding;
        this.f13646b = lockedScreenFragment;
    }

    public void doClick(View view) {
        this.f13646b.closeLockScreen();
    }
}
