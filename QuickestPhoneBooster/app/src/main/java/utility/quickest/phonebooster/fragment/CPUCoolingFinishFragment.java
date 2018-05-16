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
import com.mopub.nativeads.NativeAd;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CPUCoolingFinishFragment extends BaseFragment {
    private C2492b f13197a = C2492b.m18285a();
    private String f13198b;
    private List<NativeAd> f13199c = new ArrayList();
    private List<ad> f13200d = new ArrayList();
    private List<C1973m> f13201e = new ArrayList();
    private List<View> f13202f = new ArrayList();
    private List<Object> f13203g = new ArrayList();
    private InterstitialAd f13204h = null;
    private InterstitialAd f13205i = null;
    private ig f13206j = ig.m18707a();
    private boolean f13207k = false;
    @BindView
    protected ViewGroup mActionBar;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ViewGroup mAdContainer;
    @BindView
    protected ViewGroup mAdContainer1;
    @BindView
    protected ViewGroup mAdContainerContainer;
    @BindView
    protected ViewGroup mAntivirusContainer;
    @BindView
    protected TextView mAntivirusText;
    @BindView
    protected TextView mFinishTag;
    @BindView
    protected TextView mFinishTagFloat;
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
    protected CustomCircularProgress1 mProgress;
    @BindView
    protected ViewGroup mQuickBoostContainer;
    @BindView
    protected ViewGroup mTagContainer;
    @BindView
    protected ViewGroup mTagContainerFloat;

    @OnClick
    public void doBack() {
        if (ViewUtil.m18937a((Fragment) this)) {
            C2542m.m19082a("cpu_cooling_finish_fragment", "back", null);
            getActivity().finish();
        }
    }

    @OnClick
    public void doPowerSaving() {
        C2542m.m19082a("cpu_cooling_finish_fragment", "ps", null);
        PowerSavingActivity.m17311a((Fragment) this);
        getActivity().finish();
    }

    @OnClick
    public void doCleanStorage() {
        C2542m.m19082a("cpu_cooling_finish_fragment", "jc", null);
        StorageJunkCleanActivity.m17318a((Fragment) this);
        getActivity().finish();
    }

    @OnClick
    public void doCleanMemory() {
        C2542m.m19082a("cpu_cooling_finish_fragment", "pb", null);
        MemoryJunkCleanActivity.m17300a((Fragment) this);
        getActivity().finish();
    }

    @OnClick
    public void doAntivirus() {
        C2542m.m19082a("cpu_cooling_finish_fragment", "an", null);
        AntivirusActivity.m17258a((Fragment) this);
        getActivity().finish();
    }

    @OnClick
    public void doOpenQuickBoost() {
        C2542m.m19082a("cpu_cooling_finish_fragment", "qb", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            ig.m18707a().m18718e();
        }
    }

    @OnClick
    public void doOpenLs() {
        C2542m.m19082a("cpu_cooling_finish_fragment", "ls", null);
        if (!ViewUtil.m18937a((Fragment) this)) {
            return;
        }
        if (this.f13206j.m18717d()) {
            Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
            return;
        }
        this.f13206j.m18715c(true);
        if (!gz.m18604a() || (gz.m18604a() && gz.m18606b())) {
            Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
        }
        this.f13207k = true;
    }

    @OnClick
    public void doOpenNT() {
        C2542m.m19082a("cpu_cooling_finish_fragment", "nt", null);
        if (ViewUtil.m18937a((Fragment) this)) {
            AlwaysNotiHelper.m18171a(true);
            Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
        }
    }

    public static CPUCoolingFinishFragment m17745a(Intent intent) {
        CPUCoolingFinishFragment cPUCoolingFinishFragment = new CPUCoolingFinishFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_tag_string", intent.getStringExtra("key_tag_string"));
        cPUCoolingFinishFragment.setArguments(bundle);
        return cPUCoolingFinishFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13198b = arguments.getString("key_tag_string", "");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_cpu_cooling_finish, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarTitle.setText(m17696a((int) R.string.cpu_cooling));
        this.mFinishTag.setText(this.f13198b);
        this.mFinishTagFloat.setText(this.f13198b);
        this.mAdContainerContainer.setVisibility(8);
        for (cv cvVar : this.f13197a.m18329c(db.PROCESS_INTER)) {
            if (cvVar.m18409g() == null) {
                if (cvVar.m18408f() != null) {
                    this.f13205i = cvVar.m18408f();
                    break;
                }
            }
            this.f13204h = cvVar.m18409g();
            break;
        }
        cv cvVar2 = null;
        if (cvVar2 != null) {
            cvVar2.m18403a(null, null, null, new Object[0]);
        } else {
            this.mProgress.m19180a();
            ThreadUtil.m19098a(new aj(this), 2100);
        }
        this.f13197a.m18328b(db.CPU_COOL);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        if (this.f13207k) {
            if (this.f13206j.m18717d()) {
                Toast.makeText(getActivity(), m17696a((int) R.string.open_lock_screen_success), 1).show();
            }
            this.f13207k = false;
        }
    }

    public void onDestroyView() {
        m17752d();
        m17747a();
        super.onDestroyView();
    }

    public void mo3084a(boolean z) {
        if (!z || (this.f13204h == null && this.f13205i == null)) {
            super.mo3084a(z);
            return;
        }
        m17747a();
        this.mProgress.m19180a();
        ThreadUtil.m19098a(new al(this), 2100);
    }

    private void m17747a() {
        if (this.f13204h != null) {
            this.f13204h.m5786b();
            this.f13204h = null;
        }
        if (this.f13205i != null) {
            this.f13205i = null;
        }
    }

    private void m17749a(List<cv> list) {
        if (ViewUtil.m18937a((Fragment) this) && list.size() > 0) {
            this.mJunckCleanContainer.setVisibility(8);
            this.mPhoneBoostContainer.setVisibility(8);
            this.mPowerSavingContainer.setVisibility(8);
            this.mAntivirusContainer.setVisibility(8);
            this.mQuickBoostContainer.setVisibility(8);
            this.mOpenLsContainer.setVisibility(8);
            this.mOpenNotiToolBarContainer.setVisibility(8);
            ho b = hh.m18633b(ho.Cpu);
            if (b != null) {
                switch (aq.f13528a[b.ordinal()]) {
                    case 1:
                        this.mJunckCleanContainer.setVisibility(0);
                        C2542m.m19082a("cpu_cooling_finish_fragment", "jc_show", null);
                        break;
                    case 2:
                        this.mPhoneBoostContainer.setVisibility(0);
                        C2542m.m19082a("cpu_cooling_finish_fragment", "pb_show", null);
                        break;
                    case 3:
                        this.mPowerSavingContainer.setVisibility(0);
                        C2542m.m19082a("cpu_cooling_finish_fragment", "ps_show", null);
                        break;
                    case 4:
                        this.mAntivirusContainer.setVisibility(0);
                        C2542m.m19082a("cpu_cooling_finish_fragment", "an_show", null);
                        if (!new Random().nextBoolean()) {
                            this.mAntivirusText.setText(m17696a((int) R.string.antivirus_tip_1_1));
                            break;
                        } else {
                            this.mAntivirusText.setText(m17696a((int) R.string.antivirus_tip_1));
                            break;
                        }
                    case 5:
                        this.mQuickBoostContainer.setVisibility(0);
                        C2542m.m19082a("cpu_cooling_finish_fragment", "qb_show", null);
                        break;
                    case 6:
                        this.mOpenLsContainer.setVisibility(0);
                        C2542m.m19082a("cpu_cooling_finish_fragment", "ls_show", null);
                        break;
                    case 7:
                        this.mOpenNotiToolBarContainer.setVisibility(0);
                        C2542m.m19082a("cpu_cooling_finish_fragment", "nt_show", null);
                        break;
                }
            }
            m17751b((List) list);
            this.mTagContainerFloat.setVisibility(4);
            this.mAdContainerContainer.setVisibility(0);
            int measuredHeight = this.mActionBar.getMeasuredHeight();
            int measuredHeight2 = this.mTagContainer.getMeasuredHeight();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) C2535e.f14680d, (float) measuredHeight});
            ofFloat.addUpdateListener(new an(this, measuredHeight2));
            ofFloat.addListener(new ao(this));
            ofFloat.setDuration(1000);
            ofFloat.start();
        }
    }

    private void m17751b(List<cv> list) {
        if (list.size() > 0) {
            cv cvVar = (cv) list.get(0);
            View c = ViewUtil.m18951c(this, cvVar, -1, (int) ((((float) C2535e.f14679c) - (m17699c().getDimension(R.dimen.gap_normal) * 2.0f)) / Float.parseFloat(m17696a((int) R.string.ad_image_scale))), true);
            if (c != null) {
                View createAdView;
                if (c.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) c.getTag();
                    c.setTag(null);
                    this.f13199c.add(nativeAd);
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
                createAdView = c;
                if (createAdView instanceof C1973m) {
                    this.f13201e.add((C1973m) createAdView);
                }
                if (createAdView.getTag() instanceof ad) {
                    View findViewById = createAdView.findViewById(R.id.ad_close);
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new ap(this));
                    }
                    ad adVar = (ad) createAdView.getTag();
                    createAdView.setTag(null);
                    this.f13200d.add(adVar);
                }
                if ((createAdView instanceof NativeAppInstallAdView) || (createAdView instanceof NativeContentAdView)) {
                    this.f13202f.add(createAdView);
                    this.f13203g.add(createAdView.getTag());
                }
                this.mAdContainer.removeAllViews();
                this.mAdContainer.addView(createAdView);
            }
        }
    }

    private void m17752d() {
        for (Object next : this.f13203g) {
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
        for (View view : this.f13202f) {
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
        for (NativeAd destroy : this.f13199c) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13199c.clear();
        for (C1973m c : this.f13201e) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f13200d) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13200d.clear();
    }
}
