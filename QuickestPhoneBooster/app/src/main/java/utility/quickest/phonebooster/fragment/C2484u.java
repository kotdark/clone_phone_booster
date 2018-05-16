package utility.quickest.phonebooster.fragment;

import android.view.View;

import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFinishFragment_ViewBinding */
class C2484u extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFinishFragment f13855b;
    final /* synthetic */ AntivirusFinishFragment_ViewBinding f13856c;

    C2484u(AntivirusFinishFragment_ViewBinding antivirusFinishFragment_ViewBinding, AntivirusFinishFragment antivirusFinishFragment) {
        this.f13856c = antivirusFinishFragment_ViewBinding;
        this.f13855b = antivirusFinishFragment;
    }

    public void doClick(View view) {
        this.f13855b.doPowerSaving();
    }
}
