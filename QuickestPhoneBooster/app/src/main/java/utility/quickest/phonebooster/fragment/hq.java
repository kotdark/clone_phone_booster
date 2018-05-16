package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: WhiteListFragment_ViewBinding */
class hq extends DebouncingOnClickListener {
    final /* synthetic */ WhiteListFragment f13830b;
    final /* synthetic */ WhiteListFragment_ViewBinding f13831c;

    hq(WhiteListFragment_ViewBinding whiteListFragment_ViewBinding, WhiteListFragment whiteListFragment) {
        this.f13831c = whiteListFragment_ViewBinding;
        this.f13830b = whiteListFragment;
    }

    public void doClick(View view) {
        this.f13830b.openAddWhiteListPage(view);
    }
}
