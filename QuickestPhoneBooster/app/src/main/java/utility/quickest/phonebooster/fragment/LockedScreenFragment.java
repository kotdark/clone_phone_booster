package utility.quickest.phonebooster.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.facebook.ads.ad;
import com.google.android.gms.ads.C1973m;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;
import utility.quickest.phonebooster.activity.MainActivity;
import utility.quickest.phonebooster.app.MyApplicationLike;
import utility.quickest.phonebooster.model_helper.BatteryModel;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.model_helper.fk;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.BatteryViewVertical;
import com.mopub.mobileads.VastExtensionXmlManager;
import com.mopub.nativeads.NativeAd;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LockedScreenFragment extends BaseFragment {
    private static final Handler f13296l = new Handler(Looper.getMainLooper());
    private BatteryModel f13297a = BatteryModel.m18196a();
    private C2492b f13298b = C2492b.m18285a();
    private LayoutInflater f13299c;
    private SimpleDateFormat f13300d = new SimpleDateFormat("E dd/MM");
    private SimpleDateFormat f13301e = new SimpleDateFormat("HH:mm");
    private List<cv> f13302f = new ArrayList();
    private List<NativeAd> f13303g = new ArrayList();
    private List<ad> f13304h = new ArrayList();
    private List<C1973m> f13305i = new ArrayList();
    private List<View> f13306j = new ArrayList();
    private List<Object> f13307k = new ArrayList();
    private final Runnable f13308m = new cq(this);
    @BindView
    protected ViewGroup mCloseChoiceContainer;
    @BindView
    protected TextView mJunkCleanButton;
    @BindView
    protected BatteryViewVertical mLockScreenBattery;
    @BindView
    protected ImageView mLockScreenBatteryIcon;
    @BindView
    protected TextView mLockScreenDate;
    @BindView
    protected ProgressBar mLockScreenJunkProgress;
    @BindView
    protected TextView mLockScreenJunkSize;
    @BindView
    protected TextView mLockScreenJunkTag;
    @BindView
    protected ProgressBar mLockScreenMemoryProgress;
    @BindView
    protected TextView mLockScreenMemorySize;
    @BindView
    protected TextView mLockScreenMemoryTag;
    @BindView
    protected TextView mLockScreenTime;
    @BindView
    protected TextView mLockScreenUnlock;
    @BindView
    protected TextView mPhoneBoostButton;
    @BindView
    protected ViewGroup mSettingPopupContainer;
    private final fj f13309n = new cr(this);

    @OnClick
    public void closeWindow() {
        m17803d();
        C2542m.m19082a("locked_screen_fragment", "sp_close", null);
        m17806f();
    }

    @OnClick
    public void closeLockScreen() {
        m17803d();
        C2542m.m19082a("locked_screen_fragment", "sp_close_ls", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            this.mCloseChoiceContainer.setVisibility(0);
            m17806f();
        }
    }

    @OnClick
    public void closeChoiceDialog() {
        m17803d();
        C2542m.m19082a("locked_screen_fragment", "win_close", null);
        m17807g();
    }

    @OnClick
    public void onYes() {
        m17803d();
        C2542m.m19082a("locked_screen_fragment", "win_yes", null);
        ig.m18707a().m18715c(false);
        ThreadUtil.m19098a(new cs(this), 400);
        m17807g();
    }

    @OnClick
    public void onNo() {
        m17803d();
        C2542m.m19082a("locked_screen_fragment", "win_no", null);
        ig.m18707a().m18715c(true);
        m17807g();
    }

    @OnClick
    public void doSetting() {
        m17803d();
        C2542m.m19082a("locked_screen_fragment", "setting", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            this.mSettingPopupContainer.setVisibility(0);
        }
    }

    @OnClick
    public void openMemoryClean() {
        m17803d();
        C2542m.m19082a("locked_screen_fragment", "phone_boost", null);
        C2542m.m19085a("locked_screen_fragment", "func", null, null, null, "phone_boost");
        try {
            Answers.getInstance().logCustom(new CustomEvent("LockedScreenToClick"));
            Answers.getInstance().logCustom((CustomEvent) new CustomEvent("lock_screen_click").putCustomAttribute(VastExtensionXmlManager.TYPE, "phone_boost"));
        } catch (Throwable th) {
        }
        MainActivity.m17287a("locked_screen_phone_boost");
        Activity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @OnClick
    public void openJunkClean() {
        m17803d();
        C2542m.m19082a("locked_screen_fragment", "junk_clean", null);
        C2542m.m19085a("locked_screen_fragment", "func", null, null, null, "junk_clean");
        try {
            Answers.getInstance().logCustom(new CustomEvent("LockedScreenToClick"));
            Answers.getInstance().logCustom((CustomEvent) new CustomEvent("lock_screen_click").putCustomAttribute(VastExtensionXmlManager.TYPE, "junk_clean"));
        } catch (Throwable th) {
        }
        MainActivity.m17287a("locked_screen_junk_clean");
        Activity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static LockedScreenFragment m17799a() {
        return new LockedScreenFragment();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MyApplicationLike.m17418b().m17431b("FromLockedScreen");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Runnable ctVar;
        View inflate = layoutInflater.inflate(R.layout.fragment_locked_screen, null);
        ButterKnife.m2793a(this, inflate);
        this.f13299c = layoutInflater;
        this.mSettingPopupContainer.setVisibility(8);
        this.mCloseChoiceContainer.setVisibility(8);
        if (!(this.mLockScreenMemoryTag == null || this.mLockScreenJunkTag == null)) {
            ctVar = new ct(this);
            ThreadUtil.m19098a(ctVar, 500);
            ThreadUtil.m19099a(true, ctVar);
        }
        ctVar = new cu(this);
        ThreadUtil.m19098a(ctVar, 500);
        ThreadUtil.m19099a(true, ctVar);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        this.f13297a.m18214a(this.f13309n, fk.VERY_FAST);
        m17808h();
        Pair p = C2535e.m19051p();
        int longValue = (int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) ((Long) p.first).longValue()) / ((float) ((Long) p.second).longValue()))) * 100.0f);
        this.mLockScreenMemorySize.setText(C2542m.m19078a(m17696a((int) R.string.percent_unit), String.valueOf(longValue)));
        this.mLockScreenMemoryProgress.setProgress(longValue);
        p = C2535e.m19052q();
        longValue = (int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) ((Long) p.first).longValue()) / ((float) ((Long) p.second).longValue()))) * 100.0f);
        this.mLockScreenJunkSize.setText(C2542m.m19078a(m17696a((int) R.string.percent_unit), String.valueOf(longValue)));
        this.mLockScreenJunkProgress.setProgress(longValue);
        this.mLockScreenDate.setText(this.f13300d.format(new Date()));
        this.mLockScreenTime.setText(this.f13301e.format(new Date()));
        this.mLockScreenBattery.setmCurrentEnegryPercent(this.f13297a.m18215b().m17663a());
        this.mLockScreenBattery.setmIsCharging(this.f13297a.m18215b().m17664b());
        f13296l.removeCallbacks(this.f13308m);
        f13296l.postDelayed(this.f13308m, 1000);
    }

    public void onStop() {
        super.onStop();
        this.f13297a.m18213a(this.f13309n);
        f13296l.removeCallbacks(this.f13308m);
    }

    public void onDestroyView() {
        for (Object next : this.f13307k) {
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
        for (View view : this.f13306j) {
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
        for (NativeAd destroy : this.f13303g) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13303g.clear();
        for (C1973m c : this.f13305i) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f13304h) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13304h.clear();
        super.onDestroyView();
    }

    private void m17806f() {
        this.mSettingPopupContainer.setVisibility(8);
    }

    private void m17807g() {
        this.mCloseChoiceContainer.setVisibility(8);
    }

    public static void m17803d() {
        MyApplicationLike.m17418b().m17429a("FromLockedScreen");
    }

    private void m17808h() {
        if (!ViewUtil.m18937a((Fragment) this) || this.f13297a.m18215b() == null) {
            return;
        }
        if (this.f13297a.m18215b().m17665c()) {
            this.mLockScreenBattery.setVisibility(0);
            this.mLockScreenBatteryIcon.setVisibility(0);
            return;
        }
        this.mLockScreenBattery.setVisibility(8);
        this.mLockScreenBatteryIcon.setVisibility(8);
    }
}
