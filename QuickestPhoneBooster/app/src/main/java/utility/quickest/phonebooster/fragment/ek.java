package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class ek extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13696b;
    final /* synthetic */ MainFragment_ViewBinding f13697c;

    ek(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13697c = mainFragment_ViewBinding;
        this.f13696b = mainFragment;
    }

    public void doClick(View view) {
        this.f13696b.doShare();
    }
}
