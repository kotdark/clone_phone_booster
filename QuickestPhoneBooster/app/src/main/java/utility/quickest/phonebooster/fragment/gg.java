package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PowerSavingFragment_ViewBinding */
class gg extends DebouncingOnClickListener {
    final /* synthetic */ PowerSavingFragment f13772b;
    final /* synthetic */ PowerSavingFragment_ViewBinding f13773c;

    gg(PowerSavingFragment_ViewBinding powerSavingFragment_ViewBinding, PowerSavingFragment powerSavingFragment) {
        this.f13773c = powerSavingFragment_ViewBinding;
        this.f13772b = powerSavingFragment;
    }

    public void doClick(View view) {
        this.f13772b.doBack();
    }
}
