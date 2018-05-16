package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: LockedScreenFragment_ViewBinding */
class dl extends DebouncingOnClickListener {
    final /* synthetic */ LockedScreenFragment f13652b;
    final /* synthetic */ LockedScreenFragment_ViewBinding f13653c;

    dl(LockedScreenFragment_ViewBinding lockedScreenFragment_ViewBinding, LockedScreenFragment lockedScreenFragment) {
        this.f13653c = lockedScreenFragment_ViewBinding;
        this.f13652b = lockedScreenFragment;
    }

    public void doClick(View view) {
        this.f13652b.doSetting();
    }
}
