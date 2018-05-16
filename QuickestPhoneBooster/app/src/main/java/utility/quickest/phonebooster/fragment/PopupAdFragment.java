package utility.quickest.phonebooster.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.facebook.ads.ad;
import com.google.android.gms.ads.C1973m;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAdView;
import utility.quickest.phonebooster.model_helper.cv;
import utility.quickest.phonebooster.model_helper.cx;
import utility.quickest.phonebooster.util.C2535e;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;
import com.mopub.nativeads.NativeAd;
import utility.quickest.phonebooster.R;
import java.util.ArrayList;
import java.util.List;

public class PopupAdFragment extends BaseFragment {
    private List<cv> f13406a;
    private List<NativeAd> f13407b;
    private List<ad> f13408c;
    private List<C1973m> f13409d;
    private List<View> f13410e;
    private List<Object> f13411f;
    @BindView
    protected ViewGroup mAdContainer;

    @OnClick
    public void doClose() {
        if (ViewUtil.m18937a((Fragment) this)) {
            C2542m.m19082a("popup_ad_fragment", "close", null);
            getActivity().finish();
        }
    }

    public static PopupAdFragment m17847a(List<cv> list) {
        return new PopupAdFragment(list);
    }

    public PopupAdFragment() {
        this(null);
    }

    @SuppressLint({"ValidFragment"})
    public PopupAdFragment(List<cv> list) {
        this.f13406a = new ArrayList();
        this.f13407b = new ArrayList();
        this.f13408c = new ArrayList();
        this.f13409d = new ArrayList();
        this.f13410e = new ArrayList();
        this.f13411f = new ArrayList();
        if (list != null) {
            this.f13406a = list;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_popup_ad, null);
        ButterKnife.m2793a(this, inflate);
        if (!this.f13406a.isEmpty()) {
            m17848a();
        } else if (ViewUtil.m18937a((Fragment) this)) {
            getActivity().finish();
        }
        return inflate;
    }

    public void onDestroyView() {
        for (Object next : this.f13411f) {
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
        for (View view : this.f13410e) {
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
        for (NativeAd destroy : this.f13407b) {
            try {
                destroy.destroy();
            } catch (Throwable th5) {
            }
        }
        this.f13407b.clear();
        for (C1973m c : this.f13409d) {
            try {
                c.mo1949c();
            } catch (Throwable th6) {
            }
        }
        for (ad c2 : this.f13408c) {
            try {
                c2.m4085c();
            } catch (Throwable th7) {
            }
        }
        this.f13408c.clear();
        super.onDestroyView();
    }

    private void m17848a() {
        if (this.f13406a.size() > 0) {
            int dimension = (int) ((((float) C2535e.f14679c) - (m17699c().getDimension(R.dimen.gap_big) * 2.0f)) / Float.parseFloat(m17696a((int) R.string.ad_image_scale)));
            cv cvVar = (cv) this.f13406a.get(0);
            cx fcVar = new fc(this);
            View a = ViewUtil.m18923a((Fragment) this, cvVar, fcVar, -1, dimension, true);
            if (a != null) {
                View createAdView;
                View view;
                if (a.getTag() instanceof NativeAd) {
                    NativeAd nativeAd = (NativeAd) a.getTag();
                    a.setTag(null);
                    this.f13407b.add(nativeAd);
                    try {
                        createAdView = nativeAd.createAdView(getActivity(), this.mAdContainer);
                    } catch (Throwable th) {
                        createAdView = null;
                    }
                    if (createAdView != null) {
                        cvVar.m18403a(createAdView, null, fcVar, new Object[0]);
                        view = createAdView;
                    } else {
                        return;
                    }
                }
                view = a;
                if (view instanceof C1973m) {
                    this.f13409d.add((C1973m) view);
                }
                if (view.getTag() instanceof ad) {
                    this.f13408c.add((ad) view.getTag());
                }
                if ((view instanceof NativeAppInstallAdView) || (view instanceof NativeContentAdView)) {
                    this.f13410e.add(view);
                    this.f13411f.add(view.getTag());
                }
                this.mAdContainer.removeAllViews();
                this.mAdContainer.addView(view);
                if ((view instanceof NativeAppInstallAdView) || (view instanceof NativeContentAdView) || (view.getTag() instanceof ad)) {
                    createAdView = new ImageView(getActivity());
                    createAdView.setImageResource(R.drawable.ic_ad_tag_yellow_1);
                    createAdView.setClickable(true);
                    LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(11);
                    layoutParams.addRule(10);
                    createAdView.setLayoutParams(layoutParams);
                    this.mAdContainer.addView(createAdView);
                }
            }
        }
    }
}
