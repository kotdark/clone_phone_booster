package utility.quickest.phonebooster.fragment;

import android.view.View;

import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFinishFragment_ViewBinding */
class C2481r extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFinishFragment f13849b;
    final /* synthetic */ AntivirusFinishFragment_ViewBinding f13850c;

    C2481r(AntivirusFinishFragment_ViewBinding antivirusFinishFragment_ViewBinding, AntivirusFinishFragment antivirusFinishFragment) {
        this.f13850c = antivirusFinishFragment_ViewBinding;
        this.f13849b = antivirusFinishFragment;
    }

    public void doClick(View view) {
        this.f13849b.doCleanStorage();
    }
}
