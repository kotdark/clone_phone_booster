package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: CPUCoolingFinishFragment_ViewBinding */
class au extends DebouncingOnClickListener {
    final /* synthetic */ CPUCoolingFinishFragment f13535b;
    final /* synthetic */ CPUCoolingFinishFragment_ViewBinding f13536c;

    au(CPUCoolingFinishFragment_ViewBinding cPUCoolingFinishFragment_ViewBinding, CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13536c = cPUCoolingFinishFragment_ViewBinding;
        this.f13535b = cPUCoolingFinishFragment;
    }

    public void doClick(View view) {
        this.f13535b.doAntivirus();
    }
}
