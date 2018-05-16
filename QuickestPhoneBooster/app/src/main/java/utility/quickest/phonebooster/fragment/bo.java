package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: EnableSmartFeatureFragment_ViewBinding */
class bo extends DebouncingOnClickListener {
    final /* synthetic */ EnableSmartFeatureFragment f13569b;
    final /* synthetic */ EnableSmartFeatureFragment_ViewBinding f13570c;

    bo(EnableSmartFeatureFragment_ViewBinding enableSmartFeatureFragment_ViewBinding, EnableSmartFeatureFragment enableSmartFeatureFragment) {
        this.f13570c = enableSmartFeatureFragment_ViewBinding;
        this.f13569b = enableSmartFeatureFragment;
    }

    public void doClick(View view) {
        this.f13569b.doClose();
    }
}
