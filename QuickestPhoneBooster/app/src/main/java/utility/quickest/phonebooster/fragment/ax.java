package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFinishFragment_ViewBinding */
class ax extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFinishFragment f13541b;
    final /* synthetic */ CPUCoolingFinishFragment_ViewBinding f13542c;

    ax(CPUCoolingFinishFragment_ViewBinding cPUCoolingFinishFragment_ViewBinding, CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13542c = cPUCoolingFinishFragment_ViewBinding;
        this.f13541b = cPUCoolingFinishFragment;
    }

    public void doClick(View view) {
        this.f13541b.doOpenNT();
    }
}
