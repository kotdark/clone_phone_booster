package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class em extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13700b;
    final /* synthetic */ MainFragment_ViewBinding f13701c;

    em(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13701c = mainFragment_ViewBinding;
        this.f13700b = mainFragment;
    }

    public void doClick(View view) {
        this.f13700b.setTemperatureUnit();
    }
}
