package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFinishFragment_ViewBinding */
class as extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFinishFragment f13531b;
    final /* synthetic */ CPUCoolingFinishFragment_ViewBinding f13532c;

    as(CPUCoolingFinishFragment_ViewBinding cPUCoolingFinishFragment_ViewBinding, CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13532c = cPUCoolingFinishFragment_ViewBinding;
        this.f13531b = cPUCoolingFinishFragment;
    }

    public void doClick(View view) {
        this.f13531b.doCleanMemory();
    }
}
