package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PowerSavingFragment_ViewBinding */
class gh extends DebouncingOnClickListener {
    final /* synthetic */ PowerSavingFragment f13774b;
    final /* synthetic */ PowerSavingFragment_ViewBinding f13775c;

    gh(PowerSavingFragment_ViewBinding powerSavingFragment_ViewBinding, PowerSavingFragment powerSavingFragment) {
        this.f13775c = powerSavingFragment_ViewBinding;
        this.f13774b = powerSavingFragment;
    }

    public void doClick(View view) {
        this.f13774b.doBack();
    }
}
