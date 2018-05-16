package utility.quickest.phonebooster.fragment;

import utility.quickest.phonebooster.util.ViewUtil;

/* compiled from: LockedScreenFragmentWithAd */
class cy implements Runnable {
    final /* synthetic */ LockedScreenFragmentWithAd f13625a;

    cy(LockedScreenFragmentWithAd lockedScreenFragmentWithAd) {
        this.f13625a = lockedScreenFragmentWithAd;
    }

    public void run() {
        if (ViewUtil.m18937a(this.f13625a)) {
            this.f13625a.getActivity().finish();
        }
    }
}
