package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: EnableNotiToolBarFragment_ViewBinding */
class bn extends DebouncingOnClickListener {
    final /* synthetic */ EnableNotiToolBarFragment f13567b;
    final /* synthetic */ EnableNotiToolBarFragment_ViewBinding f13568c;

    bn(EnableNotiToolBarFragment_ViewBinding enableNotiToolBarFragment_ViewBinding, EnableNotiToolBarFragment enableNotiToolBarFragment) {
        this.f13568c = enableNotiToolBarFragment_ViewBinding;
        this.f13567b = enableNotiToolBarFragment;
    }

    public void doClick(View view) {
        this.f13567b.doOk();
    }
}
