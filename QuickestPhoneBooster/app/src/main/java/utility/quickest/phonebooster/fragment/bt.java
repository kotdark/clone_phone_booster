package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: FeedBackFragment_ViewBinding */
class bt extends DebouncingOnClickListener {
    final /* synthetic */ FeedBackFragment f13578b;
    final /* synthetic */ FeedBackFragment_ViewBinding f13579c;

    bt(FeedBackFragment_ViewBinding feedBackFragment_ViewBinding, FeedBackFragment feedBackFragment) {
        this.f13579c = feedBackFragment_ViewBinding;
        this.f13578b = feedBackFragment;
    }

    public void doClick(View view) {
        this.f13578b.submit(view);
    }
}
