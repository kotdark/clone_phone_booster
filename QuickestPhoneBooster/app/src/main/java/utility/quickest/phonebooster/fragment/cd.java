package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: JunkCleanFinishFragment_ViewBinding */
class cd extends DebouncingOnClickListener {
    final /* synthetic */ JunkCleanFinishFragment f13594b;
    final /* synthetic */ JunkCleanFinishFragment_ViewBinding f13595c;

    cd(JunkCleanFinishFragment_ViewBinding junkCleanFinishFragment_ViewBinding, JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13595c = junkCleanFinishFragment_ViewBinding;
        this.f13594b = junkCleanFinishFragment;
    }

    public void doClick(View view) {
        this.f13594b.doCleanMemory();
    }
}
