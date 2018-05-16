package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class ee extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13684b;
    final /* synthetic */ MainFragment_ViewBinding f13685c;

    ee(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13685c = mainFragment_ViewBinding;
        this.f13684b = mainFragment;
    }

    public void doClick(View view) {
        this.f13684b.doCPUCooling();
    }
}
