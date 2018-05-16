package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ToggleButton;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

/* compiled from: MainFragment_ViewBinding */
class eb extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13678b;
    final /* synthetic */ MainFragment_ViewBinding f13679c;

    eb(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13679c = mainFragment_ViewBinding;
        this.f13678b = mainFragment;
    }

    public void doClick(View view) {
        this.f13678b.onLockScreenToggle((ToggleButton)  Utils.m2799a(view, "doClick", 0, "onLockScreenToggle", 0));
    }
}
