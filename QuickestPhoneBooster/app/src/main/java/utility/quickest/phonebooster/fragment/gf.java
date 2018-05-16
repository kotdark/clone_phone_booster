package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: PowerSavingFragment_ViewBinding */
class gf extends DebouncingOnClickListener {
    final /* synthetic */ PowerSavingFragment f13770b;
    final /* synthetic */ PowerSavingFragment_ViewBinding f13771c;

    gf(PowerSavingFragment_ViewBinding powerSavingFragment_ViewBinding, PowerSavingFragment powerSavingFragment) {
        this.f13771c = powerSavingFragment_ViewBinding;
        this.f13770b = powerSavingFragment;
    }

    public void doClick(View view) {
        this.f13770b.doClean();
    }
}
