package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class es extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13712b;
    final /* synthetic */ MainFragment_ViewBinding f13713c;

    es(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13713c = mainFragment_ViewBinding;
        this.f13712b = mainFragment;
    }

    public void doClick(View view) {
        this.f13712b.onSpeedUpBallToggle();
    }
}
