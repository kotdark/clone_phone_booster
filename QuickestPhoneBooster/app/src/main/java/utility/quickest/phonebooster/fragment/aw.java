package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFinishFragment_ViewBinding */
class aw extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFinishFragment f13539b;
    final /* synthetic */ CPUCoolingFinishFragment_ViewBinding f13540c;

    aw(CPUCoolingFinishFragment_ViewBinding cPUCoolingFinishFragment_ViewBinding, CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13540c = cPUCoolingFinishFragment_ViewBinding;
        this.f13539b = cPUCoolingFinishFragment;
    }

    public void doClick(View view) {
        this.f13539b.doOpenLs();
    }
}
