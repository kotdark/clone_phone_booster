package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: EnableSmartFeatureFragment_ViewBinding */
class bp extends DebouncingOnClickListener {
    final /* synthetic */ EnableSmartFeatureFragment f13571b;
    final /* synthetic */ EnableSmartFeatureFragment_ViewBinding f13572c;

    bp(EnableSmartFeatureFragment_ViewBinding enableSmartFeatureFragment_ViewBinding, EnableSmartFeatureFragment enableSmartFeatureFragment) {
        this.f13572c = enableSmartFeatureFragment_ViewBinding;
        this.f13571b = enableSmartFeatureFragment;
    }

    public void doClick(View view) {
        this.f13571b.doOk();
    }
}
