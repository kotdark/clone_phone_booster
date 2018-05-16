package utility.quickest.phonebooster.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utility.quickest.phonebooster.activity.DocActivity;
import utility.quickest.phonebooster.activity.FeedBackActivity;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.p112b.SharedPrefHelper;
import utility.quickest.phonebooster.util.AppUtil;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.R;

public class AboutFragment extends BaseFragment {
    private ig f13131a = ig.m18707a();
    private int f13132b = 0;
    private long f13133c = 0;
    @BindView
    protected RelativeLayout mAboutGpRate;
    @BindView
    protected View mAboutGpRateDivider;
    @BindView
    protected RelativeLayout mAboutPrivacyPolicy;
    @BindView
    protected View mAboutPrivacyPolicyDivider;
    @BindView
    protected RelativeLayout mAboutRules;
    @BindView
    protected View mAboutRulesDivider;
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected TextView mTestModeTextView;

    @OnClick
    public void doBack() {
        C2542m.m19082a("about_fragment", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void doGPRate() {
        C2542m.m19082a("about_fragment", "gp_rate", null);
        this.f13131a.m18719f();
    }

    @OnClick
    public void openFeedBackPage() {
        C2542m.m19082a("about_fragment", "feed_back", null);
        FeedBackActivity.m17276a((Fragment) this);
    }

    @OnClick
    public void openPrivacyPolicyDoc() {
        C2542m.m19082a("about_fragment", "privacy_policy_doc", null);
        DocActivity.m17268a(this, m17696a((int) R.string.about_privacy_policy), "http://goclean.tech/protocol.html");
    }

    @OnClick
    public void openRulesDoc() {
        C2542m.m19082a("about_fragment", "term_doc", null);
        DocActivity.m17268a(this, m17696a((int) R.string.about_terms), "http://goclean.tech/term.html");
    }

    public static AboutFragment m17703a() {
        return new AboutFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_about, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.about));
        if (AppUtil.m19016a(true, false)) {
            this.mAboutGpRate.setVisibility(0);
            this.mAboutGpRateDivider.setVisibility(0);
        } else {
            this.mAboutGpRate.setVisibility(8);
            this.mAboutGpRateDivider.setVisibility(8);
        }
        if (C2542m.m19090b()) {
            this.mTestModeTextView.setText(m17706d());
        } else {
            this.mTestModeTextView.setText("");
        }
        this.mTestModeTextView.setOnClickListener(new C2458a(this));
        return inflate;
    }

    private String m17706d() {
        try {
            return "[ABTestToken]: " +  SharedPrefHelper.m17454a().m17543r();
        } catch (Throwable th) {
            return "Error";
        }
    }
}
