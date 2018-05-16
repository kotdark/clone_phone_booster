package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class ep extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13706b;
    final /* synthetic */ MainFragment_ViewBinding f13707c;

    ep(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13707c = mainFragment_ViewBinding;
        this.f13706b = mainFragment;
    }

    public void doClick(View view) {
        this.f13706b.doCleanStorage(view);
    }
}
