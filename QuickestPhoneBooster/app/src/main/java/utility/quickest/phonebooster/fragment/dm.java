package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragment_ViewBinding */
class dm extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragment f13654b;
    final /* synthetic */ LockedScreenFragment_ViewBinding f13655c;

    dm(LockedScreenFragment_ViewBinding lockedScreenFragment_ViewBinding, LockedScreenFragment lockedScreenFragment) {
        this.f13655c = lockedScreenFragment_ViewBinding;
        this.f13654b = lockedScreenFragment;
    }

    public void doClick(View view) {
        this.f13654b.openMemoryClean();
    }
}
