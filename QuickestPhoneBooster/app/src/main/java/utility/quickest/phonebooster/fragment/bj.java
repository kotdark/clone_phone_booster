package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.widget.ToggleButton;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

/* compiled from: CPUCoolingFragment_ViewBinding */
class bj extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFragment f13560b;
    final /* synthetic */ CPUCoolingFragment_ViewBinding f13561c;

    bj(CPUCoolingFragment_ViewBinding cPUCoolingFragment_ViewBinding, CPUCoolingFragment cPUCoolingFragment) {
        this.f13561c = cPUCoolingFragment_ViewBinding;
        this.f13560b = cPUCoolingFragment;
    }

    public void doClick(View view) {
        this.f13560b.onTemUnitToggle((ToggleButton)  Utils.m2799a(view, "doClick", 0, "onTemUnitToggle", 0));
    }
}
