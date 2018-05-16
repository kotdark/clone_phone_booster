package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ToggleButton;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

/* compiled from: MainFragment_ViewBinding */
class ea extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13676b;
    final /* synthetic */ MainFragment_ViewBinding f13677c;

    ea(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13677c = mainFragment_ViewBinding;
        this.f13676b = mainFragment;
    }

    public void doClick(View view) {
        this.f13676b.onCleanNoticeToggle((ToggleButton)  Utils.m2799a(view, "doClick", 0, "onCleanNoticeToggle", 0));
    }
}
