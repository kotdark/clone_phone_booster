package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PowerSavingFragmentNew_ViewBinding */
class ge extends DebouncingOnClickListener {
    final /* synthetic */ PowerSavingFragmentNew f13768b;
    final /* synthetic */ PowerSavingFragmentNew_ViewBinding f13769c;

    ge(PowerSavingFragmentNew_ViewBinding powerSavingFragmentNew_ViewBinding, PowerSavingFragmentNew powerSavingFragmentNew) {
        this.f13769c = powerSavingFragmentNew_ViewBinding;
        this.f13768b = powerSavingFragmentNew;
    }

    public void doClick(View view) {
        this.f13768b.doBack();
    }
}
