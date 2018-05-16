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
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
import utility.quickest.phonebooster.model_helper.cz;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.model_helper.fk;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.BatteryViewVertical;
import com.mopub.nativeads.NativeAd;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LockedScreenFragmentWithAd extends BaseFragment {
    private static final Handler f13310l = new Handler(Looper.getMainLooper());
    private BatteryModel f13311a = BatteryModel.m18196a();
    private C2492b f13312b = C2492b.m18285a();
    private LayoutInflater f13313c;
    private SimpleDateFormat f13314d = new SimpleDateFormat("E dd/MM");
    private SimpleDateFormat f13315e = new SimpleDateFormat("HH:mm");
    private List<cv> f13316f = new ArrayList();
    private List<NativeAd> f13317g = new ArrayList();
    private List<ad> f13318h = new ArrayList();
    private List<C1973m> f13319i = new ArrayList();
    private List<View> f13320j = new ArrayList();
    private List<Object> f13321k = new ArrayList();
    private final Runnable f13322m = new cv(this);
    @BindView
    protected ViewGroup mCloseChoiceContainer;
    @BindView
    protected ViewGroup mLockScreenAdContainer;
    @BindView
    protected BatteryViewVertical mLockScreenBattery;
    @BindView
    protected ImageView mLockScreenBg;
    @BindView
    protected TextView mLockScreenDate;
    @BindView
    protected TextView mLockScreenMemorySize;
    @BindView
    protected TextView mLockScreenTime;
    @BindView
    protected TextView mLockScreenUnlock;
    @BindView
    protected ViewGroup mSettingPopupContainer;
    private final fj f13323n = new cw(this);
    private final cz f13324o = new cx(this);

    @OnClick
    public void closeWindow() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_fragment_with_ad", "sp_close", null);
        m17817g();
    }

    @OnClick
    public void closeLockScreen() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_fragment_with_ad", "sp_close_ls", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            this.mCloseChoiceContainer.setVisibility(0);
            m17817g();
        }
    }

    @OnClick
    public void closeChoiceDialog() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_fragment_with_ad", "win_close", null);
        m17818h();
    }

    @OnClick
    public void onYes() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_fragment_with_ad", "win_yes", null);
        ig.m18707a().m18715c(false);
        ThreadUtil.m19098a(new cy(this), 400);
        m17818h();
    }

    @OnClick
    public void onNo() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_fragment_with_ad", "win_no", null);
        ig.m18707a().m18715c(true);
        m17818h();
    }

    @OnClick
    public void doSetting() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_fragment_with_ad", "setting", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            this.mSettingPopupContainer.setVisibility(0);
        }
    }

    @OnClick
    public void openMemoryClean() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_fragment_with_ad", "phone_boost", null);
        try {
            Answers.getInstance().logCustom(new CustomEvent("LockedScreenToClick"));
        } catch (Throwable th) {
        }
        MainActivity.m17287a("locked_screen_phone_boost");
        Activity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static LockedScreenFragmentWithAd m17809a() {
        return new LockedScreenFragmentWithAd();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MyApplicationLike.m17418b().m17431b("FromLockedScreen");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_locked_screen_with_ad, null);
        ButterKnife.m2793a(this, inflate);
        try {
            this.mLockScreenBg.setImageResource(R.drawable.bg_lock_screen);
        } catch (OutOfMemoryError e) {
        }
        this.f13313c = layoutInflater;
        this.mSettingPopupContainer.setVisibility(8);
        this.mCloseChoiceContainer.setVisibility(8);
        m17815e();
        this.f13312b.m18325a(db.LOCKED_SCREEN, this.f13324o);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        this.f13311a.m18214a(this.f13323n, fk.VERY_FAST);
        Pair p = C2535e.m19051p();
        long longValue = ((Long) p.first).longValue();
        long longValue2 = ((Long) p.second).longValue();
        this.mLockScreenMemorySize.setText(C2542m.m19078a("%s%%", String.valueOf((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) longValue) / ((float) longValue2))) * 100.0f))));
        this.mLockScreenDate.setText(this.f13314d.format(new Date()));
        this.mLockScreenTime.setText(this.f13315e.format(new Date()));
        this.mLockScreenBattery.setmCurrentEnegryPercent(this.f13311a.m18215b().m17663a());
        this.mLockScreenBattery.setmIsCharging(this.f13311a.m18215b().m17664b());
        f13310l.removeCallbacks(this.f13322m);
        f13310l.postDelayed(this.f13322m, 1000);
    }

    public void onStop() {
        super.onStop();
        this.f13311a.m18213a(this.f13323n);
        f13310l.removeCallbacks(this.f13322m);
    }

    public void onDestroyView() {
        for (Object next : this.f13321k) {
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
        for (View view : this.f13320j) {
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
        for (NativeAd destroy : this.f13317g) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13317g.clear();
        for (C1973m c : this.f13319i) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f13318h) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13318h.clear();
        super.onDestroyView();
    }

    private void m17815e() {
        this.mLockScreenAdContainer.addView(ViewUtil.m18919a(getActivity(), -1, (int) ((((float) C2535e.f14679c) - (m17699c().getDimension(R.dimen.ad_image_left_right_size) * 2.0f)) / Float.parseFloat(m17696a((int) R.string.ad_image_scale)))));
    }

    private void m17816f() {
        List c = this.f13312b.m18329c(db.LOCKED_SCREEN);
        if (c.size() != 0) {
            cv cvVar = (cv) c.get(0);
            View a = ViewUtil.m18920a(getActivity(), cvVar, -1, (int) ((((float) C2535e.f14679c) - (m17699c().getDimension(R.dimen.gap_normal) * 2.0f)) / Float.parseFloat(m17696a((int) R.string.ad_image_scale))), false, null);
            if (a != null) {
                View createAdView;
                View view;
                if (a.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) a.getTag();
                    a.setTag(null);
                    this.f13317g.add(nativeAd);
                    try {
                        createAdView = nativeAd.createAdView(getActivity(), this.mLockScreenAdContainer);
                    } catch (Throwable th) {
                        createAdView = null;
                    }
                    if (createAdView != null) {
                        cvVar.m18403a(createAdView, null, null, new Object[0]);
                        view = createAdView;
                    } else {
                        return;
                    }
                }
                view = a;
                if (view instanceof C1973m) {
                    this.f13319i.add((C1973m) view);
                }
                if (view.getTag() instanceof ad) {
                    this.f13318h.add((ad) view.getTag());
                }
                if ((view instanceof NativeAppInstallAdView) || (view instanceof NativeContentAdView)) {
                    this.f13320j.add(view);
                    this.f13321k.add(view.getTag());
                }
                this.mLockScreenAdContainer.removeAllViews();
                this.mLockScreenAdContainer.addView(view);
                if (view.getTag() instanceof ad) {
                    createAdView = new ImageView(getActivity());
                    createAdView.setImageResource(R.drawable.ic_ad_tag_yellow_1);
                    createAdView.setClickable(true);
                    LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(11);
                    layoutParams.addRule(10);
                    createAdView.setLayoutParams(layoutParams);
                    this.mLockScreenAdContainer.addView(createAdView);
                }
            }
        }
    }

    private void m17817g() {
        this.mSettingPopupContainer.setVisibility(8);
    }

    private void m17818h() {
        this.mCloseChoiceContainer.setVisibility(8);
    }
}
