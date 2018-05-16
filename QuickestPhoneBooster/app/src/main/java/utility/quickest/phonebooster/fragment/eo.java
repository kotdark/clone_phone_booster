package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class eo extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13704b;
    final /* synthetic */ MainFragment_ViewBinding f13705c;

    eo(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13705c = mainFragment_ViewBinding;
        this.f13704b = mainFragment;
    }

    public void doClick(View view) {
        this.f13704b.doCleanStorage(view);
    }
}
