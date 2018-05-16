package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class en extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13702b;
    final /* synthetic */ MainFragment_ViewBinding f13703c;

    en(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13703c = mainFragment_ViewBinding;
        this.f13702b = mainFragment;
    }

    public void doClick(View view) {
        this.f13702b.doCleanMemory(view);
    }
}
