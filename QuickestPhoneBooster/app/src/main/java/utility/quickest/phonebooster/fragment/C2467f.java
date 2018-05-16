package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AboutFragment_ViewBinding */
class C2467f extends DebouncingOnClickListener {
    final /* synthetic */ AboutFragment f13723b;
    final /* synthetic */ AboutFragment_ViewBinding f13724c;

    C2467f(AboutFragment_ViewBinding aboutFragment_ViewBinding, AboutFragment aboutFragment) {
        this.f13724c = aboutFragment_ViewBinding;
        this.f13723b = aboutFragment;
    }

    public void doClick(View view) {
        this.f13723b.openFeedBackPage();
    }
}
