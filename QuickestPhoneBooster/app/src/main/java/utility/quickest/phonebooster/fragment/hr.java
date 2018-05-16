package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: WhiteListFragment_ViewBinding */
class hr extends DebouncingOnClickListener {
    final /* synthetic */ WhiteListFragment f13832b;
    final /* synthetic */ WhiteListFragment_ViewBinding f13833c;

    hr(WhiteListFragment_ViewBinding whiteListFragment_ViewBinding, WhiteListFragment whiteListFragment) {
        this.f13833c = whiteListFragment_ViewBinding;
        this.f13832b = whiteListFragment;
    }

    public void doClick(View view) {
        this.f13832b.openAddWhiteListPage(view);
    }
}
