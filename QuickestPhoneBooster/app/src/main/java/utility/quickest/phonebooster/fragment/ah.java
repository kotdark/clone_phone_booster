package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFragment_ViewBinding */
class ah extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFragment f13518b;
    final /* synthetic */ AntivirusFragment_ViewBinding f13519c;

    ah(AntivirusFragment_ViewBinding antivirusFragment_ViewBinding, AntivirusFragment antivirusFragment) {
        this.f13519c = antivirusFragment_ViewBinding;
        this.f13518b = antivirusFragment;
    }

    public void doClick(View view) {
        this.f13518b.doFix();
    }
}
