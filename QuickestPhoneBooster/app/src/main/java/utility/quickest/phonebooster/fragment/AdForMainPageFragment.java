package utility.quickest.phonebooster.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
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
import com.facebook.ads.ad;
import com.google.android.gms.ads.C1973m;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;
import utility.quickest.phonebooster.activity.MemoryJunkCleanActivity;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hz;
import utility.quickest.phonebooster.model_helper.ie;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.CustomRiseNumberTextView;
import utility.quickest.phonebooster.view.RoundProgressBar;
import com.mopub.nativeads.NativeAd;
import com.mopub.volley.DefaultRetryPolicy;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class AdForMainPageFragment extends BaseFragment {
    private C2492b f13140a;
    private List<NativeAd> f13141b;
    private List<ad> f13142c;
    private List<C1973m> f13143d;
    private List<View> f13144e;
    private List<Object> f13145f;
    private String f13146g;
    private List<cv> f13147h;
    @BindView
    protected ViewGroup mAdContainer;
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

    @OnClick
    public void doCleanMemory() {
        C2542m.m19082a("main_fragment", "phone_boost_top", null);
        hh.m18630a("phone_boost_top");
        MemoryJunkCleanActivity.m17300a((Fragment) this);
    }

    public static AdForMainPageFragment m17708a(String str, List<cv> list) {
        AdForMainPageFragment adForMainPageFragment = new AdForMainPageFragment(list);
        Bundle bundle = new Bundle();
        bundle.putString("key_ui_type", str);
        adForMainPageFragment.setArguments(bundle);
        return adForMainPageFragment;
    }

    public AdForMainPageFragment() {
        this(null);
    }

    @SuppressLint({"ValidFragment"})
    public AdForMainPageFragment(List<cv> list) {
        this.f13140a = C2492b.m18285a();
        this.f13141b = new ArrayList();
        this.f13142c = new ArrayList();
        this.f13143d = new ArrayList();
        this.f13144e = new ArrayList();
        this.f13145f = new ArrayList();
        this.f13146g = "ui_type_none";
        this.f13147h = new ArrayList();
        if (list != null) {
            this.f13147h = list;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13146g = arguments.getString("key_ui_type", "");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ad_for_main_page, null);
        ButterKnife.m2793a(this, inflate);
        if ("ui_type_ad".equals(this.f13146g)) {
            m17709a();
        } else if ("ui_type_none".equals(this.f13146g)) {
            m17710d();
        }
        return inflate;
    }

    public void onStart() {
        super.onStart();
        m17710d();
    }

    public void onDestroyView() {
        for (Object next : this.f13145f) {
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
        for (View view : this.f13144e) {
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
        for (NativeAd destroy : this.f13141b) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13141b.clear();
        for (C1973m c : this.f13143d) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f13142c) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13142c.clear();
        super.onDestroyView();
    }

    private void m17709a() {
        if (this.f13147h != null && this.f13147h.size() > 0) {
            cv cvVar = (cv) this.f13147h.get(0);
            View b = ViewUtil.m18939b(this, cvVar, true);
            if (b != null) {
                View createAdView;
                if (b.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) b.getTag();
                    b.setTag(null);
                    this.f13141b.add(nativeAd);
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
                createAdView = b;
                if (createAdView instanceof C1973m) {
                    this.f13143d.add((C1973m) createAdView);
                }
                if (createAdView.getTag() instanceof ad) {
                    ad adVar = (ad) createAdView.getTag();
                    createAdView.setTag(null);
                    this.f13142c.add(adVar);
                }
                if ((createAdView instanceof NativeAppInstallAdView) || (createAdView instanceof NativeContentAdView)) {
                    this.f13144e.add(createAdView);
                    this.f13145f.add(createAdView.getTag());
                }
                this.mAdContainer.removeAllViews();
                this.mAdContainer.addView(createAdView);
            }
        }
    }

    private void m17710d() {
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
        }
        Pair p = C2535e.m19051p();
        long longValue = ((Long) p.first).longValue();
        long longValue2 = ((Long) p.second).longValue();
        int i = (int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) longValue) / ((float) longValue2))) * 100.0f);
        this.mCpuPercentText.setTextNumber(i);
        this.mCpuPercentText.setDuration(700);
        this.mCpuPercentText.m19191a();
        if (((long) i) >= hz.m18683a().m18692a(ie.HighMemColorGap)) {
            this.mCpuPercentProgressBar.setCricleProgressColor(m17699c().getColor(R.color.red5));
            this.mCpuPercentText.setTextColor(m17699c().getColor(R.color.red5));
            this.mCpuPercentUnit.setTextColor(m17699c().getColor(R.color.red5));
            this.mCpuPercentTag.setTextColor(m17699c().getColor(R.color.red5));
            this.mCpuDetaiButton.setBackgroundResource(R.drawable.bg_cta1);
        } else {
            this.mCpuPercentProgressBar.setCricleProgressColor(m17699c().getColor(R.color.main_color));
            this.mCpuPercentText.setTextColor(m17699c().getColor(R.color.main_color));
            this.mCpuPercentUnit.setTextColor(m17699c().getColor(R.color.main_color));
            this.mCpuPercentTag.setTextColor(m17699c().getColor(R.color.main_color));
            this.mCpuDetaiButton.setBackgroundResource(R.drawable.bg_ad_cta6);
        }
        this.mCpuPercentDetailText.setText(C2542m.m19078a("%s / %s", C2542m.m19088b(longValue2 - longValue), C2542m.m19088b(longValue2)));
        this.mCpuPercentProgressBar.setProgress((int) ((DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - (((float) longValue) / ((float) longValue2))) * 100.0f));
    }
}
