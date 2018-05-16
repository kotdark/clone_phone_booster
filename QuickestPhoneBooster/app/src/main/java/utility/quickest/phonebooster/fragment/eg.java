package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class eg extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13688b;
    final /* synthetic */ MainFragment_ViewBinding f13689c;

    eg(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13689c = mainFragment_ViewBinding;
        this.f13688b = mainFragment;
    }

    public void doClick(View view) {
        this.f13688b.doAntivirus();
    }
}
