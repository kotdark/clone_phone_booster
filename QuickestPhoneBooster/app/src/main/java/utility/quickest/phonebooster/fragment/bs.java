package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: FeedBackFragment_ViewBinding */
class bs extends DebouncingOnClickListener {
    final /* synthetic */ FeedBackFragment f13576b;
    final /* synthetic */ FeedBackFragment_ViewBinding f13577c;

    bs(FeedBackFragment_ViewBinding feedBackFragment_ViewBinding, FeedBackFragment feedBackFragment) {
        this.f13577c = feedBackFragment_ViewBinding;
        this.f13576b = feedBackFragment;
    }

    public void doClick(View view) {
        this.f13576b.doBack();
    }
}
