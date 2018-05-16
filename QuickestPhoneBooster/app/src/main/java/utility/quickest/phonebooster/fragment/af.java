package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFragment_ViewBinding */
class af extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFragment f13514b;
    final /* synthetic */ AntivirusFragment_ViewBinding f13515c;

    af(AntivirusFragment_ViewBinding antivirusFragment_ViewBinding, AntivirusFragment antivirusFragment) {
        this.f13515c = antivirusFragment_ViewBinding;
        this.f13514b = antivirusFragment;
    }

    public void doClick(View view) {
        this.f13514b.doBack();
    }
}
