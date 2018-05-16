package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AdForMainPageFragment_ViewBinding */
class C2469g extends DebouncingOnClickListener {
    final /* synthetic */ AdForMainPageFragment f13760b;
    final /* synthetic */ AdForMainPageFragment_ViewBinding f13761c;

    C2469g(AdForMainPageFragment_ViewBinding adForMainPageFragment_ViewBinding, AdForMainPageFragment adForMainPageFragment) {
        this.f13761c = adForMainPageFragment_ViewBinding;
        this.f13760b = adForMainPageFragment;
    }

    public void doClick(View view) {
        this.f13760b.doCleanMemory();
    }
}
