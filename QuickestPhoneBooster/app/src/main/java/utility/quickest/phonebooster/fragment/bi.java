package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFragment_ViewBinding */
class bi extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFragment f13558b;
    final /* synthetic */ CPUCoolingFragment_ViewBinding f13559c;

    bi(CPUCoolingFragment_ViewBinding cPUCoolingFragment_ViewBinding, CPUCoolingFragment cPUCoolingFragment) {
        this.f13559c = cPUCoolingFragment_ViewBinding;
        this.f13558b = cPUCoolingFragment;
    }

    public void doClick(View view) {
        this.f13558b.doClean();
    }
}
