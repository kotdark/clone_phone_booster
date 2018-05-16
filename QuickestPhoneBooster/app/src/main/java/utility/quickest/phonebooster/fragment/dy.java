package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class dy extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13670b;
    final /* synthetic */ MainFragment_ViewBinding f13671c;

    dy(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13671c = mainFragment_ViewBinding;
        this.f13670b = mainFragment;
    }

    public void doClick(View view) {
        this.f13670b.doSetting();
    }
}
