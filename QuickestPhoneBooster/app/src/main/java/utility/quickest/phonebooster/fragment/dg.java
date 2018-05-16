package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragment_ViewBinding */
class dg extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragment f13642b;
    final /* synthetic */ LockedScreenFragment_ViewBinding f13643c;

    dg(LockedScreenFragment_ViewBinding lockedScreenFragment_ViewBinding, LockedScreenFragment lockedScreenFragment) {
        this.f13643c = lockedScreenFragment_ViewBinding;
        this.f13642b = lockedScreenFragment;
    }

    public void doClick(View view) {
        this.f13642b.closeWindow();
    }
}
