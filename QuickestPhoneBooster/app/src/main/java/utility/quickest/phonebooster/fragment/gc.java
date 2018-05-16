package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PowerSavingFragmentNew_ViewBinding */
class gc extends DebouncingOnClickListener {
    final /* synthetic */ PowerSavingFragmentNew f13764b;
    final /* synthetic */ PowerSavingFragmentNew_ViewBinding f13765c;

    gc(PowerSavingFragmentNew_ViewBinding powerSavingFragmentNew_ViewBinding, PowerSavingFragmentNew powerSavingFragmentNew) {
        this.f13765c = powerSavingFragmentNew_ViewBinding;
        this.f13764b = powerSavingFragmentNew;
    }

    public void doClick(View view) {
        this.f13764b.doClean();
    }
}
