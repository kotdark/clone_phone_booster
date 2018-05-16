package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class dz extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13672b;
    final /* synthetic */ MainFragment_ViewBinding f13673c;

    dz(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13673c = mainFragment_ViewBinding;
        this.f13672b = mainFragment;
    }

    public void doClick(View view) {
        this.f13672b.openAbout();
    }
}
