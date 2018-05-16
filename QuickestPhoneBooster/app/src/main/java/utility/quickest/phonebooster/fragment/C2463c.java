package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AboutFragment_ViewBinding */
class C2463c extends DebouncingOnClickListener {
    final /* synthetic */ AboutFragment f13587b;
    final /* synthetic */ AboutFragment_ViewBinding f13588c;

    C2463c(AboutFragment_ViewBinding aboutFragment_ViewBinding, AboutFragment aboutFragment) {
        this.f13588c = aboutFragment_ViewBinding;
        this.f13587b = aboutFragment;
    }

    public void doClick(View view) {
        this.f13587b.doGPRate();
    }
}
