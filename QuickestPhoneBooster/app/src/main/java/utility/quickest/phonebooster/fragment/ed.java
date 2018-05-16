package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class ed extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13682b;
    final /* synthetic */ MainFragment_ViewBinding f13683c;

    ed(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13683c = mainFragment_ViewBinding;
        this.f13682b = mainFragment;
    }

    public void doClick(View view) {
        this.f13682b.openPrivacyPolicyDoc();
    }
}
