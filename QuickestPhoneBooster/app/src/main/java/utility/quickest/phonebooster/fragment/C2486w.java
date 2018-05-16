package utility.quickest.phonebooster.fragment;

import android.view.View;

import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFinishFragment_ViewBinding */
class C2486w extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFinishFragment f13859b;
    final /* synthetic */ AntivirusFinishFragment_ViewBinding f13860c;

    C2486w(AntivirusFinishFragment_ViewBinding antivirusFinishFragment_ViewBinding, AntivirusFinishFragment antivirusFinishFragment) {
        this.f13860c = antivirusFinishFragment_ViewBinding;
        this.f13859b = antivirusFinishFragment;
    }

    public void doClick(View view) {
        this.f13859b.doOpenLs();
    }
}
