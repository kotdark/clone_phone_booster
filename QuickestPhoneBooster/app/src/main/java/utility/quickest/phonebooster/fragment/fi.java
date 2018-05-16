package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.view.p115a.C2468s;
import utility.quickest.phonebooster.view.p115a.C2560f;
import com.mopub.volley.DefaultRetryPolicy;

/* compiled from: PopupMemoryJunkCleanFragment */
class fi implements C2468s {
    final /* synthetic */ PopupMemoryJunkCleanFragment f13738a;

    fi(PopupMemoryJunkCleanFragment popupMemoryJunkCleanFragment) {
        this.f13738a = popupMemoryJunkCleanFragment;
    }

    public void mo3109a(C2560f c2560f, boolean z, float f, float f2) {
        this.f13738a.mWait2.setVisibility(0);
        this.f13738a.mWait3.setVisibility(0);
        this.f13738a.m17855a(this.f13738a.mWait2, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, null);
        this.f13738a.m17855a(this.f13738a.mWait3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT, new fj(this));
    }
}
