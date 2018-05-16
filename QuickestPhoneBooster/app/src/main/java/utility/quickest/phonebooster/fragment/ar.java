package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFinishFragment_ViewBinding */
class ar extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFinishFragment f13529b;
    final /* synthetic */ CPUCoolingFinishFragment_ViewBinding f13530c;

    ar(CPUCoolingFinishFragment_ViewBinding cPUCoolingFinishFragment_ViewBinding, CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13530c = cPUCoolingFinishFragment_ViewBinding;
        this.f13529b = cPUCoolingFinishFragment;
    }

    public void doClick(View view) {
        this.f13529b.doCleanStorage();
    }
}
