package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class eh extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13690b;
    final /* synthetic */ MainFragment_ViewBinding f13691c;

    eh(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13691c = mainFragment_ViewBinding;
        this.f13690b = mainFragment;
    }

    public void doClick(View view) {
        this.f13690b.exitNo();
    }
}
