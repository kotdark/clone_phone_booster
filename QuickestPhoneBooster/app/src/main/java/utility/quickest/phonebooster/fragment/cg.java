package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: JunkCleanFinishFragment_ViewBinding */
class cg extends DebouncingOnClickListener {
    final /* synthetic */ JunkCleanFinishFragment f13600b;
    final /* synthetic */ JunkCleanFinishFragment_ViewBinding f13601c;

    cg(JunkCleanFinishFragment_ViewBinding junkCleanFinishFragment_ViewBinding, JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13601c = junkCleanFinishFragment_ViewBinding;
        this.f13600b = junkCleanFinishFragment;
    }

    public void doClick(View view) {
        this.f13600b.doAntivirus();
    }
}
