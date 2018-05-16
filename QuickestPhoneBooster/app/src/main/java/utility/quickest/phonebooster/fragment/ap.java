package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: CPUCoolingFinishFragment */
class ap implements OnClickListener {
    final /* synthetic */ CPUCoolingFinishFragment f13527a;

    ap(CPUCoolingFinishFragment cPUCoolingFinishFragment) {
        this.f13527a = cPUCoolingFinishFragment;
    }

    public void onClick(View view) {
        this.f13527a.m17752d();
        this.f13527a.mAdContainer.removeAllViews();
        this.f13527a.mAdContainer.setVisibility(8);
        this.f13527a.mAdContainer1.setVisibility(8);
    }
}
