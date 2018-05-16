package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AboutFragment_ViewBinding */
class C2460b extends DebouncingOnClickListener {
    final /* synthetic */ AboutFragment f13546b;
    final /* synthetic */ AboutFragment_ViewBinding f13547c;

    C2460b(AboutFragment_ViewBinding aboutFragment_ViewBinding, AboutFragment aboutFragment) {
        this.f13547c = aboutFragment_ViewBinding;
        this.f13546b = aboutFragment;
    }

    public void doClick(View view) {
        this.f13546b.doBack();
    }
}
