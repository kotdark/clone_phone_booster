package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragment_ViewBinding */
class dj extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragment f13648b;
    final /* synthetic */ LockedScreenFragment_ViewBinding f13649c;

    dj(LockedScreenFragment_ViewBinding lockedScreenFragment_ViewBinding, LockedScreenFragment lockedScreenFragment) {
        this.f13649c = lockedScreenFragment_ViewBinding;
        this.f13648b = lockedScreenFragment;
    }

    public void doClick(View view) {
        this.f13648b.onYes();
    }
}
