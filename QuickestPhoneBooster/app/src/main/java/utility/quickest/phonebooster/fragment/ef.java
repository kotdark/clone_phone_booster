package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class ef extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13686b;
    final /* synthetic */ MainFragment_ViewBinding f13687c;

    ef(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13687c = mainFragment_ViewBinding;
        this.f13686b = mainFragment;
    }

    public void doClick(View view) {
        this.f13686b.doPowerSaving();
    }
}
