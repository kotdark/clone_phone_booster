package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFragment_ViewBinding */
class bh extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFragment f13556b;
    final /* synthetic */ CPUCoolingFragment_ViewBinding f13557c;

    bh(CPUCoolingFragment_ViewBinding cPUCoolingFragment_ViewBinding, CPUCoolingFragment cPUCoolingFragment) {
        this.f13557c = cPUCoolingFragment_ViewBinding;
        this.f13556b = cPUCoolingFragment;
    }

    public void doClick(View view) {
        this.f13556b.doBack();
    }
}
