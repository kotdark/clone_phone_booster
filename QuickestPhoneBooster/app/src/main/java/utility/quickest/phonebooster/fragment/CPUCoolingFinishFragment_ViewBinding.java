package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.view.CustomCircularProgress1;
import utility.quickest.phonebooster.R;

public class CPUCoolingFinishFragment_ViewBinding<T extends CPUCoolingFinishFragment> implements Unbinder {
    protected T f13208b;
    private View f13209c;
    private View f13210d;
    private View f13211e;
    private View f13212f;
    private View f13213g;
    private View f13214h;
    private View f13215i;
    private View f13216j;

    public CPUCoolingFinishFragment_ViewBinding(T t, View view) {
        this.f13208b = t;
        t.mActionBar = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.action_bar, "field 'mActionBar'", ViewGroup.class);
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        t.mAdContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container, "field 'mAdContainer'", ViewGroup.class);
        t.mAdContainer1 = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container1, "field 'mAdContainer1'", ViewGroup.class);
        t.mAdContainerContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.ad_container_container, "field 'mAdContainerContainer'", ViewGroup.class);
        t.mTagContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.tag_container, "field 'mTagContainer'", ViewGroup.class);
        t.mFinishTag = (TextView)  Utils.findRequiredViewAsType(view, R.id.finish_tag, "field 'mFinishTag'", TextView.class);
        t.mProgress = (CustomCircularProgress1)  Utils.findRequiredViewAsType(view, R.id.progress, "field 'mProgress'", CustomCircularProgress1.class);
        t.mTagContainerFloat = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.tag_container_float, "field 'mTagContainerFloat'", ViewGroup.class);
        t.mFinishTagFloat = (TextView)  Utils.findRequiredViewAsType(view, R.id.finish_tag_float, "field 'mFinishTagFloat'", TextView.class);
        View a =  Utils.findRequiredView(view, R.id.junk_clean_container, "field 'mJunckCleanContainer' and method 'doCleanStorage'");
        t.mJunckCleanContainer = (ViewGroup)  Utils.castView(a, R.id.junk_clean_container, "field 'mJunckCleanContainer'", ViewGroup.class);
        this.f13209c = a;
        a.setOnClickListener(new ar(this, t));
        a =  Utils.findRequiredView(view, R.id.phone_boost_container, "field 'mPhoneBoostContainer' and method 'doCleanMemory'");
        t.mPhoneBoostContainer = (ViewGroup)  Utils.castView(a, R.id.phone_boost_container, "field 'mPhoneBoostContainer'", ViewGroup.class);
        this.f13210d = a;
        a.setOnClickListener(new as(this, t));
        a =  Utils.findRequiredView(view, R.id.power_saving_container, "field 'mPowerSavingContainer' and method 'doPowerSaving'");
        t.mPowerSavingContainer = (ViewGroup)  Utils.castView(a, R.id.power_saving_container, "field 'mPowerSavingContainer'", ViewGroup.class);
        this.f13211e = a;
        a.setOnClickListener(new at(this, t));
        a =  Utils.findRequiredView(view, R.id.antivirus_container, "field 'mAntivirusContainer' and method 'doAntivirus'");
        t.mAntivirusContainer = (ViewGroup)  Utils.castView(a, R.id.antivirus_container, "field 'mAntivirusContainer'", ViewGroup.class);
        this.f13212f = a;
        a.setOnClickListener(new au(this, t));
        t.mAntivirusText = (TextView)  Utils.findRequiredViewAsType(view, R.id.antivirus_text, "field 'mAntivirusText'", TextView.class);
        a =  Utils.findRequiredView(view, R.id.quick_boost_container, "field 'mQuickBoostContainer' and method 'doOpenQuickBoost'");
        t.mQuickBoostContainer = (ViewGroup)  Utils.castView(a, R.id.quick_boost_container, "field 'mQuickBoostContainer'", ViewGroup.class);
        this.f13213g = a;
        a.setOnClickListener(new av(this, t));
        a =  Utils.findRequiredView(view, R.id.open_ls_container, "field 'mOpenLsContainer' and method 'doOpenLs'");
        t.mOpenLsContainer = (ViewGroup)  Utils.castView(a, R.id.open_ls_container, "field 'mOpenLsContainer'", ViewGroup.class);
        this.f13214h = a;
        a.setOnClickListener(new aw(this, t));
        a =  Utils.findRequiredView(view, R.id.open_noti_toolbar_container, "field 'mOpenNotiToolBarContainer' and method 'doOpenNT'");
        t.mOpenNotiToolBarContainer = (ViewGroup)  Utils.castView(a, R.id.open_noti_toolbar_container, "field 'mOpenNotiToolBarContainer'", ViewGroup.class);
        this.f13215i = a;
        a.setOnClickListener(new ax(this, t));
        View a2 =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "method 'doBack'");
        this.f13216j = a2;
        a2.setOnClickListener(new ay(this, t));
    }
}
