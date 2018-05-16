package utility.quickest.phonebooster.fragment;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

/* compiled from: FeedBackFragment_ViewBinding */
class bu extends DebouncingOnClickListener {
    final /* synthetic */ FeedBackFragment f13580b;
    final /* synthetic */ FeedBackFragment_ViewBinding f13581c;

    bu(FeedBackFragment_ViewBinding feedBackFragment_ViewBinding, FeedBackFragment feedBackFragment) {
        this.f13581c = feedBackFragment_ViewBinding;
        this.f13580b = feedBackFragment;
    }

    public void doClick(View view) {
        this.f13580b.submit(view);
    }
}
