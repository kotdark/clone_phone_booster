package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: JunkCleanFinishFragment_ViewBinding */
class cj extends DebouncingOnClickListener {
    final /* synthetic */ JunkCleanFinishFragment f13606b;
    final /* synthetic */ JunkCleanFinishFragment_ViewBinding f13607c;

    cj(JunkCleanFinishFragment_ViewBinding junkCleanFinishFragment_ViewBinding, JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13607c = junkCleanFinishFragment_ViewBinding;
        this.f13606b = junkCleanFinishFragment;
    }

    public void doClick(View view) {
        this.f13606b.doOpenNT();
    }
}
