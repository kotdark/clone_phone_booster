package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AdForMainPageFragment_ViewBinding */
class C2471h extends DebouncingOnClickListener {
    final /* synthetic */ AdForMainPageFragment f13806b;
    final /* synthetic */ AdForMainPageFragment_ViewBinding f13807c;

    C2471h(AdForMainPageFragment_ViewBinding adForMainPageFragment_ViewBinding, AdForMainPageFragment adForMainPageFragment) {
        this.f13807c = adForMainPageFragment_ViewBinding;
        this.f13806b = adForMainPageFragment;
    }

    public void doClick(View view) {
        this.f13806b.doCleanMemory();
    }
}
