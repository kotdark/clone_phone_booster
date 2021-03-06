package utility.quickest.phonebooster.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import utility.quickest.phonebooster.R;

public class SettingFragment_ViewBinding<T extends SettingFragment> implements Unbinder {
    protected T f13470b;
    private View f13471c;
    private View f13472d;
    private View f13473e;
    private View f13474f;
    private View f13475g;
    private View f13476h;
    private View f13477i;
    private View f13478j;
    private View f13479k;
    private View f13480l;
    private View f13481m;
    private View f13482n;

    public SettingFragment_ViewBinding(T t, View view) {
        this.f13470b = t;
        View a =  Utils.findRequiredView(view, R.id.action_bar_back_icon, "field 'mActionBarBackIcon' and method 'doBack'");
        t.mActionBarBackIcon = (ViewGroup)  Utils.castView(a, R.id.action_bar_back_icon, "field 'mActionBarBackIcon'", ViewGroup.class);
        this.f13471c = a;
        a.setOnClickListener(new gk(this, t));
        t.mActionBarTitle = (TextView)  Utils.findRequiredViewAsType(view, R.id.action_bar_title, "field 'mActionBarTitle'", TextView.class);
        a =  Utils.findRequiredView(view, R.id.setting_white_list_container, "field 'mSettingWhiteListContainer' and method 'openWhiteListPage'");
        t.mSettingWhiteListContainer = (ViewGroup)  Utils.castView(a, R.id.setting_white_list_container, "field 'mSettingWhiteListContainer'", ViewGroup.class);
        this.f13472d = a;
        a.setOnClickListener(new go(this, t));
        a =  Utils.findRequiredView(view, R.id.setting_speed_up_ball_container, "field 'mSettingSpeedUpBallContainer' and method 'onSpeedUpBallToggle'");
        t.mSettingSpeedUpBallContainer = (ViewGroup)  Utils.castView(a, R.id.setting_speed_up_ball_container, "field 'mSettingSpeedUpBallContainer'", ViewGroup.class);
        this.f13473e = a;
        a.setOnClickListener(new gp(this, t));
        a =  Utils.findRequiredView(view, R.id.setting_ue_improve_toggle_button, "field 'mSettingUeImproveToggleButton' and method 'onUEImproveToggle'");
        t.mSettingUeImproveToggleButton = (ToggleButton)  Utils.castView(a, R.id.setting_ue_improve_toggle_button, "field 'mSettingUeImproveToggleButton'", ToggleButton.class);
        this.f13474f = a;
        a.setOnClickListener(new gq(this, t));
        a =  Utils.findRequiredView(view, R.id.setting_about_container, "field 'mSettingAboutContainer' and method 'openAbout'");
        t.mSettingAboutContainer = (ViewGroup)  Utils.castView(a, R.id.setting_about_container, "field 'mSettingAboutContainer'", ViewGroup.class);
        this.f13475g = a;
        a.setOnClickListener(new gr(this, t));
        a =  Utils.findRequiredView(view, R.id.setting_clean_notice_toggle_button, "field 'mSettingCleanNoticeToggleButton' and method 'onCleanNoticeToggle'");
        t.mSettingCleanNoticeToggleButton = (ToggleButton)  Utils.castView(a, R.id.setting_clean_notice_toggle_button, "field 'mSettingCleanNoticeToggleButton'", ToggleButton.class);
        this.f13476h = a;
        a.setOnClickListener(new gs(this, t));
        a =  Utils.findRequiredView(view, R.id.setting_lock_screen_toggle_button, "field 'mSettingLockScreenToggleButton' and method 'onLockScreenToggle'");
        t.mSettingLockScreenToggleButton = (ToggleButton)  Utils.castView(a, R.id.setting_lock_screen_toggle_button, "field 'mSettingLockScreenToggleButton'", ToggleButton.class);
        this.f13477i = a;
        a.setOnClickListener(new gt(this, t));
        a =  Utils.findRequiredView(view, R.id.setting_noti_toolbar_toggle_button, "field 'mSettingNotiToolBarToggleButton' and method 'onNotiToolBarToggle'");
        t.mSettingNotiToolBarToggleButton = (ToggleButton)  Utils.castView(a, R.id.setting_noti_toolbar_toggle_button, "field 'mSettingNotiToolBarToggleButton'", ToggleButton.class);
        this.f13478j = a;
        a.setOnClickListener(new gu(this, t));
        a =  Utils.findRequiredView(view, R.id.setting_ue_improve_text, "field 'mSettingUeImproveText' and method 'openPrivacyPolicyDoc'");
        t.mSettingUeImproveText = (TextView)  Utils.castView(a, R.id.setting_ue_improve_text, "field 'mSettingUeImproveText'", TextView.class);
        this.f13479k = a;
        a.setOnClickListener(new gv(this, t));
        t.mSettingUpdateVersion = (TextView)  Utils.findRequiredViewAsType(view, R.id.setting_update_version, "field 'mSettingUpdateVersion'", TextView.class);
        t.mSettingUeImproveContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.setting_ue_improve_contaier, "field 'mSettingUeImproveContainer'", ViewGroup.class);
        t.mSettingUeImproveDivider =  Utils.findRequiredView(view, R.id.setting_ue_improve_divider, "field 'mSettingUeImproveDivider'");
        t.mSettingLockScreenContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.setting_lock_screen_container, "field 'mSettingLockScreenContainer'", ViewGroup.class);
        t.mSettingLockScreenDivider =  Utils.findRequiredView(view, R.id.setting_lock_screen_divider, "field 'mSettingLockScreenDivider'");
        t.mSettingNotiToolbarContainer = (ViewGroup)  Utils.findRequiredViewAsType(view, R.id.setting_noti_toolbar_container, "field 'mSettingNotiToolbarContainer'", ViewGroup.class);
        t.mSettingNotiToolbarDivider =  Utils.findRequiredView(view, R.id.setting_noti_toolbar_divider, "field 'mSettingNotiToolbarDivider'");
        t.mSettingTemperatureUnitValue = (TextView)  Utils.findRequiredViewAsType(view, R.id.setting_temperature_unit_value, "field 'mSettingTemperatureUnitValue'", TextView.class);
        t.mSettingLockScreenTipWithAd = (TextView)  Utils.findRequiredViewAsType(view, R.id.setting_lock_screen_tip_with_ad, "field 'mSettingLockScreenTipWithAd'", TextView.class);
        t.mSettingLockScreenTipNoAd = (TextView)  Utils.findRequiredViewAsType(view, R.id.setting_lock_screen_tip_no_ad, "field 'mSettingLockScreenTipNoAd'", TextView.class);
        View a2 =  Utils.findRequiredView(view, R.id.setting_share_container, "method 'doShare'");
        this.f13480l = a2;
        a2.setOnClickListener(new gl(this, t));
        a2 =  Utils.findRequiredView(view, R.id.setting_update_container, "method 'checkUpdate'");
        this.f13481m = a2;
        a2.setOnClickListener(new gm(this, t));
        a2 =  Utils.findRequiredView(view, R.id.setting_temperature_unit_container, "method 'setTemperatureUnit'");
        this.f13482n = a2;
        a2.setOnClickListener(new gn(this, t));
    }
}
