package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFinishFragment_ViewBinding */
class ay extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFinishFragment f13543b;
    final /* synthetic */ CPUCoolingFinishFragment_ViewBinding f13544c;

    ay(CPUCoolingFinishFragment_ViewBinding cPUCoolingFinishFragment_ViewBinding, CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13544c = cPUCoolingFinishFragment_ViewBinding;
        this.f13543b = cPUCoolingFinishFragment;
    }

    public void doClick(View view) {
        this.f13543b.doBack();
    }
}
