package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ToggleButton;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

/* compiled from: MainFragment_ViewBinding */
class ec extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13680b;
    final /* synthetic */ MainFragment_ViewBinding f13681c;

    ec(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13681c = mainFragment_ViewBinding;
        this.f13680b = mainFragment;
    }

    public void doClick(View view) {
        this.f13680b.onNotiToolBarToggle((ToggleButton)  Utils.m2799a(view, "doClick", 0, "onNotiToolBarToggle", 0));
    }
}
