package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.model_helper.cx;
import utility.quickest.phonebooster.util.C2542m;
import utility.quickest.phonebooster.util.ViewUtil;

/* compiled from: PopupAdFragment */
class fc implements cx {
    final /* synthetic */ PopupAdFragment f13729a;

    fc(PopupAdFragment popupAdFragment) {
        this.f13729a = popupAdFragment;
    }

    public void mo3108a() {
        if (ViewUtil.m18937a(this.f13729a)) {
            C2542m.m19082a("popup_ad_fragment", "close", null);
            this.f13729a.getActivity().finish();
        }
    }
}
