package utility.quickest.phonebooster.fragment;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import utility.quickest.phonebooster.view.CustomScrollView;
import com.mopub.nativeads.NativeAd;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class AntivirusFinishFragment extends BaseFragment {
    private String f13156a;
    private C2492b f13157b = C2492b.m18285a();
    private List<NativeAd> f13158c = new ArrayList();
    private List<ad> f13159d = new ArrayList();
    private List<C1973m> f13160e = new ArrayList();
    private List<View> f13161f = new ArrayList();
    private List<Object> f13162g = new ArrayList();
    private InterstitialAd f13163h = null;
    private InterstitialAd f13164i = null;
    private ig f13165j = ig.m18707a();
    private boolean f13166k = false;
    @BindView
    protected ViewGroup mActionBarBackIcon;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ViewGroup mAdContainer;
    @BindView
    protected ViewGroup mCoolingContainer;
    @BindView
    protected ImageView mFinishTag1;
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
    protected ImageView mFinishTagFloat;
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

    @OnClick
    public void doBack() {
        C2542m.m19082a("antivirus_finish_fragment", "back", null);
        getActivity().finish();
    }

    @OnClick
    public void doPowerSaving() {
        C2542m.m19082a("antivirus_finish_fragment", "power_saving", null);
        PowerSavingActivity.m17311a((Fragment) this);
        getActivity().finish();
    }

    @OnClick
    public void doCleanStorage() {
        C2542m.m19082a("antivirus_finish_fragment", "junk_clean", null);
        StorageJunkCleanActivity.m17318a((Fragment) this);
        getActivity().finish();
    }

    @OnClick
    public void doCleanMemory() {
        C2542m.m19082a("antivirus_finish_fragment", "phone_boost", null);
        MemoryJunkCleanActivity.m17300a((Fragment) this);
        getActivity().finish();
    }

    @OnClick
    public void doCPUCooling() {
        C2542m.m19082a("antivirus_finish_fragment", "cpu_cooling", null);
        CPUCoolingActivity.m17263a((Fragment) this);
        getActivity().finish();
    }

    @OnClick
    public void doOpenQuickBoost() {
        C2542m.m19082a("antivirus_finish_fragment", "qb", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            ig.m18707a().m18718e();
        }
    }

    @OnClick
    public void doOpenLs() {
        C2542m.m19082a("antivirus_finish_fragment", "open_ls", null);
        if (!ViewUtil.m18937a((Fragment) this)) {
            return;
        }
        if (this.f13165j.m18717d()) {
            Toast.makeText(getActivity(), m17696a(R.string.open_lock_screen_success), Toast.LENGTH_LONG).show();
            return;
        }
        this.f13165j.m18715c(true);
        if (!gz.m18604a() || (gz.m18604a() && gz.m18606b())) {
            Toast.makeText(getActivity(), m17696a(R.string.open_lock_screen_success), Toast.LENGTH_LONG).show();
        }
        this.f13166k = true;
    }

    @OnClick
    public void doOpenNT() {
        C2542m.m19082a("antivirus_finish_fragment", "open_nt", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            AlwaysNotiHelper.m18171a(true);
            Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
        }
    }

    public static AntivirusFinishFragment m17714a(Intent intent) {
        AntivirusFinishFragment antivirusFinishFragment = new AntivirusFinishFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_antivirus_tip_type", intent.getStringExtra("key_antivirus_tip_type"));
        antivirusFinishFragment.setArguments(bundle);
        return antivirusFinishFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13156a = arguments.getString("key_antivirus_tip_type", "");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_antivirus_finish, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarBackIcon.setVisibility(0);
        this.mActionBarTitle.setText(m17696a((int) R.string.antivirus));
        if (this.f13156a.equals(C2479p.Safe.name())) {
            this.mFinishTagContainerCleanSuccess.setText(m17696a((int) R.string.safe));
            this.mFinishTagContainerCleanSuccessFloat.setText(m17696a((int) R.string.safe));
            try {
                this.mFinishTag1.setImageResource(R.drawable.ic_antivirus_orange);
                this.mFinishTagFloat.setImageResource(R.drawable.ic_antivirus_orange);
            } catch (Throwable th) {
            }
        } else if (this.f13156a.equals(C2479p.HalfUninstall.name())) {
            this.mFinishTagContainerCleanSuccess.setText(m17696a((int) R.string.antivirus_fix_tip2));
            this.mFinishTagContainerCleanSuccessFloat.setText(m17696a((int) R.string.antivirus_fix_tip2));
            try {
                this.mFinishTag1.setImageResource(R.drawable.ic_antivirus_orange);
                this.mFinishTagFloat.setImageResource(R.drawable.ic_antivirus_orange);
            } catch (Throwable th2) {
            }
        } else if (this.f13156a.equals(C2479p.Ignore.name())) {
            this.mFinishTagContainerCleanSuccess.setText(m17696a((int) R.string.antivirus_fix_tip3));
            this.mFinishTagContainerCleanSuccessFloat.setText(m17696a((int) R.string.antivirus_fix_tip3));
            try {
                this.mFinishTag1.setImageResource(R.drawable.ic_antivirus_orange);
                this.mFinishTagFloat.setImageResource(R.drawable.ic_antivirus_orange);
            } catch (Throwable th3) {
            }
        } else {
            this.mFinishTagContainerCleanSuccess.setText(m17696a((int) R.string.antivirus_fix_tip));
            this.mFinishTagContainerCleanSuccessFloat.setText(m17696a((int) R.string.antivirus_fix_tip));
            try {
                this.mFinishTag1.setImageResource(R.drawable.ic_antivirus_green);
                this.mFinishTagFloat.setImageResource(R.drawable.ic_antivirus_green);
            } catch (Throwable th4) {
            }
        }
        this.mFinishTagContainer.getLayoutParams().height = C2535e.f14680d;
        this.mFinishTagContainer.requestLayout();
        this.mScrollView.setOnScrollListener(new C2474k(this));
        for (cv cvVar : this.f13157b.m18329c(db.ANTI_VIRUS_INTER)) {
            if (cvVar.m18409g() == null) {
                if (cvVar.m18408f() != null) {
                    this.f13164i = cvVar.m18408f();
                    break;
                }
            }
            this.f13163h = cvVar.m18409g();
            break;
        }
        cv cvVar2 = null;
        if (cvVar2 != null) {
            cvVar2.m18403a(null, null, null, new Object[0]);
        } else {
            ThreadUtil.m19098a(new C2475l(this), (long) 1000);
        }
        this.f13157b.m18328b(db.ANTI_VIRUS);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        if (this.f13166k) {
            if (this.f13165j.m18717d()) {
                Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
            }
            this.f13166k = false;
        }
    }

    public void onDestroyView() {
        for (Object next : this.f13162g) {
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
        for (View view : this.f13161f) {
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
        for (NativeAd destroy : this.f13158c) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13158c.clear();
        for (C1973m c : this.f13160e) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f13159d) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13159d.clear();
        m17715a();
        super.onDestroyView();
    }

    public void mo3084a(boolean z) {
        if (!z || (this.f13163h == null && this.f13164i == null)) {
            super.mo3084a(z);
            return;
        }
        m17715a();
        m17718d();
    }

    private void m17715a() {
        if (this.f13163h != null) {
            this.f13163h.m5786b();
            this.f13163h = null;
        }
        if (this.f13164i != null) {
            this.f13164i = null;
        }
    }

    private void m17718d() {
        System.currentTimeMillis();
        this.mJunckCleanContainer.setVisibility(8);
        this.mPhoneBoostContainer.setVisibility(8);
        this.mCoolingContainer.setVisibility(8);
        this.mPowerSavingContainer.setVisibility(8);
        this.mQuickBoostContainer.setVisibility(8);
        this.mOpenLsContainer.setVisibility(8);
        this.mOpenNotiToolBarContainer.setVisibility(8);
        this.mAdContainer.setVisibility(8);
        ho b = hh.m18633b(ho.AntiVirus);
        if (b != null) {
            switch (C2478o.f13841a[b.ordinal()]) {
                case 1:
                    this.mCoolingContainer.setVisibility(0);
                    C2542m.m19082a("antivirus_finish_fragment", "cl_show", null);
                    break;
                case 2:
                    this.mJunckCleanContainer.setVisibility(0);
                    C2542m.m19082a("antivirus_finish_fragment", "jc_show", null);
                    break;
                case 3:
                    this.mPhoneBoostContainer.setVisibility(0);
                    C2542m.m19082a("antivirus_finish_fragment", "pb_show", null);
                    break;
                case 4:
                    this.mPowerSavingContainer.setVisibility(0);
                    C2542m.m19082a("antivirus_finish_fragment", "ps_show", null);
                    break;
                case 5:
                    this.mQuickBoostContainer.setVisibility(0);
                    C2542m.m19082a("antivirus_finish_fragment", "qb_show", null);
                    break;
                case 6:
                    this.mOpenLsContainer.setVisibility(0);
                    C2542m.m19082a("antivirus_finish_fragment", "open_ls_show", null);
                    break;
                case 7:
                    this.mOpenNotiToolBarContainer.setVisibility(0);
                    C2542m.m19082a("antivirus_finish_fragment", "open_nt_show", null);
                    break;
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) C2535e.f14680d, m17699c().getDimension(R.dimen.clean_finish_fragment_tag_size)});
        ofFloat.addUpdateListener(new C2476m(this));
        ofFloat.addListener(new C2477n(this));
        ofFloat.setDuration(1000);
        m17719e();
        ofFloat.start();
    }

    private void m17719e() {
        if (ViewUtil.m18937a((Fragment) this)) {
            m17717a(this.f13157b.m18329c(db.ANTI_VIRUS));
        }
    }

    private void m17717a(List<cv> list) {
        if (list.size() > 0) {
            cv cvVar = (cv) list.get(0);
            View d = ViewUtil.m18962d(this, cvVar, -1, (int) ((((float) C2535e.f14679c) - (m17699c().getDimension(R.dimen.gap_big) * 4.0f)) / Float.parseFloat(m17696a((int) R.string.ad_image_scale))), true);
            if (d != null) {
                View createAdView;
                if (d.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) d.getTag();
                    d.setTag(null);
                    this.f13158c.add(nativeAd);
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
                    this.f13160e.add((C1973m) createAdView);
                }
                if (createAdView.getTag() instanceof ad) {
                    ad adVar = (ad) createAdView.getTag();
                    createAdView.setTag(null);
                    this.f13159d.add(adVar);
                }
                if ((createAdView instanceof NativeAppInstallAdView) || (createAdView instanceof NativeContentAdView)) {
                    this.f13161f.add(createAdView);
                    this.f13162g.add(createAdView.getTag());
                }
                this.mAdContainer.removeAllViews();
                this.mAdContainer.setVisibility(0);
                this.mAdContainer.addView(createAdView);
            }
        }
    }
}
