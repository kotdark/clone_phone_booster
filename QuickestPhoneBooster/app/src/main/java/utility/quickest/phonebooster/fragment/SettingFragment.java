package utility.quickest.phonebooster.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.firebase.analytics.FirebaseAnalytics;
import utility.quickest.phonebooster.activity.AboutActivity;
import utility.quickest.phonebooster.activity.DocActivity;
import utility.quickest.phonebooster.activity.WhiteListActivity;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.AlwaysNotiHelper;
import utility.quickest.phonebooster.model_helper.et;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.model_helper.id;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.model_helper.il;
import utility.quickest.phonebooster.util.C2539i;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.AddQuickCleanDialog;
import utility.quickest.phonebooster.view.C2598x;
import utility.quickest.phonebooster.view.ShareDialogTarget;
import utility.quickest.phonebooster.view.TemperatureUnitDialog;
import utility.quickest.phonebooster.view.ci;
import utility.quickest.phonebooster.R;
import java.util.Map.Entry;

public class SettingFragment extends BaseFragment {
    private ig f13464a = ig.m18707a();
    private et f13465b = et.m18483a();
    private C2598x f13466c;
    private AddQuickCleanDialog f13467d;
    private TemperatureUnitDialog f13468e;
    private ShareDialogTarget f13469f;
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ViewGroup mSettingAboutContainer;
    @BindView
    protected ToggleButton mSettingCleanNoticeToggleButton;
    @BindView
    protected ViewGroup mSettingLockScreenContainer;
    @BindView
    protected View mSettingLockScreenDivider;
    @BindView
    protected TextView mSettingLockScreenTipNoAd;
    @BindView
    protected TextView mSettingLockScreenTipWithAd;
    @BindView
    protected ToggleButton mSettingLockScreenToggleButton;
    @BindView
    protected ToggleButton mSettingNotiToolBarToggleButton;
    @BindView
    protected ViewGroup mSettingNotiToolbarContainer;
    @BindView
    protected View mSettingNotiToolbarDivider;
    @BindView
    protected ViewGroup mSettingSpeedUpBallContainer;
    @BindView
    protected TextView mSettingTemperatureUnitValue;
    @BindView
    protected ViewGroup mSettingUeImproveContainer;
    @BindView
    protected View mSettingUeImproveDivider;
    @BindView
    protected TextView mSettingUeImproveText;
    @BindView
    protected ToggleButton mSettingUeImproveToggleButton;
    @BindView
    protected TextView mSettingUpdateVersion;
    @BindView
    protected ViewGroup mSettingWhiteListContainer;

    @OnClick
    public void doBack() {
        C2542m.m19082a("setting_fragment", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void openWhiteListPage() {
        C2542m.m19082a("setting_fragment", "white_list", null);
        WhiteListActivity.m17320a((Fragment) this);
    }

    @OnClick
    public void doShare() {
        C2542m.m19082a("setting_fragment", "share", null);
        if (this.f13469f == null) {
            this.f13469f = new ShareDialogTarget(getActivity(), ci.SETTING, 0);
        }
        if (!this.f13469f.isShowing()) {
            this.f13469f.m19249a();
        }
    }

    @OnClick
    public void checkUpdate() {
        C2542m.m19082a("setting_fragment", "update", null);
        if (this.f13465b.m18514b()) {
            Context activity = getActivity();
            if (activity != null) {
                Toast.makeText(activity, m17696a((int) R.string.is_downloading), 1).show();
                return;
            }
            return;
        }
        m17907d();
        et.m18483a().m18513a(new gi(this));
    }

    @OnClick
    public void openPrivacyPolicyDoc() {
        C2542m.m19082a("setting_fragment", "ue_doc", null);
        DocActivity.m17268a(this, m17696a((int) R.string.setting_ue_program), "http://goclean.tech/ueps.html");
    }

    @OnClick
    public void onSpeedUpBallToggle() {
        C2542m.m19082a("setting_fragment", "one_key_clean", null);
        if (getActivity() != null) {
            this.f13467d = new AddQuickCleanDialog(getActivity());
            this.f13467d.show();
        }
    }

    @OnClick
    public void onCleanNoticeToggle(ToggleButton toggleButton) {
        boolean isChecked = toggleButton.isChecked();
        C2542m.m19082a("setting_fragment", "clean_notice", null);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("boolean", isChecked + "");
            for (Entry entry : hz.m18683a().m18694b().entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent("setting_clean_notice_", bundle);
        } catch (Throwable th) {
        }
        this.f13464a.m18712a(isChecked);
    }

    @OnClick
    public void onUEImproveToggle(ToggleButton toggleButton) {
        boolean isChecked = toggleButton.isChecked();
        C2542m.m19082a("setting_fragment", "ue_toogle", null);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("boolean", isChecked + "");
            for (Entry entry : hz.m18683a().m18694b().entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent("setting_ue_", bundle);
        } catch (Throwable th) {
        }
        this.f13464a.m18713b(isChecked);
    }

    @OnClick
    public void onLockScreenToggle(ToggleButton toggleButton) {
        boolean isChecked = toggleButton.isChecked();
        C2542m.m19082a("setting_fragment", "lock_screen", null);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("boolean", isChecked + "");
            for (Entry entry : hz.m18683a().m18694b().entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent("setting_lock_screen_", bundle);
        } catch (Throwable th) {
        }
        this.f13464a.m18715c(isChecked);
    }

    @OnClick
    public void onNotiToolBarToggle(ToggleButton toggleButton) {
        boolean isChecked = toggleButton.isChecked();
        C2542m.m19082a("setting_fragment", "noti_toolbar", null);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("boolean", isChecked + "");
            for (Entry entry : hz.m18683a().m18694b().entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            FirebaseAnalytics.getInstance(MyApplicationLike.getApplication()).logEvent("setting_noti_toolbar_", bundle);
        } catch (Throwable th) {
        }
        AlwaysNotiHelper.m18171a(isChecked);
    }

    @OnClick
    public void openAbout() {
        C2542m.m19082a("setting_fragment", "about_us", null);
        AboutActivity.m17253a((Fragment) this);
    }

    @OnClick
    public void setTemperatureUnit() {
        C2542m.m19082a("setting_fragment", "temperature_unit", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            if (this.f13468e == null) {
                this.f13468e = new TemperatureUnitDialog(getActivity(), new gj(this));
            }
            if (!this.f13468e.isShowing()) {
                this.f13468e.m19260a();
            }
        }
    }

    public static SettingFragment m17904a() {
        return new SettingFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_setting, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.setting));
        this.mSettingCleanNoticeToggleButton.setChecked(this.f13464a.m18714b());
        this.mSettingUeImproveToggleButton.setChecked(this.f13464a.m18716c());
        this.mSettingUeImproveText.getPaint().setFlags(8);
        this.mSettingUeImproveText.getPaint().setAntiAlias(true);
        this.mSettingUeImproveContainer.setVisibility(8);
        this.mSettingUeImproveDivider.setVisibility(8);
        if (hh.m18640e()) {
            this.mSettingLockScreenContainer.setVisibility(8);
            this.mSettingLockScreenDivider.setVisibility(8);
        } else {
            this.mSettingLockScreenContainer.setVisibility(0);
            this.mSettingLockScreenDivider.setVisibility(0);
        }
        if (hz.m18683a().m18693a(id.AlwaysNoti)) {
            this.mSettingNotiToolbarContainer.setVisibility(0);
            this.mSettingNotiToolbarDivider.setVisibility(0);
        } else {
            this.mSettingNotiToolbarContainer.setVisibility(8);
            this.mSettingNotiToolbarDivider.setVisibility(8);
        }
        if (il.Celsius.equals(this.f13464a.m18720g())) {
            this.mSettingTemperatureUnitValue.setText(m17696a((int) R.string.cpu_cooling_temperature_unit));
        } else if (il.Fahrenheit.equals(this.f13464a.m18720g())) {
            this.mSettingTemperatureUnitValue.setText(m17696a((int) R.string.cpu_cooling_temperature_unit1));
        }
        if (hh.m18641f()) {
            this.mSettingLockScreenTipWithAd.setVisibility(0);
            this.mSettingLockScreenTipNoAd.setVisibility(8);
        } else {
            this.mSettingLockScreenTipWithAd.setVisibility(8);
            this.mSettingLockScreenTipNoAd.setVisibility(0);
        }
        return inflate;
    }

    public void onStart() {
        super.onStart();
        if (this.f13465b.m18514b()) {
            this.mSettingUpdateVersion.setText(m17696a((int) R.string.is_downloading));
        } else {
            this.mSettingUpdateVersion.setText("1.2.2.3");
        }
        this.mSettingLockScreenToggleButton.setChecked(this.f13464a.m18717d());
        this.mSettingNotiToolBarToggleButton.setChecked(AlwaysNotiHelper.m18174b());
        C2539i.EVENT_CLOSE_ENABLE_LOCKED_SCREEN_TIP_VIEW.m19064a((Object) "");
    }

    public boolean mo3085b() {
        if (this.f13467d == null || !this.f13467d.isShowing()) {
            return false;
        }
        this.f13467d.dismiss();
        return true;
    }

    private void m17907d() {
        if (getActivity() != null) {
            this.f13466c = ViewUtil.m18950b(getActivity());
            if (this.f13466c != null) {
                this.f13466c.show();
            }
        }
    }

    private void m17908e() {
        if (this.f13466c != null) {
            try {
                this.f13466c.dismiss();
            } catch (Throwable th) {
            }
        }
    }
}
