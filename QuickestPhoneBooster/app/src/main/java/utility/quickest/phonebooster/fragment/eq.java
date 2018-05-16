package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class eq extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13708b;
    final /* synthetic */ MainFragment_ViewBinding f13709c;

    eq(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13709c = mainFragment_ViewBinding;
        this.f13708b = mainFragment;
    }

    public void doClick(View view) {
        this.f13708b.exitNo();
    }
}
