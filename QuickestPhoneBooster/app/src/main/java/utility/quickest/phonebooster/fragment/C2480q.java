package utility.quickest.phonebooster.fragment;

import android.view.View;

import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFinishFragment_ViewBinding */
class C2480q extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFinishFragment f13847b;
    final /* synthetic */ AntivirusFinishFragment_ViewBinding f13848c;

    C2480q(AntivirusFinishFragment_ViewBinding antivirusFinishFragment_ViewBinding, AntivirusFinishFragment antivirusFinishFragment) {
        this.f13848c = antivirusFinishFragment_ViewBinding;
        this.f13847b = antivirusFinishFragment;
    }

    public void doClick(View view) {
        this.f13847b.doBack();
    }
}
