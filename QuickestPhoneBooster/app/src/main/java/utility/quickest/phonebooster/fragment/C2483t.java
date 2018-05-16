package utility.quickest.phonebooster.fragment;

import android.view.View;

import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFinishFragment_ViewBinding */
class C2483t extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFinishFragment f13853b;
    final /* synthetic */ AntivirusFinishFragment_ViewBinding f13854c;

    C2483t(AntivirusFinishFragment_ViewBinding antivirusFinishFragment_ViewBinding, AntivirusFinishFragment antivirusFinishFragment) {
        this.f13854c = antivirusFinishFragment_ViewBinding;
        this.f13853b = antivirusFinishFragment;
    }

    public void doClick(View view) {
        this.f13853b.doCPUCooling();
    }
}
