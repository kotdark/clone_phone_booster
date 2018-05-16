package utility.quickest.phonebooster.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.facebook.ads.ad;
import com.google.android.gms.ads.C1973m;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;
import utility.quickest.phonebooster.model_helper.BatteryModel;
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.fj;
import utility.quickest.phonebooster.model_helper.fk;
import utility.quickest.phonebooster.model_helper.hh;
import utility.quickest.phonebooster.model_helper.hn;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.BatteryView1;
import com.mopub.nativeads.NativeAd;
import utility.quickest.phonebooster.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FakePopupLsFragment extends BaseFragment {
    private BatteryModel f13243a;
    private C2492b f13244b;
    private SimpleDateFormat f13245c;
    private SimpleDateFormat f13246d;
    private List<cv> f13247e;
    private List<NativeAd> f13248f;
    private List<ad> f13249g;
    private List<C1973m> f13250h;
    private List<View> f13251i;
    private List<Object> f13252j;
    private final fj f13253k;
    @BindView
    protected ViewGroup mLockScreenAdContainer;
    @BindView
    protected BatteryView1 mLockScreenBattery;
    @BindView
    protected View mLockScreenBg01;
    @BindView
    protected View mLockScreenBg02;
    @BindView
    protected View mLockScreenBg03;
    @BindView
    protected ViewGroup mLockScreenBottomContainer;
    @BindView
    protected TextView mLockScreenDate;
    @BindView
    protected TextView mLockScreenTime;

    public static FakePopupLsFragment m17782a(List<cv> list) {
        return new FakePopupLsFragment(list);
    }

    public FakePopupLsFragment() {
        this(null);
    }

    @SuppressLint({"ValidFragment"})
    public FakePopupLsFragment(List<cv> list) {
        this.f13243a = BatteryModel.m18196a();
        this.f13244b = C2492b.m18285a();
        this.f13245c = new SimpleDateFormat("E dd/MM");
        this.f13246d = new SimpleDateFormat("HH:mm");
        this.f13248f = new ArrayList();
        this.f13249g = new ArrayList();
        this.f13250h = new ArrayList();
        this.f13251i = new ArrayList();
        this.f13252j = new ArrayList();
        this.f13253k = new bq(this);
        if (list != null) {
            this.f13247e = list;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fake_popup_ls, null);
        ButterKnife.m2793a(this, inflate);
        this.mLockScreenBg01.setLayoutParams(new LayoutParams(-1, (int) ((((float) C2535e.f14680d) / 1920.0f) * 460.0f)));
        this.mLockScreenBg02.setLayoutParams(new LayoutParams(-1, (int) ((((float) C2535e.f14680d) / 1920.0f) * 864.0f)));
        this.mLockScreenBg03.setLayoutParams(new LayoutParams(-1, (int) ((((float) C2535e.f14680d) / 1920.0f) * 596.0f)));
        int i = (int) ((((float) C2535e.f14680d) / 1920.0f) * 160.0f);
        this.mLockScreenAdContainer.setPadding(0, i, 0, i / 3);
        if (hn.STYLE_A.equals(hh.m18645j())) {
            this.mLockScreenBg01.setBackgroundColor(-12894382);
            this.mLockScreenBg02.setBackgroundColor(-14078919);
            this.mLockScreenBg03.setBackgroundColor(-12894382);
        } else {
            this.mLockScreenBg01.setBackgroundColor(-9470785);
            this.mLockScreenBg02.setBackgroundColor(-11708539);
            this.mLockScreenBg03.setBackgroundColor(-9470785);
        }
        m17783a();
        return inflate;
    }

    public void onStart() {
        super.onStart();
        this.f13243a.m18214a(this.f13253k, fk.VERY_FAST);
        this.mLockScreenDate.setText(this.f13245c.format(new Date()));
        this.mLockScreenTime.setText(this.f13246d.format(new Date()));
        this.mLockScreenBattery.setmCurrentEnegryPercent(this.f13243a.m18215b().m17663a());
        this.mLockScreenBattery.setmIsCharging(this.f13243a.m18215b().m17664b());
    }

    public void onStop() {
        super.onStop();
        this.f13243a.m18213a(this.f13253k);
    }

    public void onDestroyView() {
        for (Object next : this.f13252j) {
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
        for (View view : this.f13251i) {
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
        for (NativeAd destroy : this.f13248f) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13248f.clear();
        for (C1973m c : this.f13250h) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f13249g) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13249g.clear();
        super.onDestroyView();
    }

    private void m17783a() {
        if (this.f13247e != null && this.f13247e.size() != 0) {
            cv cvVar = (cv) this.f13247e.get(0);
            View a = ViewUtil.m18924a((Fragment) this, cvVar, false);
            if (a != null) {
                View createAdView;
                if (a.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) a.getTag();
                    a.setTag(null);
                    this.f13248f.add(nativeAd);
                    try {
                        createAdView = nativeAd.createAdView(getActivity(), this.mLockScreenAdContainer);
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
                    this.f13250h.add((C1973m) createAdView);
                }
                if (createAdView.getTag() instanceof ad) {
                    this.f13249g.add((ad) createAdView.getTag());
                }
                if ((createAdView instanceof NativeAppInstallAdView) || (createAdView instanceof NativeContentAdView)) {
                    this.f13251i.add(createAdView);
                    this.f13252j.add(createAdView.getTag());
                }
                this.mLockScreenAdContainer.removeAllViews();
                this.mLockScreenAdContainer.addView(createAdView);
                if (createAdView.getTag() instanceof ad) {
                    View imageView = new ImageView(getActivity());
                    imageView.setImageResource(R.drawable.ic_ad_tag_yellow_1);
                    imageView.setClickable(true);
                    ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(11);
                    layoutParams.addRule(10);
                    imageView.setLayoutParams(layoutParams);
                    this.mLockScreenAdContainer.addView(imageView);
                }
            }
        }
    }
}
