package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class ej extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13694b;
    final /* synthetic */ MainFragment_ViewBinding f13695c;

    ej(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13695c = mainFragment_ViewBinding;
        this.f13694b = mainFragment;
    }

    public void doClick(View view) {
        this.f13694b.doCleanMemory(view);
    }
}
