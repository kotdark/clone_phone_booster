package utility.quickest.phonebooster.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.facebook.ads.ad;
import com.google.android.gms.ads.C1973m;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;
import com.google.firebase.analytics.FirebaseAnalytics;
import utility.quickest.phonebooster.activity.AboutActivity;
import utility.quickest.phonebooster.activity.AntivirusActivity;
import utility.quickest.phonebooster.activity.CPUCoolingActivity;
import utility.quickest.phonebooster.activity.DocActivity;
import utility.quickest.phonebooster.activity.MemoryJunkCleanActivity;
import utility.quickest.phonebooster.activity.PowerSavingActivity;
import utility.quickest.phonebooster.activity.StorageJunkCleanActivity;
import utility.quickest.phonebooster.activity.WhiteListActivity;
import utility.quickest.phonebooster.adapter.C2398i;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.AlwaysNotiHelper;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.et;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.model_helper.id;
import utility.quickest.phonebooster.model_helper.ie;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.model_helper.il;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2539i;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.AddQuickCleanDialog;
import utility.quickest.phonebooster.view.C2598x;
import utility.quickest.phonebooster.view.CircleIndicator;
import utility.quickest.phonebooster.view.CustomRiseNumberTextView;
import utility.quickest.phonebooster.view.RoundProgressBar;
import utility.quickest.phonebooster.view.ShareDialogTarget;
import utility.quickest.phonebooster.view.TemperatureUnitDialog;
import utility.quickest.phonebooster.view.ci;
import utility.quickest.phonebooster.view.co;
import utility.quickest.phonebooster.view.cw;
import com.mopub.nativeads.NativeAd;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class MainFragment extends BaseFragment {
    private long f13354a = 1300;
    private ig f13355b = ig.m18707a();
    private et f13356c = et.m18483a();
    private C2598x f13357d;
    private AddQuickCleanDialog f13358e;
    private TemperatureUnitDialog f13359f;
    private ShareDialogTarget f13360g;
    private C2492b f13361h = C2492b.m18285a();
    private List<NativeAd> f13362i = new ArrayList();
    private List<ad> f13363j = new ArrayList();
    private List<C1973m> f13364k = new ArrayList();
    private List<View> f13365l = new ArrayList();
    private List<Object> f13366m = new ArrayList();
    @BindView
    protected ViewGroup mActionBarSettingIcon;
    @BindView
    protected ViewGroup mAdContainer;
    @BindView
    protected ImageView mAntivirusImage;
    @BindView
    protected ViewGroup mBottomBar;
    @BindView
    protected CircleIndicator mCircleIndicator;
    @BindView
    protected ImageView mCpuCoolingImage;
    @BindView
    protected TextView mCpuDetaiButton;
    @BindView
    protected TextView mCpuPercentDetailText;
    @BindView
    protected RoundProgressBar mCpuPercentProgressBar;
    @BindView
    protected ImageView mCpuPercentProgressBg;
    @BindView
    protected TextView mCpuPercentTag;
    @BindView
    protected CustomRiseNumberTextView mCpuPercentText;
    @BindView
    protected TextView mCpuPercentUnit;
    @BindView
    protected DrawerLayout mDrawerLayoutView;
    @BindView
    protected ViewGroup mExitDialog;
    @BindView
    protected ViewGroup mNavigationView;
    @BindView
    protected ImageView mPowerSavingImage;
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
    @BindView
    protected TextView mStorageDetaiButton;
    @BindView
    protected ViewGroup mStorageDetailContainer;
    @BindView
    protected TextView mStoragePercentDetailText;
    @BindView
    protected RoundProgressBar mStoragePercentProgressBar;
    @BindView
    protected CustomRiseNumberTextView mStoragePercentText;
    @BindView
    protected ViewPager mViewPager;
    private boolean f13367n = false;
    private long f13368o;
    private boolean f13369p = false;

    @OnClick
    public void doSetting() {
        C2542m.m19082a("main_fragment", "setting", null);
        if (!this.mDrawerLayoutView.isDrawerOpen(this.mNavigationView)) {
            this.mDrawerLayoutView.openDrawer(this.mNavigationView, true);
        }
    }

    @OnClick
    public void doCleanStorage(View view) {
        C2542m.m19082a("main_fragment", "junk_clean_top", null);
        hh.m18630a("junk_clean_top");
        StorageJunkCleanActivity.m17318a((Fragment) this);
    }

    @OnClick
    public void doCleanMemory(View view) {
        C2542m.m19082a("main_fragment", "phone_boost_top", null);
        hh.m18630a("phone_boost_top");
        MemoryJunkCleanActivity.m17300a((Fragment) this);
    }

    @OnClick
    public void doCPUCooling() {
        C2542m.m19082a("main_fragment", "cpu_cooling_bottom", null);
        hh.m18630a("cpu_cooling_bottom");
        CPUCoolingActivity.m17263a((Fragment) this);
    }

    @OnClick
    public void doPowerSaving() {
        C2542m.m19082a("main_fragment", "power_saving_bottom", null);
        hh.m18630a("power_saving_bottom");
        hh.m18644i();
        PowerSavingActivity.m17311a((Fragment) this);
    }

    @OnClick
    public void doAntivirus() {
        C2542m.m19082a("main_fragment", "antivirus_top", null);
        hh.m18630a("antivirus_top");
        AntivirusActivity.m17258a((Fragment) this);
    }

    @OnClick
    public void exitNo() {
        C2542m.m19082a("main_fragment", "exit_dialog_no", null);
        m17827e();
    }

    @OnClick
    public void exitYes() {
        C2542m.m19082a("main_fragment", "exit_dialog_yes", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            m17827e();
            getActivity().finish();
        }
    }

    @OnClick
    public void openWhiteListPage() {
        C2542m.m19082a("setting_fragment", "white_list", null);
        this.mDrawerLayoutView.closeDrawers();
        WhiteListActivity.m17320a((Fragment) this);
    }

    @OnClick
    public void doShare() {
        C2542m.m19082a("setting_fragment", "share", null);
        if (this.f13360g == null) {
            this.f13360g = new ShareDialogTarget(getActivity(), ci.SETTING, 0);
        }
        if (!this.f13360g.isShowing()) {
            this.f13360g.m19249a();
        }
    }

    @OnClick
    public void checkUpdate() {
        C2542m.m19082a("setting_fragment", "update", null);
        if (this.f13356c.m18514b()) {
            Context activity = getActivity();
            if (activity != null) {
                Toast.makeText(activity, m17696a((int) R.string.is_downloading), 1).show();
                return;
            }
            return;
        }
        m17829g();
        et.m18483a().m18513a(new du(this));
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
            this.f13358e = new AddQuickCleanDialog(getActivity());
            this.f13358e.show();
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
        this.f13355b.m18712a(isChecked);
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
        this.f13355b.m18713b(isChecked);
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
        this.f13355b.m18715c(isChecked);
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
        this.mDrawerLayoutView.closeDrawers();
        AboutActivity.m17253a((Fragment) this);
    }

    @OnClick
    public void setTemperatureUnit() {
        C2542m.m19082a("setting_fragment", "temperature_unit", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            if (this.f13359f == null) {
                this.f13359f = new TemperatureUnitDialog(getActivity(), new dv(this));
            }
            if (!this.f13359f.isShowing()) {
                this.f13359f.m19260a();
            }
        }
    }

    public static MainFragment m17820a() {
        return new MainFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_main, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarSettingIcon.setVisibility(0);
        m17827e();
        if (C2535e.f14679c > 0) {
            LayoutParams layoutParams = new RelativeLayout.LayoutParams((C2535e.f14679c * 5) / 9, (C2535e.f14679c * 5) / 9);
            layoutParams.addRule(13);
            this.mCpuPercentProgressBar.setLayoutParams(layoutParams);
            this.mCpuDetaiButton.setWidth((C2535e.f14679c * 5) / 9);
            int a = ViewUtil.m18918a(2.0f);
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(((C2535e.f14679c * 5) / 9) - a, ((C2535e.f14679c * 5) / 9) - a);
            layoutParams2.addRule(13);
            this.mCpuPercentProgressBg.setLayoutParams(layoutParams2);
            try {
                this.mCpuPercentProgressBg.setImageResource(R.drawable.ic_round);
            } catch (Throwable th) {
            }
            this.mBottomBar.setLayoutParams(new LinearLayout.LayoutParams(-1, (C2535e.f14680d * 15) / 64));
            layoutParams = new RelativeLayout.LayoutParams(C2535e.f14679c / 10, C2535e.f14679c / 10);
            layoutParams.addRule(13);
            this.mCpuCoolingImage.setLayoutParams(layoutParams);
            this.mPowerSavingImage.setLayoutParams(layoutParams);
            this.mAntivirusImage.setLayoutParams(layoutParams);
            layoutParams = new LinearLayout.LayoutParams(-1, (C2535e.f14680d * 5) / 32);
            int dimensionPixelSize = m17699c().getDimensionPixelSize(R.dimen.gap_normal);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0);
            this.mStorageDetailContainer.setLayoutParams(layoutParams);
            this.mStoragePercentProgressBar.setLayoutParams(new RelativeLayout.LayoutParams((C2535e.f14680d * 3) / 32, (C2535e.f14680d * 3) / 32));
        }
        this.mSettingCleanNoticeToggleButton.setChecked(this.f13355b.m18714b());
        this.mSettingUeImproveToggleButton.setChecked(this.f13355b.m18716c());
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
        int i = 0;
        super.onStart();
        if (il.Celsius.equals(this.f13355b.m18720g())) {
            this.mSettingTemperatureUnitValue.setText(m17696a((int) R.string.cpu_cooling_temperature_unit));
        } else if (il.Fahrenheit.equals(this.f13355b.m18720g())) {
            this.mSettingTemperatureUnitValue.setText(m17696a((int) R.string.cpu_cooling_temperature_unit1));
        }
        if (this.f13356c.m18514b()) {
            this.mSettingUpdateVersion.setText(m17696a((int) R.string.is_downloading));
        } else {
            this.mSettingUpdateVersion.setText("1.2.2.3");
        }
        this.mSettingLockScreenToggleButton.setChecked(this.f13355b.m18717d());
        this.mSettingNotiToolBarToggleButton.setChecked(AlwaysNotiHelper.m18174b());
        Pair q = C2535e.m19052q();
        long longValue = ((Long) q.first).longValue();
        long longValue2 = ((Long) q.second).longValue();
        this.mStoragePercentText.setTextNumber((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) longValue) / ((float) longValue2))) * 100.0f));
        this.mStoragePercentText.setDuration(700);
        this.mStoragePercentText.m19191a();
        this.mStoragePercentDetailText.setText(C2542m.m19078a("%s / %s", C2542m.m19088b(longValue2 - longValue), C2542m.m19088b(longValue2)));
        this.mStoragePercentProgressBar.setProgress((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) longValue) / ((float) longValue2))) * 100.0f));
        q = C2535e.m19051p();
        longValue = ((Long) q.first).longValue();
        longValue2 = ((Long) q.second).longValue();
        int i2 = (int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) longValue) / ((float) longValue2))) * 100.0f);
        this.mCpuPercentText.setTextNumber(i2);
        this.mCpuPercentText.setDuration(700);
        this.mCpuPercentText.m19191a();
        if (((long) i2) >= hz.m18683a().m18692a(ie.HighMemColorGap)) {
            this.mCpuPercentProgressBar.setCricleProgressColor(m17699c().getColor(R.color.red5));
            this.mCpuPercentText.setTextColor(m17699c().getColor(R.color.red5));
            this.mCpuPercentUnit.setTextColor(m17699c().getColor(R.color.red5));
            this.mCpuPercentTag.setTextColor(m17699c().getColor(R.color.red5));
            this.mCircleIndicator.setIndicatorBackgroundResId(R.drawable.radius_selected);
            this.mCircleIndicator.setIndicatorUnselectedBackgroundResId(R.drawable.radius_unselected);
            this.mCpuDetaiButton.setBackgroundResource(R.drawable.bg_cta1);
        } else {
            this.mCpuPercentProgressBar.setCricleProgressColor(m17699c().getColor(R.color.main_color));
            this.mCpuPercentText.setTextColor(m17699c().getColor(R.color.main_color));
            this.mCpuPercentUnit.setTextColor(m17699c().getColor(R.color.main_color));
            this.mCpuPercentTag.setTextColor(m17699c().getColor(R.color.main_color));
            this.mCircleIndicator.setIndicatorBackgroundResId(R.drawable.radius_selected_real_blue);
            this.mCircleIndicator.setIndicatorUnselectedBackgroundResId(R.drawable.radius_unselected_real_blue);
            this.mCpuDetaiButton.setBackgroundResource(R.drawable.bg_ad_cta6);
        }
        this.mCpuPercentDetailText.setText(C2542m.m19078a("%s / %s", C2542m.m19088b(longValue2 - longValue), C2542m.m19088b(longValue2)));
        this.mCpuPercentProgressBar.setProgress((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) longValue) / ((float) longValue2))) * 100.0f));
        this.f13361h.m18328b(db.WANT_QUIT);
        if (this.f13367n) {
            List c;
            if (hh.m18646k()) {
                c = this.f13361h.m18329c(db.MAIN_CAROUSEL);
            } else {
                c = null;
            }
            if (c != null && c.size() > 0) {
                this.mViewPager.setVisibility(0);
                this.mCircleIndicator.setVisibility(0);
                try {
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                    List fragments = childFragmentManager.getFragments();
                    if (fragments != null && fragments.size() > 0) {
                        while (i < fragments.size()) {
                            beginTransaction.remove((Fragment) fragments.get(i));
                            i++;
                        }
                    }
                    beginTransaction.commitNowAllowingStateLoss();
                    this.mViewPager.setAdapter(new C2398i(getChildFragmentManager(), c));
                    this.mCircleIndicator.setViewPager(this.mViewPager);
                } catch (Throwable th) {
                }
            }
            this.mViewPager.addOnPageChangeListener(new dw(this));
            try {
                cw cwVar = new cw(getActivity());
                cwVar.m19379a(500);
                cwVar.m19380a(this.mViewPager);
            } catch (Throwable th2) {
            }
            ThreadUtil.m19098a(new dx(this), this.f13354a);
        } else {
            this.f13367n = true;
            this.mViewPager.setVisibility(8);
            this.mCircleIndicator.setVisibility(8);
        }
        C2539i.EVENT_CLOSE_ENABLE_LOCKED_SCREEN_TIP_VIEW.m19064a((Object) "");
    }

    public void onStop() {
        super.onStop();
        this.f13369p = false;
        this.f13361h.m18328b(db.MAIN_CAROUSEL);
        try {
            this.mViewPager.setCurrentItem(0, false);
            cw cwVar = new cw(getActivity());
            cwVar.m19379a(1800);
            cwVar.m19380a(this.mViewPager);
        } catch (Throwable th) {
        }
    }

    public boolean mo3085b() {
        if (this.f13358e != null && this.f13358e.isShowing()) {
            this.f13358e.dismiss();
            return true;
        } else if (this.mExitDialog.getVisibility() == 0) {
            m17827e();
            return true;
        } else if (this.f13361h.m18326a(db.WANT_QUIT)) {
            m17826d();
            return true;
        } else if (System.currentTimeMillis() - this.f13368o <= 2000) {
            return false;
        } else {
            this.f13368o = System.currentTimeMillis();
            Toast.makeText(MyApplicationLike.getApplication(), m17696a((int) R.string.exit_hint), 1).show();
            return true;
        }
    }

    private void m17826d() {
        List c = this.f13361h.m18329c(db.WANT_QUIT);
        this.f13361h.m18328b(db.WANT_QUIT);
        m17822a(c);
        this.mExitDialog.setVisibility(0);
        try {
            co.m19372a(getActivity(), getResources().getColor(R.color.blue2));
        } catch (Throwable th) {
        }
    }

    private void m17827e() {
        this.mExitDialog.setVisibility(8);
        m17828f();
        try {
            co.m19372a(getActivity(), getResources().getColor(R.color.blue1));
        } catch (Throwable th) {
        }
    }

    private void m17822a(List<cv> list) {
        if (list.size() > 0) {
            cv cvVar = (cv) list.get(0);
            View a = ViewUtil.m18921a(this, cvVar, -1, (int) ((((float) C2535e.f14679c) - (m17699c().getDimension(R.dimen.main_gap) * 2.0f)) / Float.parseFloat(m17696a((int) R.string.ad_image_scale))), true);
            if (a != null) {
                View createAdView;
                if (a.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) a.getTag();
                    a.setTag(null);
                    this.f13362i.add(nativeAd);
                    try {
                        createAdView = nativeAd.createAdView(getActivity(), this.mAdContainer);
                    } catch (Throwable th) {
                        createAdView = null;
                    }
                    if (createAdView != null) {
                        cvVar.m18403a(createAdView, null, null, new Object[0]);
                    } else {
                        return;
                    }
                }
                createAdView = a;
                if (createAdView instanceof C1973m) {
                    this.f13364k.add((C1973m) createAdView);
                }
                if (createAdView.getTag() instanceof ad) {
                    ad adVar = (ad) createAdView.getTag();
                    createAdView.setTag(null);
                    this.f13363j.add(adVar);
                }
                if ((createAdView instanceof NativeAppInstallAdView) || (createAdView instanceof NativeContentAdView)) {
                    this.f13365l.add(createAdView);
                    this.f13366m.add(createAdView.getTag());
                }
                this.mAdContainer.removeAllViews();
                this.mAdContainer.addView(createAdView);
            }
        }
    }

    private void m17828f() {
        for (Object next : this.f13366m) {
            if (next instanceof NativeAppInstallAd) {
                try {
                    ((NativeAppInstallAd) next).mo2545k();
                } catch (Throwable th) {
                }
            }
            if (next instanceof NativeContentAd) {
                try {
                    ((NativeContentAd) next).mo2553i();
                } catch (Throwable th2) {
                }
            }
        }
        this.f13366m.clear();
        for (View view : this.f13365l) {
            if (view instanceof NativeAppInstallAdView) {
                try {
                    ((NativeAppInstallAdView) view).setMediaView(null);
                    ((NativeAppInstallAdView) view).m8864a();
                } catch (Throwable th3) {
                }
            }
            if (view instanceof NativeContentAdView) {
                try {
                    ((NativeContentAdView) view).m8864a();
                } catch (Throwable th4) {
                }
            }
        }
        this.f13365l.clear();
        for (NativeAd destroy : this.f13362i) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13362i.clear();
        for (C1973m c : this.f13364k) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        this.f13364k.clear();
        for (ad adVar : this.f13363j) {
            try {
                adVar.m4102t();
                adVar.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13363j.clear();
        this.mAdContainer.removeAllViews();
    }

    private void m17829g() {
        if (getActivity() != null) {
            this.f13357d = ViewUtil.m18950b(getActivity());
            if (this.f13357d != null) {
                this.f13357d.show();
            }
        }
    }

    private void m17830h() {
        if (this.f13357d != null) {
            try {
                this.f13357d.dismiss();
            } catch (Throwable th) {
            }
        }
    }
}
