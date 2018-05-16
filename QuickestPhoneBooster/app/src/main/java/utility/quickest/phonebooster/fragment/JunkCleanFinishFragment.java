package utility.quickest.phonebooster.fragment;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.ad;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.C1973m;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;
import utility.quickest.phonebooster.activity.AntivirusActivity;
import utility.quickest.phonebooster.activity.CPUCoolingActivity;
import utility.quickest.phonebooster.activity.MemoryJunkCleanActivity;
import utility.quickest.phonebooster.activity.PowerSavingActivity;
import utility.quickest.phonebooster.activity.StorageJunkCleanActivity;
import utility.quickest.phonebooster.model_helper.AlwaysNotiHelper;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.model_helper.gz;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.ho;
import utility.quickest.phonebooster.model_helper.ig;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.CustomCircularProgress1;
import utility.quickest.phonebooster.view.CustomScrollView;
import com.mopub.nativeads.NativeAd;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JunkCleanFinishFragment extends BaseFragment {
    private int f13260a = 2000;
    private long f13261b;
    private boolean f13262c = false;
    private int f13263d = 0;
    private C2492b f13264e = C2492b.m18285a();
    private LayoutInflater f13265f;
    private List<NativeAd> f13266g = new ArrayList();
    private List<ad> f13267h = new ArrayList();
    private List<C1973m> f13268i = new ArrayList();
    private List<View> f13269j = new ArrayList();
    private List<Object> f13270k = new ArrayList();
    private InterstitialAd f13271l = null;
    private InterstitialAd f13272m = null;
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ViewGroup mAdContainer;
    @BindView
    protected ViewGroup mAntivirusContainer;
    @BindView
    protected TextView mAntivirusText;
    @BindView
    protected ViewGroup mCoolingContainer;
    @BindView
    protected CustomCircularProgress1 mFinishTag1;
    @BindView
    protected ViewGroup mFinishTagContainer;
    @BindView
    protected TextView mFinishTagContainerCleanSuccess;
    @BindView
    protected TextView mFinishTagContainerCleanSuccessFloat;
    @BindView
    protected ViewGroup mFinishTagContainerFloat;
    @BindView
    protected ViewGroup mFinishTagContainerJunkClean;
    @BindView
    protected ViewGroup mFinishTagContainerJunkCleanFloat;
    @BindView
    protected ViewGroup mJunckCleanContainer;
    @BindView
    protected ViewGroup mOpenLsContainer;
    @BindView
    protected ViewGroup mOpenNotiToolBarContainer;
    @BindView
    protected ViewGroup mPhoneBoostContainer;
    @BindView
    protected ViewGroup mPowerSavingContainer;
    @BindView
    protected ViewGroup mQuickBoostContainer;
    @BindView
    protected CustomScrollView mScrollView;
    private ig f13273n = ig.m18707a();
    private boolean f13274o = false;

    @OnClick
    public void doBack() {
        C2542m.m19082a("junk_clean_finish_fragment", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void doPowerSaving() {
        if (this.f13263d == 0) {
            C2542m.m19082a("junk_clean_finish_fragment", "jcps", null);
        } else if (this.f13263d == 1) {
            C2542m.m19082a("junk_clean_finish_fragment", "pbps", null);
        }
        PowerSavingActivity.m17311a((Fragment) this);
        getActivity().finish();
        hh.m18626a(-1);
    }

    @OnClick
    public void doCleanStorage() {
        C2542m.m19082a("junk_clean_finish_fragment", "pbjc", null);
        StorageJunkCleanActivity.m17318a((Fragment) this);
        getActivity().finish();
        hh.m18626a(-1);
    }

    @OnClick
    public void doCleanMemory() {
        C2542m.m19082a("junk_clean_finish_fragment", "jcpb", null);
        MemoryJunkCleanActivity.m17300a((Fragment) this);
        getActivity().finish();
        hh.m18626a(-1);
    }

    @OnClick
    public void doCPUCooling() {
        if (this.f13263d == 0) {
            C2542m.m19082a("junk_clean_finish_fragment", "jccl", null);
        } else if (this.f13263d == 1) {
            C2542m.m19082a("junk_clean_finish_fragment", "pbcl", null);
        }
        CPUCoolingActivity.m17263a((Fragment) this);
        getActivity().finish();
        hh.m18626a(-1);
    }

    @OnClick
    public void doAntivirus() {
        if (this.f13263d == 0) {
            C2542m.m19082a("junk_clean_finish_fragment", "jcan", null);
        } else if (this.f13263d == 1) {
            C2542m.m19082a("junk_clean_finish_fragment", "pban", null);
        }
        AntivirusActivity.m17258a((Fragment) this);
        getActivity().finish();
        hh.m18626a(-1);
    }

    @OnClick
    public void doOpenQuickBoost() {
        if (this.f13263d == 0) {
            C2542m.m19082a("junk_clean_finish_fragment", "jcqb", null);
        } else if (this.f13263d == 1) {
            C2542m.m19082a("junk_clean_finish_fragment", "pbqb", null);
        }
        if (ViewUtil.m18937a((Fragment) this)) {
            ig.m18707a().m18718e();
        }
    }

    @OnClick
    public void doOpenLs() {
        if (this.f13263d == 0) {
            C2542m.m19082a("junk_clean_finish_fragment", "jcls", null);
        } else if (this.f13263d == 1) {
            C2542m.m19082a("junk_clean_finish_fragment", "pbls", null);
        }
        if (!ViewUtil.m18937a((Fragment) this)) {
            return;
        }
        if (this.f13273n.m18717d()) {
            Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
            return;
        }
        this.f13273n.m18715c(true);
        if (!gz.m18604a() || (gz.m18604a() && gz.m18606b())) {
            Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
        }
        this.f13274o = true;
    }

    @OnClick
    public void doOpenNT() {
        if (this.f13263d == 0) {
            C2542m.m19082a("junk_clean_finish_fragment", "jcnt", null);
        } else if (this.f13263d == 1) {
            C2542m.m19082a("junk_clean_finish_fragment", "pbnt", null);
        }
        if (ViewUtil.m18937a((Fragment) this)) {
            AlwaysNotiHelper.m18171a(true);
            Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
        }
    }

    public static JunkCleanFinishFragment m17788a(Intent intent) {
        JunkCleanFinishFragment junkCleanFinishFragment = new JunkCleanFinishFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("key_entrance", intent.getIntExtra("key_entrance", 0));
        bundle.putLong("key_junk_size", intent.getLongExtra("key_junk_size", 0));
        bundle.putBoolean("key_has_cleaned", intent.getBooleanExtra("key_has_cleaned", false));
        junkCleanFinishFragment.setArguments(bundle);
        return junkCleanFinishFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13263d = arguments.getInt("key_entrance", 0);
            this.f13261b = arguments.getLong("key_junk_size", 0);
            this.f13262c = arguments.getBoolean("key_has_cleaned");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_junk_clean_finish, null);
        ButterKnife.m2793a(this, inflate);
        this.f13265f = layoutInflater;
        this.mActionBarBackIcon.setVisibility(0);
        if (this.f13263d == 0) {
            this.mActionBarTitle.setText(m17696a((int) R.string.junk_clean));
        } else if (this.f13263d == 1) {
            this.mActionBarTitle.setText(m17696a((int) R.string.phone_boost));
        }
        if (this.f13262c) {
            if (this.f13263d == 0) {
                this.mFinishTagContainerCleanSuccess.setText(m17696a((int) R.string.clean_success));
                this.mFinishTagContainerCleanSuccessFloat.setText(m17696a((int) R.string.clean_success));
            } else if (this.f13263d == 1) {
                this.mFinishTagContainerCleanSuccess.setText(m17696a((int) R.string.boosted1));
                this.mFinishTagContainerCleanSuccessFloat.setText(m17696a((int) R.string.boosted1));
            }
        } else if (this.f13263d == 0 || this.f13263d == 1) {
            this.mFinishTagContainerCleanSuccess.setText(m17696a((int) R.string.not_need_clean));
            this.mFinishTagContainerCleanSuccessFloat.setText(m17696a((int) R.string.not_need_clean));
        }
        this.mFinishTagContainer.getLayoutParams().height = C2535e.f14680d;
        this.mFinishTagContainer.requestLayout();
        this.mScrollView.setOnScrollListener(new bv(this));
        List arrayList = new ArrayList();
        if (this.f13263d == 0) {
            arrayList = this.f13264e.m18329c(db.JUNK_INTER);
        } else if (this.f13263d == 1) {
            arrayList = this.f13264e.m18329c(db.PROCESS_INTER);
        }
        for (cv cvVar : r0) {
            if (cvVar.m18409g() == null) {
                if (cvVar.m18408f() != null) {
                    this.f13272m = cvVar.m18408f();
                    break;
                }
            }
            this.f13271l = cvVar.m18409g();
            break;
        }
        cv cvVar2 = null;
        if (cvVar2 != null) {
            cvVar2.m18403a(null, null, null, new Object[0]);
        } else {
            this.mFinishTag1.m19180a();
            ThreadUtil.m19098a(new bw(this), (long) this.f13260a);
        }
        if (this.f13263d == 0) {
            this.f13264e.m18328b(db.JUNK1);
        } else if (this.f13263d == 1) {
            this.f13264e.m18328b(db.PROCESS1);
        }
        return inflate;
    }

    public void onStart() {
        super.onStart();
        if (this.f13274o) {
            if (this.f13273n.m18717d()) {
                Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
            }
            this.f13274o = false;
        }
    }

    public void onDestroyView() {
        for (Object next : this.f13270k) {
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
        for (View view : this.f13269j) {
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
        for (NativeAd destroy : this.f13266g) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13266g.clear();
        for (C1973m c : this.f13268i) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f13267h) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13267h.clear();
        m17789a();
        super.onDestroyView();
    }

    public void mo3084a(boolean z) {
        if (!z || (this.f13271l == null && this.f13272m == null)) {
            super.mo3084a(z);
            return;
        }
        m17789a();
        this.mFinishTag1.m19180a();
        ThreadUtil.m19098a(new bx(this), (long) this.f13260a);
    }

    private void m17789a() {
        if (this.f13271l != null) {
            this.f13271l.m5786b();
            this.f13271l = null;
        }
        if (this.f13272m != null) {
            this.f13272m = null;
        }
    }

    private void m17792d() {
        System.currentTimeMillis();
        this.mJunckCleanContainer.setVisibility(8);
        this.mPhoneBoostContainer.setVisibility(8);
        this.mCoolingContainer.setVisibility(8);
        this.mPowerSavingContainer.setVisibility(8);
        this.mAntivirusContainer.setVisibility(8);
        this.mQuickBoostContainer.setVisibility(8);
        this.mOpenLsContainer.setVisibility(8);
        this.mOpenNotiToolBarContainer.setVisibility(8);
        this.mAdContainer.setVisibility(8);
        ho b;
        if (this.f13263d != 0) {
            if (this.f13263d == 1) {
                b = hh.m18633b(ho.Memory);
                if (b != null) {
                    switch (ca.f13589a[b.ordinal()]) {
                        case 1:
                            this.mCoolingContainer.setVisibility(0);
                            C2542m.m19082a("junk_clean_finish_fragment", "pbcl_show", null);
                            break;
                        case 2:
                            this.mPowerSavingContainer.setVisibility(0);
                            C2542m.m19082a("junk_clean_finish_fragment", "pbps_show", null);
                            break;
                        case 4:
                            this.mQuickBoostContainer.setVisibility(0);
                            C2542m.m19082a("junk_clean_finish_fragment", "pbqb_show", null);
                            break;
                        case 5:
                            this.mAntivirusContainer.setVisibility(0);
                            C2542m.m19082a("junk_clean_finish_fragment", "pban_show", null);
                            if (!new Random().nextBoolean()) {
                                this.mAntivirusText.setText(m17696a((int) R.string.antivirus_tip_1_1));
                                break;
                            } else {
                                this.mAntivirusText.setText(m17696a((int) R.string.antivirus_tip_1));
                                break;
                            }
                        case 6:
                            this.mOpenLsContainer.setVisibility(0);
                            C2542m.m19082a("junk_clean_finish_fragment", "pbls_show", null);
                            break;
                        case 7:
                            this.mOpenNotiToolBarContainer.setVisibility(0);
                            C2542m.m19082a("junk_clean_finish_fragment", "pbnt_show", null);
                            break;
                        case 8:
                            this.mJunckCleanContainer.setVisibility(0);
                            C2542m.m19082a("junk_clean_finish_fragment", "pbjc_show", null);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        b = hh.m18633b(ho.Junk);
        if (b != null) {
            switch (ca.f13589a[b.ordinal()]) {
                case 1:
                    this.mCoolingContainer.setVisibility(0);
                    C2542m.m19082a("junk_clean_finish_fragment", "jccl_show", null);
                    break;
                case 2:
                    this.mPowerSavingContainer.setVisibility(0);
                    C2542m.m19082a("junk_clean_finish_fragment", "jcps_show", null);
                    break;
                case 3:
                    this.mPhoneBoostContainer.setVisibility(0);
                    C2542m.m19082a("junk_clean_finish_fragment", "jcpb_show", null);
                    break;
                case 4:
                    this.mQuickBoostContainer.setVisibility(0);
                    C2542m.m19082a("junk_clean_finish_fragment", "jcqb_show", null);
                    break;
                case 5:
                    this.mAntivirusContainer.setVisibility(0);
                    C2542m.m19082a("junk_clean_finish_fragment", "jcan_show", null);
                    if (!new Random().nextBoolean()) {
                        this.mAntivirusText.setText(m17696a((int) R.string.antivirus_tip_1_1));
                        break;
                    } else {
                        this.mAntivirusText.setText(m17696a((int) R.string.antivirus_tip_1));
                        break;
                    }
                case 6:
                    this.mOpenLsContainer.setVisibility(0);
                    C2542m.m19082a("junk_clean_finish_fragment", "jcls_show", null);
                    break;
                case 7:
                    this.mOpenNotiToolBarContainer.setVisibility(0);
                    C2542m.m19082a("junk_clean_finish_fragment", "jcnt_show", null);
                    break;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) C2535e.f14680d, m17699c().getDimension(R.dimen.clean_finish_fragment_tag_size)});
        ofFloat.addUpdateListener(new by(this));
        ofFloat.addListener(new bz(this));
        ofFloat.setDuration(1000);
        m17793e();
        ofFloat.start();
    }

    private void m17793e() {
        if (ViewUtil.m18937a((Fragment) this)) {
            List arrayList = new ArrayList();
            if (this.f13263d == 0) {
                arrayList = this.f13264e.m18329c(db.JUNK1);
            } else if (this.f13263d == 1) {
                arrayList = this.f13264e.m18329c(db.PROCESS1);
            }
            m17791a(arrayList);
        }
    }

    private void m17791a(List<cv> list) {
        if (list.size() > 0) {
            cv cvVar = (cv) list.get(0);
            View d = ViewUtil.m18962d(this, cvVar, -1, (int) ((((float) C2535e.f14679c) - (m17699c().getDimension(R.dimen.gap_big) * 4.0f)) / Float.parseFloat(m17696a((int) R.string.ad_image_scale))), true);
            if (d != null) {
                View createAdView;
                if (d.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) d.getTag();
                    d.setTag(null);
                    this.f13266g.add(nativeAd);
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
                createAdView = d;
                if (createAdView instanceof C1973m) {
                    this.f13268i.add((C1973m) createAdView);
                }
                if (createAdView.getTag() instanceof ad) {
                    ad adVar = (ad) createAdView.getTag();
                    createAdView.setTag(null);
                    this.f13267h.add(adVar);
                }
                if ((createAdView instanceof NativeAppInstallAdView) || (createAdView instanceof NativeContentAdView)) {
                    this.f13269j.add(createAdView);
                    this.f13270k.add(createAdView.getTag());
                }
                this.mAdContainer.removeAllViews();
                this.mAdContainer.setVisibility(0);
                this.mAdContainer.addView(createAdView);
            }
        }
    }
}
