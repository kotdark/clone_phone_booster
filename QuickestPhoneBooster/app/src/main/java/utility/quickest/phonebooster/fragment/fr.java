package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PowerSavingFinishFragment_ViewBinding */
class fr extends DebouncingOnClickListener {
    final /* synthetic */ PowerSavingFinishFragment f13749b;
    final /* synthetic */ PowerSavingFinishFragment_ViewBinding f13750c;

    fr(PowerSavingFinishFragment_ViewBinding powerSavingFinishFragment_ViewBinding, PowerSavingFinishFragment powerSavingFinishFragment) {
        this.f13750c = powerSavingFinishFragment_ViewBinding;
        this.f13749b = powerSavingFinishFragment;
    }

    public void doClick(View view) {
        this.f13749b.doBack();
    }
}
