package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: JunkCleanFinishFragment_ViewBinding */
class ch extends DebouncingOnClickListener {
    final /* synthetic */ JunkCleanFinishFragment f13602b;
    final /* synthetic */ JunkCleanFinishFragment_ViewBinding f13603c;

    ch(JunkCleanFinishFragment_ViewBinding junkCleanFinishFragment_ViewBinding, JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13603c = junkCleanFinishFragment_ViewBinding;
        this.f13602b = junkCleanFinishFragment;
    }

    public void doClick(View view) {
        this.f13602b.doOpenQuickBoost();
    }
}
