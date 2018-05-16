package utility.quickest.phonebooster.fragment;

import android.view.View;

import butterknife.internal.DebouncingOnClickListener;

/* compiled from: AntivirusFinishFragment_ViewBinding */
class C2487x extends DebouncingOnClickListener {
    final /* synthetic */ AntivirusFinishFragment f13861b;
    final /* synthetic */ AntivirusFinishFragment_ViewBinding f13862c;

    C2487x(AntivirusFinishFragment_ViewBinding antivirusFinishFragment_ViewBinding, AntivirusFinishFragment antivirusFinishFragment) {
        this.f13862c = antivirusFinishFragment_ViewBinding;
        this.f13861b = antivirusFinishFragment;
    }

    public void doClick(View view) {
        this.f13861b.doOpenNT();
    }
}
