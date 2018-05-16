package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFinishFragment_ViewBinding */
class av extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFinishFragment f13537b;
    final /* synthetic */ CPUCoolingFinishFragment_ViewBinding f13538c;

    av(CPUCoolingFinishFragment_ViewBinding cPUCoolingFinishFragment_ViewBinding, CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13538c = cPUCoolingFinishFragment_ViewBinding;
        this.f13537b = cPUCoolingFinishFragment;
    }

    public void doClick(View view) {
        this.f13537b.doOpenQuickBoost();
    }
}
