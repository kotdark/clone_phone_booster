package utility.quickest.phonebooster.fragment;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import utility.quickest.phonebooster.model_helper.ij;
import utility.quickest.phonebooster.R;

/* compiled from: FeedBackFragment */
class br implements ij {
    final /* synthetic */ View f13574a;
    final /* synthetic */ FeedBackFragment f13575b;

    br(FeedBackFragment feedBackFragment, View view) {
        this.f13575b = feedBackFragment;
        this.f13574a = view;
    }

    public void mo3098a(boolean z, int i) {
        this.f13575b.m17787e();
        this.f13574a.setEnabled(true);
        Context activity = this.f13575b.getActivity();
        if (activity != null) {
            if (z) {
                Toast.makeText(activity, this.f13575b.m17696a((int) R.string.feed_back_succcess), 1).show();
                activity.finish();
                return;
            }
            Toast.makeText(activity, this.f13575b.m17696a((int) R.string.feed_back_fail), 1).show();
        }
    }
}
