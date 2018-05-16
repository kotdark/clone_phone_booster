package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: JunkCleanFinishFragment_ViewBinding */
class ce extends DebouncingOnClickListener {
    final /* synthetic */ JunkCleanFinishFragment f13596b;
    final /* synthetic */ JunkCleanFinishFragment_ViewBinding f13597c;

    ce(JunkCleanFinishFragment_ViewBinding junkCleanFinishFragment_ViewBinding, JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13597c = junkCleanFinishFragment_ViewBinding;
        this.f13596b = junkCleanFinishFragment;
    }

    public void doClick(View view) {
        this.f13596b.doCPUCooling();
    }
}
