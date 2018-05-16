package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.CustomCircularProgress1;
import utility.quickest.phonebooster.view.CustomScrollView;
import utility.quickest.phonebooster.R;

public class JunkCleanFinishFragment_ViewBinding<T extends JunkCleanFinishFragment> implements Unbinder {
    protected T f13275b;
    private View f13276c;
    private View f13277d;
    private View f13278e;
    private View f13279f;
    private View f13280g;
    private View f13281h;
    private View f13282i;
    private View f13283j;
    private View f13284k;

    public JunkCleanFinishFragment_ViewBinding(T t, View view) {
        this.f13275b = t;
        t.mScrollView = (CustomScrollView)  Utils.findRequiredViewAsType(view, R.id.scroll_view, "field 'mScrollView'", CustomScrollView.class);
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13276c = a;
        a.setOnClickListener(new cb(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container, "field 'mAdContainer'", ViewGroup.class);
        t.mFinishTag1 = (CustomCircularProgress1)  Utils.findRequiredViewAsType(view, R.id.finish_tag1, "field 'mFinishTag1'", CustomCircularProgress1.class);
        a =  Utils.findRequiredView(view, R.id.junk_clean_container, "field 'mJunckCleanContainer' and method 'doCleanStorage'");
        t.mJunckCleanContainer = (ViewGroup)  Utils.castView(a, R.id.junk_clean_container, "field 'mJunckCleanContainer'", ViewGroup.class);
        this.f13277d = a;
        a.setOnClickListener(new cc(this, t));
        a =  Utils.findRequiredView(view, R.id.phone_boost_container, "field 'mPhoneBoostContainer' and method 'doCleanMemory'");
        t.mPhoneBoostContainer = (ViewGroup)  Utils.castView(a, R.id.phone_boost_container, "field 'mPhoneBoostContainer'", ViewGroup.class);
        this.f13278e = a;
        a.setOnClickListener(new cd(this, t));
        a =  Utils.findRequiredView(view, R.id.cpu_cooling_container, "field 'mCoolingContainer' and method 'doCPUCooling'");
        t.mCoolingContainer = (ViewGroup)  Utils.castView(a, R.id.cpu_cooling_container, "field 'mCoolingContainer'", ViewGroup.class);
        this.f13279f = a;
        a.setOnClickListener(new ce(this, t));
        a =  Utils.findRequiredView(view, R.id.power_saving_container, "field 'mPowerSavingContainer' and method 'doPowerSaving'");
        t.mPowerSavingContainer = (ViewGroup)  Utils.castView(a, R.id.power_saving_container, "field 'mPowerSavingContainer'", ViewGroup.class);
        this.f13280g = a;
        a.setOnClickListener(new cf(this, t));
        a =  Utils.findRequiredView(view, R.id.antivirus_container, "field 'mAntivirusContainer' and method 'doAntivirus'");
        t.mAntivirusContainer = (ViewGroup)  Utils.castView(a, R.id.antivirus_container, "field 'mAntivirusContainer'", ViewGroup.class);
        this.f13281h = a;
        a.setOnClickListener(new cg(this, t));
        t.mAntivirusText = (TextView)  Utils.findRequiredViewAsType(view, R.id.antivirus_text, "field 'mAntivirusText'", TextView.class);
        a =  Utils.findRequiredView(view, R.id.quick_boost_container, "field 'mQuickBoostContainer' and method 'doOpenQuickBoost'");
        t.mQuickBoostContainer = (ViewGroup)  Utils.castView(a, R.id.quick_boost_container, "field 'mQuickBoostContainer'", ViewGroup.class);
        this.f13282i = a;
        a.setOnClickListener(new ch(this, t));
        a =  Utils.findRequiredView(view, R.id.open_ls_container, "field 'mOpenLsContainer' and method 'doOpenLs'");
        t.mOpenLsContainer = (ViewGroup)  Utils.castView(a, R.id.open_ls_container, "field 'mOpenLsContainer'", ViewGroup.class);
        this.f13283j = a;
        a.setOnClickListener(new ci(this, t));
        a =  Utils.findRequiredView(view, R.id.open_noti_toolbar_container, "field 'mOpenNotiToolBarContainer' and method 'doOpenNT'");
        t.mOpenNotiToolBarContainer = (ViewGroup)  Utils.castView(a, R.id.open_noti_toolbar_container, "field 'mOpenNotiToolBarContainer'", ViewGroup.class);
        this.f13284k = a;
        a.setOnClickListener(new cj(this, t));
        t.mFinishTagContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container, "field 'mFinishTagContainer'", ViewGroup.class);
        t.mFinishTagContainerFloat = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_float, "field 'mFinishTagContainerFloat'", ViewGroup.class);
        t.mFinishTagContainerJunkClean = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_junk_clean, "field 'mFinishTagContainerJunkClean'", ViewGroup.class);
        t.mFinishTagContainerJunkCleanFloat = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_junk_clean_float, "field 'mFinishTagContainerJunkCleanFloat'", ViewGroup.class);
        t.mFinishTagContainerCleanSuccess = (TextView)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_clean_success, "field 'mFinishTagContainerCleanSuccess'", TextView.class);
        t.mFinishTagContainerCleanSuccessFloat = (TextView)  Utils.findRequiredViewAsType(view, R.id.finish_tag_container_clean_success_float, "field 'mFinishTagContainerCleanSuccessFloat'", TextView.class);
    }
}
