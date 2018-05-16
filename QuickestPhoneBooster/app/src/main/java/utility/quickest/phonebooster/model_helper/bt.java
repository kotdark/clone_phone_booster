package utility.quickest.phonebooster.model_helper;

import android.view.View;
import utility.quickest.phonebooster.util.ThreadUtil;
import com.mopub.nativeads.NativeAd.MoPubNativeEventListener;

/* compiled from: AdvertisementModel */
class bt implements MoPubNativeEventListener {
    final /* synthetic */ bs f14006a;

    bt(bs bsVar) {
        this.f14006a = bsVar;
    }

    public void onImpression(View view) {
    }

    public void onClick(View view) {
        ThreadUtil.m19099a(false, new bu(this));
    }
}
