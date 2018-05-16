package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class el extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13698b;
    final /* synthetic */ MainFragment_ViewBinding f13699c;

    el(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13699c = mainFragment_ViewBinding;
        this.f13698b = mainFragment;
    }

    public void doClick(View view) {
        this.f13698b.checkUpdate();
    }
}
