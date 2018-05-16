package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AboutFragment_ViewBinding */
class C2464d extends DebouncingOnClickListener {
    final /* synthetic */ AboutFragment f13628b;
    final /* synthetic */ AboutFragment_ViewBinding f13629c;

    C2464d(AboutFragment_ViewBinding aboutFragment_ViewBinding, AboutFragment aboutFragment) {
        this.f13629c = aboutFragment_ViewBinding;
        this.f13628b = aboutFragment;
    }

    public void doClick(View view) {
        this.f13628b.openPrivacyPolicyDoc();
    }
}
