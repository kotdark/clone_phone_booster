package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AboutFragment_ViewBinding */
class C2466e extends DebouncingOnClickListener {
    final /* synthetic */ AboutFragment f13674b;
    final /* synthetic */ AboutFragment_ViewBinding f13675c;

    C2466e(AboutFragment_ViewBinding aboutFragment_ViewBinding, AboutFragment aboutFragment) {
        this.f13675c = aboutFragment_ViewBinding;
        this.f13674b = aboutFragment;
    }

    public void doClick(View view) {
        this.f13674b.openRulesDoc();
    }
}
