package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PowerSavingFragmentNew_ViewBinding */
class gd extends DebouncingOnClickListener {
    final /* synthetic */ PowerSavingFragmentNew f13766b;
    final /* synthetic */ PowerSavingFragmentNew_ViewBinding f13767c;

    gd(PowerSavingFragmentNew_ViewBinding powerSavingFragmentNew_ViewBinding, PowerSavingFragmentNew powerSavingFragmentNew) {
        this.f13767c = powerSavingFragmentNew_ViewBinding;
        this.f13766b = powerSavingFragmentNew;
    }

    public void doClick(View view) {
        this.f13766b.doBack();
    }
}
