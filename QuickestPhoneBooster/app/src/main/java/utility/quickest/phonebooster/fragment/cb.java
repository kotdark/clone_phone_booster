package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: JunkCleanFinishFragment_ViewBinding */
class cb extends DebouncingOnClickListener {
    final /* synthetic */ JunkCleanFinishFragment f13590b;
    final /* synthetic */ JunkCleanFinishFragment_ViewBinding f13591c;

    cb(JunkCleanFinishFragment_ViewBinding junkCleanFinishFragment_ViewBinding, JunkCleanFinishFragment junkCleanFinishFragment) {
        this.f13591c = junkCleanFinishFragment_ViewBinding;
        this.f13590b = junkCleanFinishFragment;
    }

    public void doClick(View view) {
        this.f13590b.doBack();
    }
}
