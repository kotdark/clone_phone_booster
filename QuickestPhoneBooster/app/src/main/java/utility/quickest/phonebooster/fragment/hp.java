package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: WhiteListFragment_ViewBinding */
class hp extends DebouncingOnClickListener {
    final /* synthetic */ WhiteListFragment f13828b;
    final /* synthetic */ WhiteListFragment_ViewBinding f13829c;

    hp(WhiteListFragment_ViewBinding whiteListFragment_ViewBinding, WhiteListFragment whiteListFragment) {
        this.f13829c = whiteListFragment_ViewBinding;
        this.f13828b = whiteListFragment;
    }

    public void doClick(View view) {
        this.f13828b.doBack();
    }
}
