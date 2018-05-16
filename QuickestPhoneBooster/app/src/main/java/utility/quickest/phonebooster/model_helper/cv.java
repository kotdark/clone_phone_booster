package utility.quickest.phonebooster.model_helper;

import android.view.View;

import com.google.android.gms.ads.C1973m;

import utility.quickest.phonebooster.p114d.OwnCampaignInfo;
import utility.quickest.phonebooster.util.ThreadUtil;

import java.util.List;

/* compiled from: AdvertisementModel */
public final class cv {
    private final AdvertisementModel advertisementModel;

    public OwnCampaignInfo m18402a() {
        ThreadUtil.m19102b();
        if (this.advertisementModel instanceof cm) {
            return ((cm) this.advertisementModel).m18391h();
        }
        return null;
    }

    public C2601a m18404b() {
        ThreadUtil.m19102b();
        if (this.advertisementModel instanceof cc) {
            return ((cc) this.advertisementModel).m18363h();
        }
        return null;
    }

    public C1973m m18405c() {
        ThreadUtil.m19102b();
        if (this.advertisementModel instanceof an) {
            return ((an) this.advertisementModel).m18269h();
        }
        return null;
    }

    public com.google.android.gms.ads.formats.NativeAd m18406d() {
        ThreadUtil.m19102b();
        if (this.advertisementModel instanceof GANativeAdModel) {
            return ((GANativeAdModel) this.advertisementModel).m18257h();
        }
        return null;
    }

    public ad m18407e() {
        ThreadUtil.m19102b();
        if (this.advertisementModel instanceof bh) {
            return ((bh) this.advertisementModel).m18340h();
        }
        return null;
    }

    public com.google.android.gms.ads.InterstitialAd m18408f() {
        ThreadUtil.m19102b();
        if (this.advertisementModel instanceof C2510q) {
            return ((C2510q) this.advertisementModel).getInterstitialAd();
        }
        return null;
    }

    public com.facebook.ads.InterstitialAd m18409g() {
        ThreadUtil.m19102b();
        if (this.advertisementModel instanceof ax) {
            return ((ax) this.advertisementModel).interstitialAd();
        }
        return null;
    }

    public com.mopub.nativeads.NativeAd m18410h() {
        ThreadUtil.m19102b();
        if (this.advertisementModel instanceof bs) {
            return ((bs) this.advertisementModel).getNativeAd();
        }
        return null;
    }

    public boolean m18411i() {
        ThreadUtil.m19102b();
        return this.advertisementModel.mo3119d();
    }

    public long m18412j() {
        ThreadUtil.m19102b();
        return this.advertisementModel.f13891e;
    }

    public long m18413k() {
        ThreadUtil.m19102b();
        return this.advertisementModel.f13895i;
    }

    public boolean m18403a(View view, List<View> list, cx cxVar, Object... objArr) {
        ThreadUtil.m19102b();
        return this.advertisementModel.mo3118a(view, list, cxVar, objArr);
    }

    public cv(AdvertisementModel advertisementModel) {
        if (advertisementModel == null) {
            throw new IllegalArgumentException("adSource is null!");
        }
        this.advertisementModel = advertisementModel;
    }

    private void m18401l() {
        ThreadUtil.m19102b();
        this.advertisementModel.mo3120e();
    }
}
