package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ToggleButton;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

/* compiled from: MainFragment_ViewBinding */
class et extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13714b;
    final /* synthetic */ MainFragment_ViewBinding f13715c;

    et(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13715c = mainFragment_ViewBinding;
        this.f13714b = mainFragment;
    }

    public void doClick(View view) {
        this.f13714b.onUEImproveToggle((ToggleButton)  Utils.m2799a(view, "doClick", 0, "onUEImproveToggle", 0));
    }
}
