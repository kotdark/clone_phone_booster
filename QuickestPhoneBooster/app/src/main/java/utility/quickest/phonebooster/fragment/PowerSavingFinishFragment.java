package utility.quickest.phonebooster.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
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
import utility.quickest.phonebooster.model_helper.C2492b;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.db;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ThreadUtil;
import utility.quickest.phonebooster.util.ViewUtil;
import utility.quickest.phonebooster.view.CustomCircularProgress1;
import com.mopub.nativeads.NativeAd;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class PowerSavingFinishFragment extends BaseFragment {
    private C2492b f13426a = C2492b.m18285a();
    private String f13427b;
    private List<NativeAd> f13428c = new ArrayList();
    private List<ad> f13429d = new ArrayList();
    private List<C1973m> f13430e = new ArrayList();
    private List<View> f13431f = new ArrayList();
    private List<Object> f13432g = new ArrayList();
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected TextView mActionBarTitle1;
    @BindView
    protected ViewGroup mAdContainer;
    @BindView
    protected ViewGroup mAdContainerContainer;
    @BindView
    protected TextView mFinishTag;
    @BindView
    protected CustomCircularProgress1 mProgress;
    @BindView
    protected ViewGroup mTagContainer;

    @OnClick
    public void doBack() {
        if (ViewUtil.m18937a((Fragment) this)) {
            C2542m.m19082a("power_saving_finish_fragment", "back", null);
            getActivity().finish();
        }
    }

    public static PowerSavingFinishFragment m17865a(Intent intent) {
        PowerSavingFinishFragment powerSavingFinishFragment = new PowerSavingFinishFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_tag_string", intent.getStringExtra("key_tag_string"));
        powerSavingFinishFragment.setArguments(bundle);
        return powerSavingFinishFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13427b = arguments.getString("key_tag_string", "");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_power_saving_finish, null);
        ButterKnife.m2793a(this, inflate);
        this.mActionBarTitle.setText(m17696a((int) R.string.power_saving));
        this.mActionBarTitle1.setText(m17696a((int) R.string.power_saving));
        this.mFinishTag.setText(this.f13427b);
        this.mTagContainer.setVisibility(0);
        this.mAdContainerContainer.setVisibility(8);
        this.mProgress.m19180a();
        ThreadUtil.m19098a(new fp(this), 2100);
        this.f13426a.m18328b(db.SAVE_POWER);
        return inflate;
    }

    public void onDestroyView() {
        for (Object next : this.f13432g) {
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
        for (View view : this.f13431f) {
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
        for (NativeAd destroy : this.f13428c) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13428c.clear();
        for (C1973m c : this.f13430e) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f13429d) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13429d.clear();
        super.onDestroyView();
    }

    private void m17868a(List<cv> list) {
        if (ViewUtil.m18937a((Fragment) this) && list.size() > 0) {
            this.mTagContainer.setVisibility(8);
            this.mAdContainerContainer.setVisibility(0);
            m17869b(list);
            Animation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) C2535e.f14680d, 0.0f);
            translateAnimation.setDuration(1000);
            this.mAdContainer.setAnimation(translateAnimation);
            translateAnimation.start();
        }
    }

    private void m17869b(List<cv> list) {
        if (list.size() > 0) {
            cv cvVar = (cv) list.get(0);
            View b = ViewUtil.m18938b(this, cvVar, -1, (int) ((((float) C2535e.f14679c) - (m17699c().getDimension(R.dimen.gap_normal) * 2.0f)) / Float.parseFloat(m17696a((int) R.string.ad_image_scale))), true);
            if (b != null) {
                View createAdView;
                if (b.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) b.getTag();
                    b.setTag(null);
                    this.f13428c.add(nativeAd);
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
                    this.f13430e.add((C1973m) createAdView);
                }
                if (createAdView.getTag() instanceof ad) {
                    ad adVar = (ad) createAdView.getTag();
                    createAdView.setTag(null);
                    this.f13429d.add(adVar);
                }
                if ((createAdView instanceof NativeAppInstallAdView) || (createAdView instanceof NativeContentAdView)) {
                    this.f13431f.add(createAdView);
                    this.f13432g.add(createAdView.getTag());
                }
                this.mAdContainer.removeAllViews();
                this.mAdContainer.addView(createAdView);
            }
        }
    }
}
