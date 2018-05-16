package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: EnableNotiToolBarFragment_ViewBinding */
class bm extends DebouncingOnClickListener {
    final /* synthetic */ EnableNotiToolBarFragment f13565b;
    final /* synthetic */ EnableNotiToolBarFragment_ViewBinding f13566c;

    bm(EnableNotiToolBarFragment_ViewBinding enableNotiToolBarFragment_ViewBinding, EnableNotiToolBarFragment enableNotiToolBarFragment) {
        this.f13566c = enableNotiToolBarFragment_ViewBinding;
        this.f13565b = enableNotiToolBarFragment;
    }

    public void doClick(View view) {
        this.f13565b.doClose();
    }
}
