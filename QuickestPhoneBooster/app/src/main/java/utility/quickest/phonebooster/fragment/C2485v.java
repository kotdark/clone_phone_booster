package utility.quickest.phonebooster.fragment;

import android.view.View;

import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFinishFragment_ViewBinding */
class C2485v extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFinishFragment f13857b;
    final /* synthetic */ AntivirusFinishFragment_ViewBinding f13858c;

    C2485v(AntivirusFinishFragment_ViewBinding antivirusFinishFragment_ViewBinding, AntivirusFinishFragment antivirusFinishFragment) {
        this.f13858c = antivirusFinishFragment_ViewBinding;
        this.f13857b = antivirusFinishFragment;
    }

    public void doClick(View view) {
        this.f13857b.doOpenQuickBoost();
    }
}
