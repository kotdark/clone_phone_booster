package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: JunkCleanFinishFragment_ViewBinding */
class ci extends DebouncingOnClickListener {
    final /* synthetic */ JunkCleanFinishFragment f13604b;
    final /* synthetic */ JunkCleanFinishFragment_ViewBinding f13605c;

    ci(JunkCleanFinishFragment_ViewBinding junkCleanFinishFragment_ViewBinding, JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13605c = junkCleanFinishFragment_ViewBinding;
        this.f13604b = junkCleanFinishFragment;
    }

    public void doClick(View view) {
        this.f13604b.doOpenLs();
    }
}
