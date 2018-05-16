package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: JunkCleanFinishFragment_ViewBinding */
class cc extends DebouncingOnClickListener {
    final /* synthetic */ JunkCleanFinishFragment f13592b;
    final /* synthetic */ JunkCleanFinishFragment_ViewBinding f13593c;

    cc(JunkCleanFinishFragment_ViewBinding junkCleanFinishFragment_ViewBinding, JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13593c = junkCleanFinishFragment_ViewBinding;
        this.f13592b = junkCleanFinishFragment;
    }

    public void doClick(View view) {
        this.f13592b.doCleanStorage();
    }
}
