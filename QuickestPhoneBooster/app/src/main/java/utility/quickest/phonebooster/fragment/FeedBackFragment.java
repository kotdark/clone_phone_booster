package utility.quickest.phonebooster.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.C2598x;
import utility.quickest.phonebooster.R;

public class FeedBackFragment extends BaseFragment {
    private C2598x f13255a;
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ViewGroup mActionSendIcon;
    @BindView
    protected EditText mFeedBackContent;
    @BindView
    protected EditText mFeedBackEmail;

    @OnClick
    public void doBack() {
        C2542m.m19082a("feed_back_fragment", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void submit(View view) {
        if (view.getId() == R.id.feed_back_submit) {
            C2542m.m19082a("feed_back_fragment", "submit_bottom", null);
        } else if (view.getId() == R.id.action_bar_send_icon) {
            C2542m.m19082a("feed_back_fragment", "submit_top", null);
        }
        Context activity = getActivity();
        view.setEnabled(false);
        String str = this.mFeedBackContent.getText() + "";
        String str2 = this.mFeedBackEmail.getText() + "";
        if (str2.length() == 0) {
            if (activity != null) {
                Toast.makeText(activity, m17696a((int) R.string.feed_back_no_email_hint), 1).show();
            }
            view.setEnabled(true);
        } else if (str.length() == 0) {
            if (activity != null) {
                Toast.makeText(activity, m17696a((int) R.string.feed_back_no_content_hint), 1).show();
            }
            view.setEnabled(true);
        } else {
            m17786d();
            ig.m18707a().m18711a(str, str2, true, new br(this, view));
        }
    }

    public static FeedBackFragment m17784a() {
        return new FeedBackFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_feed_back, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionSendIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.about_feed_back));
        return inflate;
    }

    private void m17786d() {
        if (getActivity() != null) {
            this.f13255a = ViewUtil.m18950b(getActivity());
            if (this.f13255a != null) {
                this.f13255a.show();
            }
        }
    }

    private void m17787e() {
        if (this.f13255a != null) {
            try {
                this.f13255a.dismiss();
            } catch (Throwable th) {
            }
        }
    }
}
