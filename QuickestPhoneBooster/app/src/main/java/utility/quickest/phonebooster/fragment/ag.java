package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFragment_ViewBinding */
class ag extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFragment f13516b;
    final /* synthetic */ AntivirusFragment_ViewBinding f13517c;

    ag(AntivirusFragment_ViewBinding antivirusFragment_ViewBinding, AntivirusFragment antivirusFragment) {
        this.f13517c = antivirusFragment_ViewBinding;
        this.f13516b = antivirusFragment;
    }

    public void doClick(View view) {
        this.f13516b.doIgnore();
    }
}
