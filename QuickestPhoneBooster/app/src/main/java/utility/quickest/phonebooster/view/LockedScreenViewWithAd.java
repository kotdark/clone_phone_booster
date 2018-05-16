package utility.quickest.phonebooster.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import utility.quickest.phonebooster.fragment.LockedScreenFragment;
import utility.quickest.phonebooster.model_helper.BatteryModel;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.cx;
import utility.quickest.phonebooster.model_helper.cz;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.model_helper.fk;
import utility.quickest.phonebooster.model_helper.hd;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.nativeads.NativeAd;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LockedScreenViewWithAd extends hd {
    private static final Handler f14932o = new Handler(Looper.getMainLooper());
    private Context f14933a;
    private Resources f14934b;
    private boolean f14935c;
    private BatteryModel f14936d;
    private C2492b f14937e;
    private SimpleDateFormat f14938f;
    private SimpleDateFormat f14939g;
    private List<NativeAd> f14940h;
    private List<ad> f14941i;
    private List<C1973m> f14942j;
    private List<View> f14943k;
    private List<Object> f14944l;
    private final fj f14945m;
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
    private final cz f14946n;
    private final Runnable f14947p;

    @OnClick
    public void closeWindow() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_view_with_ad", "sp_close", null);
        m19225h();
    }

    @OnClick
    public void closeLockScreen() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_view_with_ad", "sp_close_ls", null);
        this.mCloseChoiceContainer.setVisibility(0);
        m19225h();
    }

    @OnClick
    public void closeChoiceDialog() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_view_with_ad", "win_close", null);
        m19226i();
    }

    @OnClick
    public void onYes() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_view_with_ad", "win_yes", null);
        ig.m18707a().m18715c(false);
        ThreadUtil.m19098a(new bf(this), 400);
        m19226i();
    }

    @OnClick
    public void onNo() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_view_with_ad", "win_no", null);
        ig.m18707a().m18715c(true);
        m19226i();
    }

    @OnClick
    public void doSetting() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_view_with_ad", "setting", null);
        this.mSettingPopupContainer.setVisibility(0);
    }

    @OnClick
    public void openMemoryClean() {
        LockedScreenFragment.m17803d();
        C2542m.m19082a("ls_view_with_ad", "phone_boost", null);
        try {
            Answers.getInstance().logCustom(new CustomEvent("LockedScreenToClick"));
        } catch (Throwable th) {
        }
        MainActivity.m17287a("locked_screen_phone_boost");
        m18621a();
    }

    public LockedScreenViewWithAd(Context context) {
        this(context, null, 0);
    }

    public LockedScreenViewWithAd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14933a = MyApplicationLike.getApplication();
        this.f14934b = MyApplicationLike.getApplication().getResources();
        this.f14935c = false;
        this.f14936d = BatteryModel.m18196a();
        this.f14937e = C2492b.m18285a();
        this.f14938f = new SimpleDateFormat("E dd/MM");
        this.f14939g = new SimpleDateFormat("HH:mm");
        this.f14940h = new ArrayList();
        this.f14941i = new ArrayList();
        this.f14942j = new ArrayList();
        this.f14943k = new ArrayList();
        this.f14944l = new ArrayList();
        this.f14945m = new bc(this);
        this.f14946n = new bd(this);
        this.f14947p = new be(this);
        m19222e();
    }

    private void m19222e() {
        this.f14935c = true;
        LayoutInflater from = LayoutInflater.from(MyApplicationLike.getApplication());
        View inflate = from.inflate(R.layout.fragment_locked_screen_with_ad, null);
        ButterKnife.m2793a(this, inflate);
        try {
            this.mLockScreenBg.setImageResource(R.drawable.bg_lock_screen);
        } catch (OutOfMemoryError e) {
        }
        this.mSettingPopupContainer.setVisibility(8);
        this.mCloseChoiceContainer.setVisibility(8);
        m19223f();
        this.f14937e.m18325a(db.LOCKED_SCREEN, this.f14946n);
        this.f14936d.m18214a(this.f14945m, fk.VERY_FAST);
        Pair p = C2535e.m19051p();
        long longValue = ((Long) p.first).longValue();
        long longValue2 = ((Long) p.second).longValue();
        this.mLockScreenMemorySize.setText(C2542m.m19078a("%s%%", String.valueOf((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) longValue) / ((float) longValue2))) * 100.0f))));
        this.mLockScreenDate.setText(this.f14938f.format(new Date()));
        this.mLockScreenTime.setText(this.f14939g.format(new Date()));
        this.mLockScreenBattery.setmCurrentEnegryPercent(this.f14936d.m18215b().m17663a());
        this.mLockScreenBattery.setmIsCharging(this.f14936d.m18215b().m17664b());
        SwipeBackLayout1 swipeBackLayout1 = (SwipeBackLayout1) from.inflate(R.layout.base1, null);
        swipeBackLayout1.m19254a(inflate, new bg(this));
        addView(swipeBackLayout1);
        f14932o.removeCallbacks(this.f14947p);
        f14932o.postDelayed(this.f14947p, 1000);
    }

    public void mo3149c() {
        this.f14935c = false;
        this.f14936d.m18213a(this.f14945m);
        f14932o.removeCallbacks(this.f14947p);
        for (Object next : this.f14944l) {
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
        for (View view : this.f14943k) {
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
        for (NativeAd destroy : this.f14940h) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f14940h.clear();
        for (C1973m c : this.f14942j) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f14941i) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f14941i.clear();
    }

    private void m19223f() {
        this.mLockScreenAdContainer.addView(ViewUtil.m18919a(this.f14933a, -1, (int) ((((float) C2535e.f14679c) - (this.f14934b.getDimension(R.dimen.ad_image_left_right_size) * 2.0f)) / Float.parseFloat(this.f14934b.getString(R.string.ad_image_scale)))));
    }

    private void m19224g() {
        List c = this.f14937e.m18329c(db.LOCKED_SCREEN);
        if (c.size() != 0) {
            cx bhVar = new bh(this);
            cv cvVar = (cv) c.get(0);
            View a = ViewUtil.m18920a(this.f14933a, cvVar, -1, (int) ((((float) C2535e.f14679c) - (this.f14934b.getDimension(R.dimen.gap_normal) * 2.0f)) / Float.parseFloat(this.f14934b.getString(R.string.ad_image_scale))), false, bhVar);
            if (a != null) {
                View createAdView;
                View view;
                if (a.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) a.getTag();
                    a.setTag(null);
                    this.f14940h.add(nativeAd);
                    try {
                        createAdView = nativeAd.createAdView(this.f14933a, this.mLockScreenAdContainer);
                    } catch (Throwable th) {
                        createAdView = null;
                    }
                    if (createAdView != null) {
                        cvVar.m18403a(createAdView, null, bhVar, new Object[0]);
                        view = createAdView;
                    } else {
                        return;
                    }
                }
                view = a;
                if (view instanceof C1973m) {
                    this.f14942j.add((C1973m) view);
                }
                if (view.getTag() instanceof ad) {
                    this.f14941i.add((ad) view.getTag());
                }
                if ((view instanceof NativeAppInstallAdView) || (view instanceof NativeContentAdView)) {
                    this.f14943k.add(view);
                    this.f14944l.add(view.getTag());
                }
                this.mLockScreenAdContainer.removeAllViews();
                this.mLockScreenAdContainer.addView(view);
                if (view.getTag() instanceof ad) {
                    createAdView = new ImageView(this.f14933a);
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

    private void m19225h() {
        this.mSettingPopupContainer.setVisibility(8);
    }

    private void m19226i() {
        this.mCloseChoiceContainer.setVisibility(8);
    }
}
