package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class AboutFragment_ViewBinding<T extends AboutFragment> implements Unbinder {
    protected T f13134b;
    private View f13135c;
    private View f13136d;
    private View f13137e;
    private View f13138f;
    private View f13139g;

    public AboutFragment_ViewBinding(T t, View view) {
        this.f13134b = t;
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13135c = a;
        a.setOnClickListener(new C2460b(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        a =  Utils.findRequiredView(view, R.id.about_gp_rate, "field 'mAboutGpRate' and method 'doGPRate'");
        t.mAboutGpRate = (RelativeLayout)  Utils.castView(a, R.id.about_gp_rate, "field 'mAboutGpRate'", RelativeLayout.class);
        this.f13136d = a;
        a.setOnClickListener(new C2463c(this, t));
        t.mAboutGpRateDivider =  Utils.findRequiredView(view, R.id.about_gp_rate_divider, "field 'mAboutGpRateDivider'");
        a =  Utils.findRequiredView(view, R.id.about_privacy_policy, "field 'mAboutPrivacyPolicy' and method 'openPrivacyPolicyDoc'");
        t.mAboutPrivacyPolicy = (RelativeLayout)  Utils.castView(a, R.id.about_privacy_policy, "field 'mAboutPrivacyPolicy'", RelativeLayout.class);
        this.f13137e = a;
        a.setOnClickListener(new C2464d(this, t));
        t.mAboutPrivacyPolicyDivider =  Utils.findRequiredView(view, R.id.about_privacy_policy_divider, "field 'mAboutPrivacyPolicyDivider'");
        a =  Utils.findRequiredView(view, R.id.about_rules, "field 'mAboutRules' and method 'openRulesDoc'");
        t.mAboutRules = (RelativeLayout)  Utils.castView(a, R.id.about_rules, "field 'mAboutRules'", RelativeLayout.class);
        this.f13138f = a;
        a.setOnClickListener(new C2466e(this, t));
        t.mAboutRulesDivider =  Utils.findRequiredView(view, R.id.about_rules_divider, "field 'mAboutRulesDivider'");
        t.mTestModeTextView = (TextView)  Utils.findRequiredViewAsType(view, R.id.test_mode_tv, "field 'mTestModeTextView'", TextView.class);
        View a2 =  Utils.findRequiredView(view, R.id.about_feed_back, "method 'openFeedBackPage'");
        this.f13139g = a2;
        a2.setOnClickListener(new C2467f(this, t));
    }
}
