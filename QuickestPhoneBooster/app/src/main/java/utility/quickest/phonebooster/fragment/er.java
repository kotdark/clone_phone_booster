package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: MainFragment_ViewBinding */
class er extends DebouncingOnClickListener {
    final /* synthetic */ MainFragment f13710b;
    final /* synthetic */ MainFragment_ViewBinding f13711c;

    er(MainFragment_ViewBinding mainFragment_ViewBinding, MainFragment mainFragment) {
        this.f13711c = mainFragment_ViewBinding;
        this.f13710b = mainFragment;
    }

    public void doClick(View view) {
        this.f13710b.openWhiteListPage();
    }
}
