package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFinishFragment_ViewBinding */
class at extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFinishFragment f13533b;
    final /* synthetic */ CPUCoolingFinishFragment_ViewBinding f13534c;

    at(CPUCoolingFinishFragment_ViewBinding cPUCoolingFinishFragment_ViewBinding, CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13534c = cPUCoolingFinishFragment_ViewBinding;
        this.f13533b = cPUCoolingFinishFragment;
    }

    public void doClick(View view) {
        this.f13533b.doPowerSaving();
    }
}
