package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PowerSavingFinishFragment_ViewBinding */
class fs extends DebouncingOnClickListener {
    final /* synthetic */ PowerSavingFinishFragment f13751b;
    final /* synthetic */ PowerSavingFinishFragment_ViewBinding f13752c;

    fs(PowerSavingFinishFragment_ViewBinding powerSavingFinishFragment_ViewBinding, PowerSavingFinishFragment powerSavingFinishFragment) {
        this.f13752c = powerSavingFinishFragment_ViewBinding;
        this.f13751b = powerSavingFinishFragment;
    }

    public void doClick(View view) {
        this.f13751b.doBack();
    }
}
